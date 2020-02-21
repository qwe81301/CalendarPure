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

        String reWks, reWke, restInterval0Str;
        String reWks1, reWke1, restInterval1Str;

        //休息時間顯示
        if (("".equals(dataBean.getReWks()) || dataBean.getReWks() == null) &&
                ("".equals(dataBean.getReWks1()) || dataBean.getReWks1() == null) &&
                ("".equals(dataBean.getReWke()) || dataBean.getReWke() == null) &&
                ("".equals(dataBean.getReWke1()) || dataBean.getReWke1() == null)) {
            mRestInterval0TextView.setText("無");
        } else if (!"".equals(dataBean.getReWks()) && !"".equals(dataBean.getReWke()) &&
                !"".equals(dataBean.getReWks1()) && !"".equals(dataBean.getReWke1())) {

            // 一段開始工作時間(reWks) 一段結束工作時間(reWke) 都有值
            if (dataBean.isReTows()) {
                reWks = "隔天" + dataBean.getReWks();
            } else {
                reWks = dataBean.getReWks();
            }

            if (dataBean.isReTowe()) {
                reWke = "隔天" + dataBean.getReWke();
            } else {
                reWke = dataBean.getReWke();
            }

            restInterval0Str = reWks + " ~ " + reWke;
            mRestInterval0TextView.setText(restInterval0Str);

            // 一段開始工作時間(reWks) 一段結束工作時間(reWke) 都有值
            if (dataBean.isReTows1()) {
                reWks1 = "隔天" + dataBean.getReWks1();
            } else {
                reWks1 = dataBean.getReWks1();
            }

            if (dataBean.isReTowe1()) {
                reWke1 = "隔天" + dataBean.getReWke1();
            } else {
                reWke1 = dataBean.getReWke1();
            }

            restInterval1Str = reWks1 + " ~ " + reWke1;
            mRestInterval1TextView.setText(restInterval1Str);
            mRestInterval1TextView.setVisibility(View.VISIBLE);

        } else if (!"".equals(dataBean.getReWks()) && !"".equals(dataBean.getReWke())) {

            // 一段開始工作時間(reWks) 一段結束工作時間(reWke) 都有值
            if (dataBean.isReTows()) {
                reWks = "隔天" + dataBean.getReWks();
            } else {
                reWks = dataBean.getReWks();
            }

            if (dataBean.isReTowe()) {
                reWke = "隔天" + dataBean.getReWke();
            } else {
                reWke = dataBean.getReWke();
            }

            restInterval0Str = reWks + " ~ " + reWke;
            mRestInterval0TextView.setText(restInterval0Str);
        }

        //顯示標準工時
        mMyTimeTextView.setText(dataBean.getMyTime());



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
