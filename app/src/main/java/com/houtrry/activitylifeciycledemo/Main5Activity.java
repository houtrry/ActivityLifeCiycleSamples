package com.houtrry.activitylifeciycledemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends BaseActivity {

    private AlertDialog mAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Main3Activity main3Activity = Main3Activity.getInstance();
                if (main3Activity != null) {
                    main3Activity.showDialog();
                } else {
                    loge("-------------> main3Activity is null ");
                }
            }
        });
    }

    public void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("我是Main5Activity的Dialog");
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
}
