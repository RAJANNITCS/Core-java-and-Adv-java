// WAP to demostrating HttpCient api 

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;


public class HttpClientExample {
     public static void main(String[] args) throws Exception {

       // Create HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Build HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://google.com")) // Set URI
                .GET()                               // HTTP GET method
                .build();                            // Build request

        // Send request and get response
        HttpResponse<String> response =
                client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString() // Correct handler
                );

        // Print response body
        System.out.println(response.body());
    }
}