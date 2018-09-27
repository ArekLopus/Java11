package http_client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AsyncSend2 {

	public AsyncSend2() {
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		      .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
		      .build();
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		      .thenApply(HttpResponse::body)
		      .thenAccept(this::consumeString)
		      .join();
	}
	
	private void consumeString(String str) {
		System.out.println("Thread: " + Thread.currentThread().getName());
		System.out.println("Length: "+str.length());
		
		System.out.println(str);
		
	}
	
	public static void main(String... args) {
		new AsyncSend2();
	}
}
