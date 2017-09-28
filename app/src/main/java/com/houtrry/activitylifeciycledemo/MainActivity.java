package com.houtrry.activitylifeciycledemo;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click2(View view) {
        startAty(Main2Activity.class);
    }

    public void click3(View view) {
        startAty(Main3Activity.class);
    }

    public void click4(View view) {
        startAty(Main4Activity.class);
    }
}
