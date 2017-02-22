package com.example.asus_.lookgoods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ShowInfoActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Goods> datalist;
    private MyAdapter adapter;
    private String url = "http://v.juhe.cn/exp/index?key=e2fb03c8f729f78752c74fc93227d5e3&com=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        initView();
        initData();

    }

    private void initData() {
        url = url + getIntent().getStringExtra("company") + "&no=" + getIntent().getStringExtra("num");
        new Thread(new Runnable() {
            @Override
            public void run() {
                sendHttpRequest(url);
            }
        }).start();

    }

    private void sendHttpRequest(String url) {
        try {
            URL rl = new URL(url);
            try {
                HttpURLConnection conn = (HttpURLConnection) rl.openConnection();
                InputStream is = conn.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
                StringBuffer stringBuffer = new StringBuffer();
                String line = br.readLine();
                while (line != null) {
                    stringBuffer.append(line);
                    line = br.readLine();
                }
                Log.d("ddd", url);
                Gson gson = new Gson();
                final GoodsInfoBean goodsInfoBean = gson.fromJson(stringBuffer.toString(), GoodsInfoBean.class);
                List<GoodsInfoBean.ResultBean.ListBean>datalistbean=goodsInfoBean.getResult().getList();
                for (int i = 0; i <datalistbean.size() ; i++) {
                    GoodsInfoBean.ResultBean.ListBean listBean= datalistbean.get(i);
                    datalist.add(new Goods(listBean.getDatetime(),listBean.getRemark()));
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setTitle(goodsInfoBean.getResult().getCompany());
                        adapter.notifyDataSetChanged();
                    }
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.listview);
        datalist = new ArrayList<Goods>();
        adapter = new MyAdapter(datalist, ShowInfoActivity.this);
        listView.setAdapter(adapter);
    }
}
