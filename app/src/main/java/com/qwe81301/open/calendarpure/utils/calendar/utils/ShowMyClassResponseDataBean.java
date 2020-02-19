package com.qwe81301.open.calendarpure.utils.calendar.utils;

import java.util.LinkedHashMap;

/**
 * author:       bearshih
 * project:      EHRMS
 * date:         2020/1/17
 * version:
 * description:
 * 因為回傳資料 key值 是會變動的 所以GsonFormat後 手動修改 "data"的json結構
 *
 * var tows: Bool //是否為隔天(一段開始)
 *         var wks: String? //一段開始
 *         var towe: Bool //是否為隔天(一段結束)
 *         var wke: String? //一段結束
 *         var tows1: Bool //是否為隔天(二段開始)
 *         var wks1: String? //二段開始
 *         var towe1: Bool // 是否為隔天(二段結束)
 *         var wke1 :String? //二段結束
 *         var tows2 : Bool //是否為隔天(三段開始)
 *         var wks2 :String? //三段開始
 *         var towe2: Bool // 是否為隔天(三段結束)
 *         var wke2: String? //三段結束
 *         var reTows :Bool //是否為隔天(休息時間一段開始)
 *         var reWks :String? //休息時間一段開始
 *         var reTowe :Bool //是否為隔天(休息時間一段結束)
 *         var reWke: String? //休息時間一段結束
 *         var reTows1 :Bool//是否為隔天(休息時間二段開始)
 *         var reWks1 :String? //休息時間二段開始
 *         var reTowe1 :Bool //是否為隔天(休息時間二段結束)
 *         var reWke1 :String? //休息時間二段結束
 *         var myTime :String? //標準工作時間
 *         var leave :String? //假期文字說明
 *         var leaveNum :Int? //假期類別
 */
public class ShowMyClassResponseDataBean {

    /**
     * rid : 2
     * data : {"19":{"tows":false,"wks":"08:30","towe":false,"wke":"12:00","tows1":false,"wks1":"18:06","towe1":true,"wke1":"03:30","tows2":true,"wks2":"05:00","towe2":true,"wke2":"06:00","reTows":false,"reWks":"12:00","reTowe":false,"reWke":"13:30","reTows1":true,"reWks1":"04:00","reTowe1":true,"reWke1":"04:30","myTime":"13小時54分鐘","leave":"APP_班別_次日","leaveNum":-1}}
     */

    private int rid;
    private LinkedHashMap<String, DataBean> data;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public LinkedHashMap<String, DataBean> getData() {
        return data;
    }

    public void setData(LinkedHashMap<String, DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * 19 : {"tows":false,"wks":"08:30","towe":false,"wke":"12:00","tows1":false,"wks1":"18:06","towe1":true,"wke1":"03:30","tows2":true,"wks2":"05:00","towe2":true,"wke2":"06:00","reTows":false,"reWks":"12:00","reTowe":false,"reWke":"13:30","reTows1":true,"reWks1":"04:00","reTowe1":true,"reWke1":"04:30","myTime":"13小時54分鐘","leave":"APP_班別_次日","leaveNum":-1}
         */

            /**
             * tows : false
             * wks : 08:30
             * towe : false
             * wke : 12:00
             * tows1 : false
             * wks1 : 18:06
             * towe1 : true
             * wke1 : 03:30
             * tows2 : true
             * wks2 : 05:00
             * towe2 : true
             * wke2 : 06:00
             * reTows : false
             * reWks : 12:00
             * reTowe : false
             * reWke : 13:30
             * reTows1 : true
             * reWks1 : 04:00
             * reTowe1 : true
             * reWke1 : 04:30
             * myTime : 13小時54分鐘
             * leave : APP_班別_次日
             * leaveNum : -1
             */

            private boolean tows;
            private String wks;
            private boolean towe;
            private String wke;
            private boolean tows1;
            private String wks1;
            private boolean towe1;
            private String wke1;
            private boolean tows2;
            private String wks2;
            private boolean towe2;
            private String wke2;
            private boolean reTows;
            private String reWks;
            private boolean reTowe;
            private String reWke;
            private boolean reTows1;
            private String reWks1;
            private boolean reTowe1;
            private String reWke1;
            private String myTime;
            private String leave;
            private int leaveNum;

            public boolean isTows() {
                return tows;
            }

            public void setTows(boolean tows) {
                this.tows = tows;
            }

            public String getWks() {
                return wks;
            }

            public void setWks(String wks) {
                this.wks = wks;
            }

            public boolean isTowe() {
                return towe;
            }

            public void setTowe(boolean towe) {
                this.towe = towe;
            }

            public String getWke() {
                return wke;
            }

            public void setWke(String wke) {
                this.wke = wke;
            }

            public boolean isTows1() {
                return tows1;
            }

            public void setTows1(boolean tows1) {
                this.tows1 = tows1;
            }

            public String getWks1() {
                return wks1;
            }

            public void setWks1(String wks1) {
                this.wks1 = wks1;
            }

            public boolean isTowe1() {
                return towe1;
            }

            public void setTowe1(boolean towe1) {
                this.towe1 = towe1;
            }

            public String getWke1() {
                return wke1;
            }

            public void setWke1(String wke1) {
                this.wke1 = wke1;
            }

            public boolean isTows2() {
                return tows2;
            }

            public void setTows2(boolean tows2) {
                this.tows2 = tows2;
            }

            public String getWks2() {
                return wks2;
            }

            public void setWks2(String wks2) {
                this.wks2 = wks2;
            }

            public boolean isTowe2() {
                return towe2;
            }

            public void setTowe2(boolean towe2) {
                this.towe2 = towe2;
            }

            public String getWke2() {
                return wke2;
            }

            public void setWke2(String wke2) {
                this.wke2 = wke2;
            }

            public boolean isReTows() {
                return reTows;
            }

            public void setReTows(boolean reTows) {
                this.reTows = reTows;
            }

            public String getReWks() {
                return reWks;
            }

            public void setReWks(String reWks) {
                this.reWks = reWks;
            }

            public boolean isReTowe() {
                return reTowe;
            }

            public void setReTowe(boolean reTowe) {
                this.reTowe = reTowe;
            }

            public String getReWke() {
                return reWke;
            }

            public void setReWke(String reWke) {
                this.reWke = reWke;
            }

            public boolean isReTows1() {
                return reTows1;
            }

            public void setReTows1(boolean reTows1) {
                this.reTows1 = reTows1;
            }

            public String getReWks1() {
                return reWks1;
            }

            public void setReWks1(String reWks1) {
                this.reWks1 = reWks1;
            }

            public boolean isReTowe1() {
                return reTowe1;
            }

            public void setReTowe1(boolean reTowe1) {
                this.reTowe1 = reTowe1;
            }

            public String getReWke1() {
                return reWke1;
            }

            public void setReWke1(String reWke1) {
                this.reWke1 = reWke1;
            }

            public String getMyTime() {
                return myTime;
            }

            public void setMyTime(String myTime) {
                this.myTime = myTime;
            }

            public String getLeave() {
                return leave;
            }

            public void setLeave(String leave) {
                this.leave = leave;
            }

            public int getLeaveNum() {
                return leaveNum;
            }

            public void setLeaveNum(int leaveNum) {
                this.leaveNum = leaveNum;
            }

    }
}
