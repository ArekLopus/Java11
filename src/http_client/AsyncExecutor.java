package http_client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncExecutor {
	
	private ExecutorService executor = Executors.newFixedThreadPool(16);
	
	public AsyncExecutor() {
		
		HttpClient client = HttpClient.newBuilder()
				.executor(executor)
				.build();
		
		HttpRequest request = HttpRequest.newBuilder()
		      .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
		      .build();
		
		System.out.println(client.executor().get());
		
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		      .thenApplyAsync(HttpResponse::body)
		      .thenAcceptAsync(this::consumeString)
		      .join();
		
		executor.shutdown();
		System.out.println(client.executor().get());	//See completed tasks.
		
	}
	
	private void consumeString(String str) {
		System.out.println("Thread: " + Thread.currentThread().getName());
		System.out.println("Length: "+str.length());
		
		System.out.println(str);
		
	}
	
	public static void main(String... args) {
		new AsyncExecutor();
	}
}
