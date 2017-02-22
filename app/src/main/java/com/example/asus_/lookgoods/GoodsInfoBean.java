package com.example.asus_.lookgoods;

import java.util.List;

/**
 * Created by asus- on 2017/2/22.
 */

public class GoodsInfoBean {

    /**
     * resultcode : 200
     * reason : 查询物流信息成功
     * result : {"company":"天天","com":"tt","no":"667300323472","status":"0","list":[{"datetime":"2017-02-18 17:52:32","remark":"【平度分部】的收件员【卫亚晶】已收件","zone":""},{"datetime":"2017-02-18 20:47:35","remark":"快件已到达【青岛分拨中心】 扫描员是【小件13】上一站是【青岛李沧区】","zone":""},{"datetime":"2017-02-18 20:55:10","remark":"由【青岛分拨中心】发往【广州陆运】","zone":""},{"datetime":"2017-02-18 21:19:28","remark":"由【青岛分拨中心】发往【郑州分拨中心】","zone":""},{"datetime":"2017-02-19 15:08:11","remark":"快件已到达【郑州分拨中心】 扫描员是【席江涛】上一站是【无】","zone":""},{"datetime":"2017-02-19 19:20:58","remark":"由【郑州分拨中心】发往【广州分拨中心】","zone":""},{"datetime":"2017-02-22 08:28:39","remark":"由【广州分拨中心】发往【广州天河元岗】","zone":""}]}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    /**
     * company : 天天
     * com : tt
     * no : 667300323472
     * status : 0
     * list : [{"datetime":"2017-02-18 17:52:32","remark":"【平度分部】的收件员【卫亚晶】已收件","zone":""},{"datetime":"2017-02-18 20:47:35","remark":"快件已到达【青岛分拨中心】 扫描员是【小件13】上一站是【青岛李沧区】","zone":""},{"datetime":"2017-02-18 20:55:10","remark":"由【青岛分拨中心】发往【广州陆运】","zone":""},{"datetime":"2017-02-18 21:19:28","remark":"由【青岛分拨中心】发往【郑州分拨中心】","zone":""},{"datetime":"2017-02-19 15:08:11","remark":"快件已到达【郑州分拨中心】 扫描员是【席江涛】上一站是【无】","zone":""},{"datetime":"2017-02-19 19:20:58","remark":"由【郑州分拨中心】发往【广州分拨中心】","zone":""},{"datetime":"2017-02-22 08:28:39","remark":"由【广州分拨中心】发往【广州天河元岗】","zone":""}]
     */

    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String company;
        private String com;
        private String no;
        private String status;
        /**
         * datetime : 2017-02-18 17:52:32
         * remark : 【平度分部】的收件员【卫亚晶】已收件
         * zone :
         */

        private List<ListBean> list;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private String datetime;
            private String remark;
            private String zone;

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getZone() {
                return zone;
            }

            public void setZone(String zone) {
                this.zone = zone;
            }
        }
    }
}
