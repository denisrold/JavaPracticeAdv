import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
    //Download Webs
        List<String> links = new ArrayList<>();
        links.add("https://www.bbc.com/news/world-europe-66843991");
        links.add("https://www.bbc.com/news/live/business-66881282");
        links.add("https://www.bbc.com/news/66870559");
        links.add("https://www.bbc.com/worklife/article/20230920-zoom-and-grindr-return-to-office-techs-surprising-remote-work-u-turn");
        links.add("https://www.bbc.com/news/business-66881306");
        links.add("https://www.bbc.com/news/world-europe-66843991");
        links.add("https://www.bbc.com/news/uk-66879181");
        links.add("https://www.bbc.com/sport/live/football/66687718");

        Long timeStart = System.nanoTime();
        //paralel mejora la codificacion de cada web.
        links.stream().parallel().forEach(link-> getWebContent(link));
        Long timeEnd = System.nanoTime();
        System.out.println("Diference: " + (timeEnd - timeStart));

        //start url
    String link = "https://www.bbc.com/";
    String result = getWebContent(link);
       // System.out.println(result);
    }
    private static String getWebContent(String link) {
        try{
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
            return result;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        };
        return "";
    };
}