package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestCharSearch {
    public static void main(String[] args) {

        BufferedReader br = null;
        try{

            String urlstr ="https://api.neople.co.kr/df/servers/cain/characters/1c4f9f2c1a018532d708c295a67ae1f7?apikey=7l4hTjZJvExh1bPvhdocx01wA8bBLWxb";
            URL url = new URL(urlstr);
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
            urlconnection.setRequestMethod("POST");
            br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
            String result = "";
            String line;
            while((line = br.readLine()) != null) {
                result = result + line + "\n";
            }
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
