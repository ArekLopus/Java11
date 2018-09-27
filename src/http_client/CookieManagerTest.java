package http_client;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class CookieManagerTest {
	
	public CookieManagerTest() throws IOException, InterruptedException {
		
		CookieManager cookieManager = new CookieManager(null, CookiePolicy.ACCEPT_ALL);
		
		HttpClient client = HttpClient.newBuilder()
				.cookieHandler(cookieManager)
				.build();
		
		HttpRequest request = HttpRequest.newBuilder()
		      //.uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
		      .uri(URI.create("http://www.google.com"))
		      .build();
		
		HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("Status Code: "+res.statusCode());
		
		CookieStore cookieStore = cookieManager.getCookieStore();
		
		System.out.println(client.cookieHandler().get());
		System.out.println("cookieStore: " + cookieStore.getCookies());
		
		Map<String, List<String>> map = cookieManager.get(URI.create("http://www.google.com"), request.headers().map());
		System.out.println("cookieManager: " + map);
	}
	
	
	public static void main(String... args) throws IOException, InterruptedException {
		new CookieManagerTest();
	}
}
