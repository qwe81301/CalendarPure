package com.qwe81301.open.calendarpure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.qwe81301.open.calendarpure.utils.calendar.utils.CalendarUtil;
import com.qwe81301.open.calendarpure.utils.calendar.weiget.CalendarView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendarView;

    private int[] cDate = CalendarUtil.getCurrentDate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calendarView = findViewById(R.id.calendar);
        HashMap<String, String> map = new HashMap<>();
        map.put("2017.10.30", "qaz");
        map.put("2017.10.1", "wsx");
        map.put("2017.11.12", "yhn");
        map.put("2017.9.15", "edc");
        map.put("2017.11.6", "rfv");
        map.put("2020.1.1", "TEST_改動日期");
        map.put("2020.1.20", "改動日期");
        map.put("2020.1.21", "改動日期2");
        map.put("2020.1.12", "改動日期1.改動日期.");
        map.put("2020.2.12", "QQQQQQQQ");
        calendarView
                .setSpecifyMap(map)
                .setStartEndDate("2016.1", "2028.12")
                .setDisableStartEndDate("2016.10.10", "2028.10.10")//如果沒用到可以 不set
                .setInitDate(cDate[0] + "." + cDate[1])
                .setSingleDate(cDate[0] + "." + cDate[1] + "." + cDate[2])
                .init();

    }

    public void lastMonth(View view) {
        calendarView.lastMonth();
    }

    public void nextMonth(View view) {
        calendarView.nextMonth();
    }
}
