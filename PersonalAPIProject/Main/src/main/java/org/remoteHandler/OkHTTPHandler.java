package org.remoteHandler;
/*
import okhttp3.*;

import java.io.IOException;

//Uses default OkHTTPHandler from https://square.github.io/okhttp/
public class OkHTTPHandler {
    public static final MediaType JSON = MediaType.get("application/json");

    public static final OkHttpClient client = new OkHttpClient();

    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
*/

public class OkHTTPHandler {
    public static void post(){}
}