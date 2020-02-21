package com.qwe81301.open.calendarpure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.qwe81301.open.calendarpure.utils.calendar.utils.CalendarUtil;
import com.qwe81301.open.calendarpure.utils.calendar.bean.ShowMyClassResponseDataBean;
import com.qwe81301.open.calendarpure.utils.calendar.weiget.CalendarView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.qwe81301.open.calendarpure.utils.calendar.utils.SolarUtil.getMonthDays;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendarView;

    private int[] cDate = CalendarUtil.getCurrentDate();

    private ShowMyClassResponseDataBean showMyClassResponseDataBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String tempJson = "{\n" +
                "   \"rid\": 2,\n" +
                "   \"data\": {\n" +
                "      \"01\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"02\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"03\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"04\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"05\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"06\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"07\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"08\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"休息日\",\n" +
                "         \"leaveNum\": 1\n" +
                "      },\n" +
                "      \"09\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"休息日\",\n" +
                "         \"leaveNum\": 1\n" +
                "      },\n" +
                "      \"10\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\"" +
                ": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"11\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"09:00\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"12:00\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": \"14:00\",\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": \"16:00\",\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": \"17:00\",\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": \"18:00\",\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": \"6小時\",\n" +
                "         \"leave\": \"變動三段\",\n" +
                "         \"leaveNum\": -1\n" +
                "      },\n" +
                "      \"12\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"09:00\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"12:00\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": \"14:00\",\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": \"16:00\",\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": \"17:00\",\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": \"18:00\",\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": \"6小時\",\n" +
                "         \"leave\": \"變動三段\",\n" +
                "         \"leaveNum\": -1\n" +
                "      },\n" +
                "      \"13\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"09:00\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"12:00\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": \"14:00\",\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": \"16:00\",\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": \"17:00\",\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": \"18:00\",\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": \"6小時\",\n" +
                "         \"leave\": \"變動三段\",\n" +
                "         \"leaveNum\": -1\n" +
                "      },\n" +
                "      \"14\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"請假\",\n" +
                "         \"leaveNum\": 0\n" +
                "      },\n" +
                "      \"15\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"請假\",\n" +
                "         \"leaveNum\": 0\n" +
                "      },\n" +
                "      \"16\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": null,\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": null,\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"排班中\",\n" +
                "         \"leaveNum\": 10\n" +
                "      },\n" +
                "      \"17\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": null,\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": null,\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": null,\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": null,\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": null,\n" +
                "         \"leave\": \"國定假日\",\n" +
                "         \"leaveNum\": 4\n" +
                "      },\n" +
                "      \"19\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"08:30\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"12:00\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": \"18:06\",\n" +
                "         \"towe1\": true,\n" +
                "         \"wke1\": \"03:30\",\n" +
                "         \"tows2\": true,\n" +
                "         \"wks2\": \"05:00\",\n" +
                "         \"towe2\": true,\n" +
                "         \"wke2\": \"06:00\",\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": \"12:00\",\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": \"13:30\",\n" +
                "         \"reTows1\": true,\n" +
                "         \"reWks1\": \"04:00\",\n" +
                "         \"reTowe1\": true,\n" +
                "         \"reWke1\": \"04:30\",\n" +
                "         \"myTime\": \"13小時54分鐘\",\n" +
                "         \"leave\": \"APP_班別_次日\",\n" +
                "         \"leaveNum\": -1\n" +
                "      },\n" +
                "      \"20\": {\n" +
                "         \"tows\": false,\n" +
                "         \"wks\": \"09:00\",\n" +
                "         \"towe\": false,\n" +
                "         \"wke\": \"12:00\",\n" +
                "         \"tows1\": false,\n" +
                "         \"wks1\": \"14:00\",\n" +
                "         \"towe1\": false,\n" +
                "         \"wke1\": \"16:00\",\n" +
                "         \"tows2\": false,\n" +
                "         \"wks2\": \"17:00\",\n" +
                "         \"towe2\": false,\n" +
                "         \"wke2\": \"18:00\",\n" +
                "         \"reTows\": false,\n" +
                "         \"reWks\": null,\n" +
                "         \"reTowe\": false,\n" +
                "         \"reWke\": null,\n" +
                "         \"reTows1\": false,\n" +
                "         \"reWks1\": null,\n" +
                "         \"reTowe1\": false,\n" +
                "         \"reWke1\": null,\n" +
                "         \"myTime\": \"6小時\",\n" +
                "         \"leave\": \"變動三段\",\n" +
                "         \"leaveNum\": -1\n" +
                "      }\n" +
                "   }\n" +
                "}";


        Gson gson = new Gson();
        showMyClassResponseDataBean = gson.fromJson(tempJson, ShowMyClassResponseDataBean.class);

        //額外再做一次抽出 getData()
        String seqs = gson.toJson(showMyClassResponseDataBean.getData());

        Type SeqsType = new TypeToken<LinkedHashMap<String, ShowMyClassResponseDataBean.DataBean>>() {
        }.getType();

        LinkedHashMap<String, ShowMyClassResponseDataBean.DataBean> dataDataBean = gson.fromJson(seqs, SeqsType);

        reformatData(showMyClassResponseDataBean.getData());

        calendarView = findViewById(R.id.calendar);
        HashMap<String, ShowMyClassResponseDataBean.DataBean> map = new HashMap<>();
//        HashMap<String, String,Integer> map2 = new HashMap<>();

        for (int i = 0; i < showMyClassResponseDataList.size(); i++) {

            String yearStr = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
//            String monthStr = String.valueOf(Calendar.getInstance().get(Calendar.MONTH) + 1);
            String monthStr = String.valueOf(Calendar.getInstance().get(Calendar.MONTH));//todo test
            monthStr = "2";//todo test
            String dayStr = String.valueOf(i+1);//這裡i+1 是因為從0開始
            String yearMonthDayStr = yearStr + "." + monthStr + "." + dayStr;
            //EX: map.put("2020.1.1", "XX假別");
            map.put(yearMonthDayStr, showMyClassResponseDataList.get(i));
        }

//        map.put("2017.10.30", "qaz");
//        map.put("2017.10.1", "wsx");
//        map.put("2017.11.12", "yhn");
//        map.put("2017.9.15", "edc");
//        map.put("2017.11.6", "rfv");
//        map.put("2020.1.1", "TEST_改動日期");
//        map.put("2020.1.20", "改動日期");
//        map.put("2020.1.21", "改動日期2");
//        map.put("2020.1.12", "改動日期1.改動日期.");
//        map.put("2020.2.12", "QQQQQQQQ");
        calendarView
                .setSpecifyMap(map)
                .setStartEndDate("2016.1", "2028.12")
                .setDisableStartEndDate("2016.10.10", "2028.10.10")//如果沒用到可以 不set
                .setInitDate(cDate[0] + "." + cDate[1])
                .setSingleDate(cDate[0] + "." + cDate[1] + "." + cDate[2])
                .init();

    }

    ArrayList<ShowMyClassResponseDataBean.DataBean> showMyClassResponseDataList = new ArrayList<>();

    //無班表的值需要用到
    private ShowMyClassResponseDataBean.DataBean noDataBean = new ShowMyClassResponseDataBean.DataBean();

    private void reformatData(LinkedHashMap<String, ShowMyClassResponseDataBean.DataBean> list) {

        showMyClassResponseDataList.clear();
        noDataBean.setLeave("未排");


        // TODO: 2020/2/6 改成全域變數　取值
        int days = getMonthDays(2020, 2);

        for (int i = 1; i <= days; i++) {

            //先放入全部都是預設值 後面跑完迴圈後無改動就是
            showMyClassResponseDataList.add(noDataBean);

            String convertDay = convertDayIntToString(i);

            for (Map.Entry<String, ShowMyClassResponseDataBean.DataBean> entry : list.entrySet()) {
                //雙層迴圈 外層迴圈 月份日期數   內層迴圈 看list 比對一樣的就改值
                if (convertDay.equals(entry.getKey())) {
                    showMyClassResponseDataList.remove(i - 1);//這邊index -1 是因為外層迴圈初始是1的關係
                    showMyClassResponseDataList.add(i - 1, entry.getValue());
                }
            }
        }
    }

    private String convertDayIntToString(int day) {
        if (0 < day && day < 10) {
            return ("0" + day);
        } else {
            return String.valueOf(day);
        }
    }

    public void lastMonth(View view) {
        calendarView.lastMonth();
    }

    public void nextMonth(View view) {
        calendarView.nextMonth();
    }
}
