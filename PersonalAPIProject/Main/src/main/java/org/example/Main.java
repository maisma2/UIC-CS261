package org.example;

import okhttp3.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.IOException;
import java.util.Scanner;

/* Creating a program that will convert a word document to a pdf document. First attempt at making a program that
will rely on a third party api, in this case API2Convert which gives 30 free conversions a day.
 */

public class Main {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static String apiKey;
    final OkHttpClient client = new OkHttpClient();

    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .header("x-oc-api-key", apiKey)
                .header("Content-Type", "application/json")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    String get(String url) throws IOException{
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        JSONObject jsonObject = new JSONObject();
        System.out.println("Enter API key");
        apiKey = in.nextLine();
        System.out.println("Choose from the options below \n " +
                "1. Convert a word document to a pdf document \n " +
                "2. Convert a pdf document to a word document \n " +
                "3. Convert a png image to a jpg img \n " +
                "4. Convert a jpg image to a png img \n ");

        int choice = in.nextInt();
        Main maininstance = new Main();
        switch(choice){
            case 4:
                String jsonPayload = "{"
                        + "\"input\": [{"
                        + "\"type\": \"remote\","
                        + "\"source\": \"https://png.pngtree.com/png-clipart/20190515/original/pngtree-instagram-social-media-icon-png-image_3572487.jpg\""
                        + "}],"
                        + "\"conversion\": [{"
                        + "\"category\": \"image\","
                        + "\"target\": \"jpg\","
                        + "\"options\": {"
                        + "\"resize\": \"800x800\","
                        + "\"quality\": 90"
                        + "\"target_format\": \"jpg\""
                        + "}"
                        + "}]"
                        + "}";
            try {
                String response = maininstance.post("https://api.api2convert.com/v2/jobs", jsonPayload);
                Thread.sleep(10000);
                Object obj = JSONValue.parse(response);
                JSONArray array = (JSONArray)obj;
            } catch (IOException e) {
                System.out.println("Error, IOException");
            }


        }
    }


}