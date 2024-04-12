import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
		String urlGitHub = "https://raw.githubusercontent.com/LearnWebCode/json-example/master/animals-3.json";
		
        // Define the URL you want to send the request to
        URL url = new URL(urlGitHub);

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET
        connection.setRequestMethod("GET");

        // Read the response
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine+"\n");
			
			
        }

        in.close();

        // Print the response
        System.out.println(response.toString());
		

        // Close the connection
        connection.disconnect();
    }
}
