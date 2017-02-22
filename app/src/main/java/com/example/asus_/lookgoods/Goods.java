package com.example.asus_.lookgoods;

/**
 * Created by asus- on 2017/2/22.
 */

public class Goods {
    private String datetime;
    private String remark;

    public Goods(String datetime, String remark) {
        this.datetime = datetime;
        this.remark = remark;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getRemark() {
        return remark;
    }
}
