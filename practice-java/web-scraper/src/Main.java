import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
    //Download Webs
    //start url
    String link = "https://www.bbc.com/";
    //objectUrl
        URL url = new URL(link);
    //Conexión:
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    //download header content
    String encoding = conn.getContentEncoding();
    //download information
        InputStream input = conn.getInputStream();
        String result = new BufferedReader(new InputStreamReader(input))
                .lines().collect(Collectors.joining());
        System.out.println(result);
    }
}