package org.example;

import okhttp3.*;
import com.fasterxml.jackson.*;

import java.io.IOException;
import java.util.Scanner;

/* Creating a program that will convert a jpg to png and vice versa
    Uses imgBB for photo upload and API2Convert for conversion
    Uses jackson for JSON parson and okhttp3 for http requests
 */

public class Main {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    protected static String apiKey;
    protected static String imgBBKey;
    final OkHttpClient client = new OkHttpClient();

    String post(String url, String json) throws IOException { //Posting to API what to convert
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

        System.out.println("Enter API2Convert key");
        apiKey = in.nextLine();
        System.out.println("Enter imgBB key");
        imgBBKey = in.nextLine();

        System.out.println("Local file (1) or URL (2)?");
        int choice = in.nextInt();
        if (choice == 1){ //Can probably be converted to parse string for http to determine
            System.out.println("File path");
            String filePath = in.nextLine();
        }
        else{
            System.out.println("URL");
            String url = in.nextLine();
        }






    }


}