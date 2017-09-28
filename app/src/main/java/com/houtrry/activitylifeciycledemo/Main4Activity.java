package com.houtrry.activitylifeciycledemo;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class Main4Activity extends BaseAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
    }
}
