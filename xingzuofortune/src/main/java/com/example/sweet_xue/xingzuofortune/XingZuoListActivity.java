package com.example.sweet_xue.xingzuofortune;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class XingZuoListActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private RelativeLayout container_baiyang, container_jinniu, container_shuangzi, container_juxie, container_shizi, container_chunv, container_tianping,
            container_tianxie, container_sheshou, container_mojie, container_shuiping, container_shuangyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_xing_zuo_list);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        imageView = (ImageView) findViewById(R.id.imgView_back);
        container_baiyang = (RelativeLayout) findViewById(R.id.container_baiyang);
        container_jinniu = (RelativeLayout) findViewById(R.id.container_jinniu);
        container_shuangzi = (RelativeLayout) findViewById(R.id.container_shuangzi);
        container_juxie = (RelativeLayout) findViewById(R.id.container_juxie);
        container_shizi = (RelativeLayout) findViewById(R.id.container_shizi);
        container_chunv = (RelativeLayout) findViewById(R.id.container_chunv);
        container_tianping = (RelativeLayout) findViewById(R.id.container_tianping);
        container_tianxie = (RelativeLayout) findViewById(R.id.container_tianxie);
        container_sheshou = (RelativeLayout) findViewById(R.id.container_sheshou);
        container_mojie = (RelativeLayout) findViewById(R.id.container_mojie);
        container_shuiping = (RelativeLayout) findViewById(R.id.container_shuiping);
        container_shuangyu = (RelativeLayout) findViewById(R.id.container_shuangyu);

        imageView.setOnClickListener(this);
        container_baiyang.setOnClickListener(this);
        container_jinniu.setOnClickListener(this);
        container_shuangzi.setOnClickListener(this);
        container_juxie.setOnClickListener(this);
        container_shizi.setOnClickListener(this);
        container_chunv.setOnClickListener(this);
        container_tianping.setOnClickListener(this);
        container_tianxie.setOnClickListener(this);
        container_sheshou.setOnClickListener(this);
        container_mojie.setOnClickListener(this);
        container_shuiping.setOnClickListener(this);
        container_shuangyu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgView_back:
                XingZuoListActivity.this.finish();
                break;
            case R.id.container_baiyang:
                break;
            case R.id.container_jinniu:
                break;
            case R.id.container_shuangzi:
                break;
            case R.id.container_juxie:
                break;
            case R.id.container_shizi:
                break;
            case R.id.container_chunv:
                break;
            case R.id.container_tianping:
                break;
            case R.id.container_tianxie:
                break;
            case R.id.container_sheshou:
                break;
            case R.id.container_mojie:
                break;
            case R.id.container_shuiping:
                break;
            case R.id.container_shuangyu:
                break;
        }
    }
}
