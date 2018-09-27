package http_client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class TestPOST {

	public TestPOST() throws Exception {
		
		HttpClient client = HttpClient.newHttpClient();
		
		//Response response = client.target("http://services.groupkt.com/country/get/iso2code/PL").request().get();
		HttpRequest req = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/posts"))
			.version(HttpClient.Version.HTTP_2)
			.POST(HttpRequest.BodyPublishers.ofString("{'id':'102', 'userId':'12', 'title':'Title', 'body':'body'}"))
			.build();
		
		HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status Code: "+res.statusCode());		//201 Created
		System.out.println("Headers: "+res.headers().map());
		System.out.println("Version:  "+res.version());
		System.out.println("Body:\n"+res.body());
	}

	public static void main(String[] args) throws Exception {
		new TestPOST();

	}

}
