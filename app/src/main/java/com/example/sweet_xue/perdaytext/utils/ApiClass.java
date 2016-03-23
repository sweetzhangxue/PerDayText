package com.example.sweet_xue.perdaytext.utils;

/**
 * Created by sweet_xue on 23/3/16.
 */
public class ApiClass {

    public static final String getjingxuanUrl(int page) {
        String url = "http://app.d1xz.net/jsonp/index/?tags=1&page=" + page + "&callback=jQuery18303226558130700141_1458639590389&_=1458639697234\n";
        return url;
    }


    public static final String getUrl(int type ,int page) {
        String url = "http://app.d1xz.net/jsonp/index/?type="+type+"&page=" + page + "&callback=jQuery18303226558130700141_1458639590389&_=1458639697234\n";
        return url;
    }

}
