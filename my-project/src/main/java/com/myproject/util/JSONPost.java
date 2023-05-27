package com.myproject.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;

public class JSONPost {
	 private String url;
	    private Map<String, Object> output;

	    private int responseCode;
	    private String response;

	    public JSONPost(String url, Map<String, Object> output) {
	        if (url == null || url.equals("") || output == null) {
	            throw new IllegalArgumentException();
	        }
	        this.url = url;
	        this.output = output;
	    }

	    public void doPost() throws IOException {
	        URL object = new URL(url);

	        HttpURLConnection con = (HttpURLConnection) object.openConnection();
	        con.setDoOutput(true);
	        con.setDoInput(true);
	        con.setRequestProperty("Content-Type", "application/json");
	        con.setRequestProperty("Accept", "application/json");
	        con.setRequestMethod("POST");


	        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
	        wr.write(new Gson().toJson(output));
	        wr.flush();

	        responseCode = con.getResponseCode();

	        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	        String inputLine;
	        StringBuffer responseBuffer = new StringBuffer();

	        while ((inputLine = in.readLine()) != null) {
	            responseBuffer.append(inputLine);
	        }
	        in.close();

	        this.response = responseBuffer.toString();

	    }

	    public int getResponseCode() {
	        return responseCode;
	    }

	    public String getResponse() {
	        return response;
	    }
}
