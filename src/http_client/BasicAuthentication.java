package http_client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BasicAuthentication {

	public BasicAuthentication() throws Exception {
		
		HttpClient client = HttpClient.newBuilder()
				.version(Version.HTTP_2)
			    .authenticator(new Authenticator() {
			        @Override
			        protected PasswordAuthentication getPasswordAuthentication() {
			            return new PasswordAuthentication("postman", "password".toCharArray());
			        }
			    })
			    .build();
		
		HttpRequest req = HttpRequest.newBuilder(URI.create("https://postman-echo.com/basic-auth"))
			.version(HttpClient.Version.HTTP_2)
			.GET()
			.build();
		
		HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status Code: "+res.statusCode());
		System.out.println("Headers: "+res.headers().map());
		System.out.println("Version: "+res.version());
		System.out.println("Body:    "+res.body());
	}

	public static void main(String[] args) throws Exception {
		new BasicAuthentication();

	}

}
