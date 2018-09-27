package http_client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class AsyncSend {

	public AsyncSend() {
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		      .uri(URI.create("http://openjdk.java.net/"))
		      .build();
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		      .thenApply(HttpResponse::body)
		      .thenAccept(this::consumeString)
		      .join();
	}
	
	private void consumeString(String str) {
		System.out.println("Thread: " + Thread.currentThread().getName());
		System.out.println("Length: "+str.length());
		
		List<String> collected = str.lines().collect(Collectors.toList());
		
		System.out.println();
		System.out.println(collected.get(0));
		System.out.println(collected.get(1));
		System.out.println(collected.get(2));
	}
	
	public static void main(String... args) {
		new AsyncSend();
	}
}
