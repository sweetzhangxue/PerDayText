package com.example.sweet_xue.perdaytext;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sweet_xue.perdaytext.bean.BookBean;
import com.example.sweet_xue.perdaytext.utils.ApiClass;
import com.example.sweet_xue.perdaytext.utils.UtilsRequest;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PullToRefreshListView pullToRefreshListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pullToRefreshListView = (PullToRefreshListView) findViewById(R.id.pullToRefreshListView);
        new NewsAsyncTask().execute(ApiClass.getjingxuanUrl(1));

    }


    class NewsAsyncTask extends AsyncTask<String , Void,ArrayList<BookBean>>{

        @Override
        protected ArrayList<BookBean> doInBackground(String... params) {
            UtilsRequest.getJsonData(ApiClass.getjingxuanUrl(1));
            return UtilsRequest.getJsonData(params[0]);
        }


        @Override
        protected void onPostExecute(ArrayList<BookBean> bookBeans) {
            super.onPostExecute(bookBeans);
        }
    }
}
