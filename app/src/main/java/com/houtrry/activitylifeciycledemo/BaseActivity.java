package com.houtrry.activitylifeciycledemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * @author houtrry
 * @version $Rev$
 * @time 2017/9/28 9:52
 * @desc ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDesc $TODO$
 */

public class BaseActivity extends AppCompatActivity {

    protected String TAG = BaseActivity.class.getSimpleName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        logd("onCreate----------------> 创建界面  -->onCreate(savedInstanceState, persistentState), savedInstanceState: "+savedInstanceState+", persistentState: "+persistentState);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        logd("onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: "+savedInstanceState);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logd("onRestart-----> 重新回到前台");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        logd("onRestoreInstanceState------------> 开始恢复界面的数据-->onRestoreInstanceState(savedInstanceState, persistentState), savedInstanceState: "+savedInstanceState+", persistentState: "+persistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        logd("onRestoreInstanceState------------> 开始恢复界面的数据-->onRestoreInstanceState(savedInstanceState), savedInstanceState: "+savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        logd("onSaveInstanceState---------------> 开始保存界面的数据, onSaveInstanceState(outState, outPersistentState), outState: "+outState+", outPersistentState: "+outPersistentState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        logd("onSaveInstanceState---------------> 开始保存界面的数据, .onSaveInstanceState(outState), outState: "+outState);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        logd("onAttachedToWindow----------------> ");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        logd("onDetachedFromWindow----------------> ");
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        logd("onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: "+hasFocus);
    }

    @Override
    protected void onStart() {
        super.onStart();
        logd("onStart--->     用户可见");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logd("onResume--->    得到焦点");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logd("onPause--->     失去焦点");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logd("onStop--->      用户不可见");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logd("onDestroy--->   界面销毁");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        logd("onNewIntent--->   singleTask/singleTop模式下会调用.  ");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        logd("onPostResume---> ");
    }

    protected void logd(String message) {
        Log.d(TAG, message);
    }
}
