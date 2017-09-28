package com.houtrry.activitylifeciycledemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void startAty(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

    public void click2(View view) {
        startAty(Main2Activity.class);
    }

    public void click3(View view) {
        startAty(Main3Activity.class);
    }
}
