package http_client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.net.http.WebSocket.Builder;
import java.net.http.WebSocket.Listener;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//https://dzone.com/articles/java-11-standardized-http-client-api
public class WebSocketTest {
	
	private ExecutorService executor = Executors.newFixedThreadPool(4);
	
	public WebSocketTest() throws InterruptedException {
		
		HttpClient httpClient = HttpClient.newBuilder().executor(executor).build();
		
		Builder webSocketBuilder = httpClient.newWebSocketBuilder();
		WebSocket webSocket = webSocketBuilder.buildAsync(URI.create("wss://echo.websocket.org"), new WebSocket.Listener() {
		    @Override
		    public void onOpen(WebSocket webSocket) {
		    	System.out.println("CONNECTED");
		        webSocket.sendText("This is a message", true);
		        Listener.super.onOpen(webSocket);
		    }
		    @Override
		    public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
		    	System.out.println("onText received with data " + data);
		        if(!webSocket.isOutputClosed()) {
		            webSocket.sendText("This is a message", true);
		        }
		        return Listener.super.onText(webSocket, data, last);
		    }
		    @Override
		    public CompletionStage<?> onClose(WebSocket webSocket, int statusCode, String reason) {
		    	System.out.println("Closed with status " + statusCode + ", reason: " + reason);
		        executor.shutdown();
		        return Listener.super.onClose(webSocket, statusCode, reason);
		    }
		}).join();
		System.out.println("WebSocket created");
		Thread.sleep(1000);
		webSocket.sendClose(WebSocket.NORMAL_CLOSURE, "ok").thenRun(() -> System.out.println("Sent close")); 
	}
	
	public static void main(String... args) throws InterruptedException {
		new WebSocketTest();
	}
}
