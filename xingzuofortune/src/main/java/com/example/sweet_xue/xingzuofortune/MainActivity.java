package com.example.sweet_xue.xingzuofortune;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.baidu.apistore.sdk.ApiCallBack;
import com.baidu.apistore.sdk.ApiStoreSDK;
import com.baidu.apistore.sdk.network.Parameters;

import java.security.Policy;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tv = (TextView) findViewById(R.id.tv);
        getData("","");
    }

    private void getData(String consName,String type){
        Parameters  parameters = new Parameters();
        parameters.put("consName",consName);
        parameters.put("type",type);
        ApiStoreSDK.execute("http://apis.baidu.com/bbtapi/constellation/constellation_query",ApiStoreSDK.GET,parameters,new ApiCallBack(){
            @Override
            public void onSuccess(int i, String s) {
                System.out.println("====result===="+s);
                tv.setText(s);
            }

            @Override
            public void onComplete() {
                super.onComplete();
            }

            @Override
            public void onError(int i, String s, Exception e) {
                tv.setText(e.getMessage());
            }
        });
    }
}
