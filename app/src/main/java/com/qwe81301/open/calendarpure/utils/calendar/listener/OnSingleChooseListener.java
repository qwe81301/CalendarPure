package com.qwe81301.open.calendarpure.utils.calendar.listener;

import android.view.View;

//import com.othershe.calendarview.bean.DateBean;
import com.qwe81301.open.calendarpure.utils.calendar.bean.DateBean;

/**
 * 日期点击接口
 */
public interface OnSingleChooseListener {
    /**
     * @param view
     * @param date
     */
    void onSingleChoose(View view, DateBean date);
}
