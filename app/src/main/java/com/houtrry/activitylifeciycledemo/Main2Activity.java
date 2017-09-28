package com.houtrry.activitylifeciycledemo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;

/**
 * 正常情况
 */
public class Main2Activity extends BaseActivity {


    private static Main2Activity sInstance;
    private AlertDialog mAlertDialog;


    public static Main2Activity getInstance() {
        return sInstance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sInstance = this;

    }

    public void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("我是Main2Activity的Dialog");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (mAlertDialog != null) {
                    mAlertDialog.dismiss();
                }
            }
        });
        mAlertDialog = builder.show();
    }

    public void click(View view) {
        finish();
    }

}
