package com.example.asus_.lookgoods;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by asus- on 2017/2/22.
 */

public class MyAdapter extends BaseAdapter{
    private ArrayList<Goods>dataList;
    private Context context;

    public MyAdapter(ArrayList<Goods> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        }
        TextView datatime= (TextView) convertView.findViewById(R.id.txt_datetime);
        TextView remark= (TextView) convertView.findViewById(R.id.txt_remark);
        Goods goods=dataList.get(position);
        datatime.setText(goods.getDatetime());
        remark.setText(goods.getRemark());
        return convertView;
    }
}
