package com.qwe81301.open.calendarpure.utils.calendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


import com.qwe81301.open.calendarpure.R;
import com.qwe81301.open.calendarpure.utils.calendar.bean.ShowMyClassResponseDataBean;

/**
 * author:       bearshih
 * project:      EHRMS
 * date:         2020/2/20
 * version:
 * description:
 */
public class ShowMyClassInfoDialog {

    private Context mContext;

    private TextView mDateTextView;

    private TextView mWorkInterval0TextView;
    private TextView mWorkInterval1TextView;
    private TextView mWorkInterval2TextView;

    private TextView mRestInterval0TextView;
    private TextView mRestInterval1TextView;

    private TextView mMyTimeTextView;

    public ShowMyClassInfoDialog(Context context) {
        mContext = context;
    }

    public void showDialog(ShowMyClassResponseDataBean.DataBean dataBean, String dateStr) {

        final AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);

        View view;

        view = LayoutInflater.from(mContext).inflate(R.layout.dialog_show_myclass_info, null, false);

        mDateTextView = view.findViewById(R.id.textView_date);

        mWorkInterval0TextView = view.findViewById(R.id.textView_work_interval_0);
        mWorkInterval1TextView = view.findViewById(R.id.textView_work_interval_1);
        mWorkInterval1TextView.setVisibility(View.GONE);
        mWorkInterval2TextView = view.findViewById(R.id.textView_work_interval_2);
        mWorkInterval2TextView.setVisibility(View.GONE);

        mRestInterval0TextView = view.findViewById(R.id.textView_rest_interval_0);
        mRestInterval1TextView = view.findViewById(R.id.textView_rest_interval_1);
        mRestInterval1TextView.setVisibility(View.GONE);

        mMyTimeTextView = view.findViewById(R.id.textView_myTime);

        mDateTextView.setText(dateStr);


        String wks, wke, workInterval0Str;
        String wks1, wke1, workInterval1Str;
        String wks2, wke2, workInterval2Str;

        //工作時間顯示
        if (("".equals(dataBean.getWks()) || dataBean.getWks() == null) &&
                ("".equals(dataBean.getWks1()) || dataBean.getWks1() == null) &&
                ("".equals(dataBean.getWks2()) || dataBean.getWks2() == null) &&
                ("".equals(dataBean.getWke()) || dataBean.getWke() == null) &&
                ("".equals(dataBean.getWke1()) || dataBean.getWke1() == null) &&
                ("".equals(dataBean.getWke2()) || dataBean.getWke2() == null)) {
            mWorkInterval0TextView.setText("無");
        } else if (!"".equals(dataBean.getWks()) && !"".equals(dataBean.getWke()) &&
                !"".equals(dataBean.getWks1()) && !"".equals(dataBean.getWke1()) &&
                !"".equals(dataBean.getWks2()) && !"".equals(dataBean.getWke2())) {

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows()) {
                wks = "隔天" + dataBean.getWks();
            } else {
                wks = dataBean.getWks();
            }

            if (dataBean.isTowe()) {
                wke = "隔天" + dataBean.getWke();
            } else {
                wke = dataBean.getWke();
            }

            workInterval0Str = wks + " ~ " + wke;
            mWorkInterval0TextView.setText(workInterval0Str);

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows1()) {
                wks1 = "隔天" + dataBean.getWks1();
            } else {
                wks1 = dataBean.getWks1();
            }

            if (dataBean.isTowe1()) {
                wke1 = "隔天" + dataBean.getWke1();
            } else {
                wke1 = dataBean.getWke1();
            }

            workInterval1Str = wks1 + " ~ " + wke1;
            mWorkInterval1TextView.setText(workInterval1Str);
            mWorkInterval1TextView.setVisibility(View.VISIBLE);

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows2()) {
                wks2 = "隔天" + dataBean.getWks2();
            } else {
                wks2 = dataBean.getWks2();
            }

            if (dataBean.isTowe2()) {
                wke2 = "隔天" + dataBean.getWke2();
            } else {
                wke2 = dataBean.getWke2();
            }

            workInterval2Str = wks2 + " ~ " + wke2;
            mWorkInterval2TextView.setText(workInterval2Str);
            mWorkInterval2TextView.setVisibility(View.VISIBLE);

        } else if (!"".equals(dataBean.getWks()) && !"".equals(dataBean.getWke()) &&
                !"".equals(dataBean.getWks1()) && !"".equals(dataBean.getWke1())) {


            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows()) {
                wks = "隔天" + dataBean.getWks();
            } else {
                wks = dataBean.getWks();
            }

            if (dataBean.isTowe()) {
                wke = "隔天" + dataBean.getWke();
            } else {
                wke = dataBean.getWke();
            }

            workInterval0Str = wks + " ~ " + wke;
            mWorkInterval0TextView.setText(workInterval0Str);

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows1()) {
                wks1 = "隔天" + dataBean.getWks1();
            } else {
                wks1 = dataBean.getWks1();
            }

            if (dataBean.isTowe1()) {
                wke1 = "隔天" + dataBean.getWke1();
            } else {
                wke1 = dataBean.getWke1();
            }

            workInterval1Str = wks1 + " ~ " + wke1;
            mWorkInterval1TextView.setText(workInterval1Str);
            mWorkInterval1TextView.setVisibility(View.VISIBLE);


        } else if (!"".equals(dataBean.getWks()) && !"".equals(dataBean.getWke())) {

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows()) {
                wks = "隔天" + dataBean.getWks();
            } else {
                wks = dataBean.getWks();
            }

            if (dataBean.isTowe()) {
                wke = "隔天" + dataBean.getWke();
            } else {
                wke = dataBean.getWke();
            }

            workInterval0Str = wks + " ~ " + wke;
            mWorkInterval0TextView.setText(workInterval0Str);
        }


        //休息時間顯示
        if (("".equals(dataBean.getReWks()) || dataBean.getReWks() == null) &&
                ("".equals(dataBean.getReWks1()) || dataBean.getReWks1() == null) &&
                ("".equals(dataBean.getReWke()) || dataBean.getReWke() == null) &&
                ("".equals(dataBean.getReWke1()) || dataBean.getReWke1() == null)) {
            mWorkInterval0TextView.setText("無");
        } else if (!"".equals(dataBean.getReWks()) && !"".equals(dataBean.getReWke()) &&
                !"".equals(dataBean.getReWks1()) && !"".equals(dataBean.getReWke1())) {

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows()) {
                wks = "隔天" + dataBean.getWks();
            } else {
                wks = dataBean.getWks();
            }

            if (dataBean.isTowe()) {
                wke = "隔天" + dataBean.getWke();
            } else {
                wke = dataBean.getWke();
            }

            workInterval0Str = wks + " ~ " + wke;
            mWorkInterval0TextView.setText(workInterval0Str);

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows1()) {
                wks1 = "隔天" + dataBean.getWks1();
            } else {
                wks1 = dataBean.getWks1();
            }

            if (dataBean.isTowe1()) {
                wke1 = "隔天" + dataBean.getWke1();
            } else {
                wke1 = dataBean.getWke1();
            }

            workInterval1Str = wks1 + " ~ " + wke1;
            mWorkInterval1TextView.setText(workInterval1Str);
            mWorkInterval1TextView.setVisibility(View.VISIBLE);

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows2()) {
                wks2 = "隔天" + dataBean.getWks2();
            } else {
                wks2 = dataBean.getWks2();
            }

            if (dataBean.isTowe2()) {
                wke2 = "隔天" + dataBean.getWke2();
            } else {
                wke2 = dataBean.getWke2();
            }

            workInterval2Str = wks2 + " ~ " + wke2;
            mWorkInterval2TextView.setText(workInterval2Str);
            mWorkInterval2TextView.setVisibility(View.VISIBLE);

        } else if (!"".equals(dataBean.getWks()) && !"".equals(dataBean.getWke()) &&
                !"".equals(dataBean.getWks1()) && !"".equals(dataBean.getWke1())) {


            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows()) {
                wks = "隔天" + dataBean.getWks();
            } else {
                wks = dataBean.getWks();
            }

            if (dataBean.isTowe()) {
                wke = "隔天" + dataBean.getWke();
            } else {
                wke = dataBean.getWke();
            }

            workInterval0Str = wks + " ~ " + wke;
            mWorkInterval0TextView.setText(workInterval0Str);

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows1()) {
                wks1 = "隔天" + dataBean.getWks1();
            } else {
                wks1 = dataBean.getWks1();
            }

            if (dataBean.isTowe1()) {
                wke1 = "隔天" + dataBean.getWke1();
            } else {
                wke1 = dataBean.getWke1();
            }

            workInterval1Str = wks1 + " ~ " + wke1;
            mWorkInterval1TextView.setText(workInterval1Str);
            mWorkInterval1TextView.setVisibility(View.VISIBLE);


        } else if (!"".equals(dataBean.getWks()) && !"".equals(dataBean.getWke())) {

            // 一段開始工作時間(Wks) 一段結束工作時間(Wke) 都有值
            if (dataBean.isTows()) {
                wks = "隔天" + dataBean.getWks();
            } else {
                wks = dataBean.getWks();
            }

            if (dataBean.isTowe()) {
                wke = "隔天" + dataBean.getWke();
            } else {
                wke = dataBean.getWke();
            }

            workInterval0Str = wks + " ~ " + wke;
            mWorkInterval0TextView.setText(workInterval0Str);
        }


//        mModePicker.setVisibility(View.VISIBLE);
//        String[] modeArray = {"當日", "次日"};
//
//        mModePicker.setWrapSelectorWheel(false);
//
//        //修改 分隔線的寬度
//        mModePicker.setNumberPickerDividerHeight(mModePicker);
//
//        //鎖住修改選中項文字功能
//        mModePicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);
//
//        mModePicker.setMinValue(1);
//        mModePicker.setMaxValue(modeArray.length);
//        mModePicker.setDisplayedValues(modeArray);
//
//
//        //小時選擇器
//        String[] hourArray = {"00", "01", "02", "03", "04", "05",
//                "06", "07", "08", "09", "10", "11",
//                "12", "13", "14", "15", "16", "17",
//                "18", "19", "20", "21", "22", "23"};
//
//        //開啟 循環顯示功能
//        mHourPicker.setWrapSelectorWheel(true);
//
//        //修改 分隔線的寬度
//        mHourPicker.setNumberPickerDividerHeight(mHourPicker);
//
//        //鎖住修改選中項文字功能
//        mHourPicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);
//
//        mHourPicker.setMinValue(0);
//        mHourPicker.setMaxValue(hourArray.length - 1);
//        mHourPicker.setDisplayedValues(hourArray);
//
//        //分鐘選擇器
//        String[] minute60Array = {"00", "01", "02", "03", "04", "05", "06",
//                "07", "08", "09", "10", "11", "12", "13",
//                "14", "15", "16", "17", "18", "19", "20",
//                "21", "22", "23", "24", "25", "26", "27",
//                "28", "29", "30", "31", "32", "33", "34",
//                "35", "36", "37", "38", "39", "40", "41",
//                "42", "43", "44", "45", "46", "47", "48",
//                "49", "50", "51", "52", "53", "54", "55",
//                "56", "57", "58", "59"};
//
//        //開啟 循環顯示功能
//        mMinutePicker.setWrapSelectorWheel(true);
//
//        //修改 分隔線的寬度
//        mMinutePicker.setNumberPickerDividerHeight(mMinutePicker);
//
//        //鎖住修改選中項文字功能
//        mMinutePicker.setDescendantFocusability(TimePicker.FOCUS_BLOCK_DESCENDANTS);
//
//        mMinutePicker.setMinValue(0);
//        mMinutePicker.setMaxValue(minute60Array.length - 1);
//        mMinutePicker.setDisplayedValues(minute60Array);


//        dialog.setPositiveButton("確定", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {

//            }
//        });

//        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//            }
//        });

        // set dialog view
        dialog.setView(view);

        // show it to user
        dialog.show();

    }

}
