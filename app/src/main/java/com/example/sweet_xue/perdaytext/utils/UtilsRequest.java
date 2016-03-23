package com.example.sweet_xue.perdaytext.utils;

import com.example.sweet_xue.perdaytext.bean.BookBean;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by sweet_xue on 23/3/16.
 */
public class UtilsRequest {

    public static ArrayList<BookBean> getJsonData(String url){
        ArrayList<BookBean> bookBeans = new ArrayList<BookBean>();
        try {
            String jsonString = readStream(new URL(url).openStream());
            System.out.println("===jsonString===" + jsonString);
            JSONObject jsonObject = new JSONObject(jsonString);
            System.out.println("===jsonObject===" + jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bookBeans;
    }

    public static String readStream(InputStream is){
        InputStreamReader inputStreamReader;
        String result = "";
        String line = "";
        try {
            inputStreamReader = new InputStreamReader(is,"UTF-8");
            BufferedReader br = new BufferedReader(inputStreamReader);
            while ((line = br.readLine()) != null){
                result += line;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
