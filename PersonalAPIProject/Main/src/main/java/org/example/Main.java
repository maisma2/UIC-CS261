package org.example;

import okhttp3.*;

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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter API key");
        apiKey = in.nextLine();
        System.out.println("Choose from the options below \n " +
                "1. Convert a word document to a pdf document \n " +
                "2. Convert a pdf document to a word document \n " +
                "3. Convert a png image to a jpg img \n " +
                "4. Convert a jpg image to a png img \n ");
        int choice = 0;

        choice = in.nextInt();
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
        }
    }
}