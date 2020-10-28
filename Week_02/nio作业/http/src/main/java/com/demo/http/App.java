package com.demo.http;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class App 
{
	public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("http://localhost:8801").build();
        Response response = client.newCall(request).execute();
        String result = response.body().string();
        System.out.println(result);
    }
}
