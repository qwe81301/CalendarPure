package com.qwe81301.open.calendarpure.utils.calendar.listener;

import android.view.View;
import android.widget.TextView;

//import com.othershe.calendarview.bean.DateBean;
import com.qwe81301.open.calendarpure.utils.calendar.bean.DateBean;

public interface CalendarViewAdapter {
    /**
     * 返回阳历、阴历两个TextView
     *
     * @param view
     * @param date
     * @return
     */
    TextView[] convertView(View view, DateBean date);
}
