# ActivityLifeCiycleSamples

## 运行日志
### MainActivity创建
D/MainActivity: onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: null  
D/MainActivity: onStart--->     用户可见  
D/MainActivity: onResume--->    得到焦点  
D/MainActivity: onPostResume--->   
D/MainActivity: onAttachedToWindow---------------->   
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  



### MainActivity跳转到Main2Activity

D/MainActivity: onPause--->     失去焦点  
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false  
D/Main2Activity: onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: null  
D/Main2Activity: onStart--->     用户可见  
D/Main2Activity: onResume--->    得到焦点  
D/Main2Activity: onPostResume--->   
D/Main2Activity: onAttachedToWindow---------------->   
D/Main2Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  
D/MainActivity: onSaveInstanceState---------------> 开始保存界面的数据, .onSaveInstanceState(outState), outState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@212f37f2, 2131427405=android.view.AbsSavedState$1@212f37f2, 2131427406=android.view.AbsSavedState$1@212f37f2, 2131427407=android.support.v7.widget.Toolbar$SavedState@3b52be43, 2131427408=android.view.AbsSavedState$1@212f37f2}}]}]  
D/MainActivity: onStop--->      用户不可见  




### Main2Activity点击返回按钮  

D/Main2Activity: onPause--->     失去焦点  
D/MainActivity: onRestart-----> 重新回到前台  
D/MainActivity: onStart--->     用户可见  
D/MainActivity: onResume--->    得到焦点  
D/MainActivity: onPostResume--->   
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  
D/Main2Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false  
D/Main2Activity: onStop--->      用户不可见  
D/Main2Activity: onDestroy--->   界面销毁  
D/Main2Activity: onDetachedFromWindow---------------->   


### 再次MainActivity跳转到Main2Activity  

D/MainActivity: onPause--->     失去焦点  
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false  
D/Main2Activity: onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: null  
D/Main2Activity: onStart--->     用户可见  
D/Main2Activity: onResume--->    得到焦点  
D/Main2Activity: onPostResume--->   
D/Main2Activity: onAttachedToWindow---------------->   
D/Main2Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  
D/MainActivity: onSaveInstanceState---------------> 开始保存界面的数据, .onSaveInstanceState(outState), outState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@212f37f2, 2131427405=android.view.AbsSavedState$1@212f37f2, 2131427406=android.view.AbsSavedState$1@212f37f2, 2131427407=android.support.v7.widget.Toolbar$SavedState@10b1faa1, 2131427408=android.view.AbsSavedState$1@212f37f2}}]}]  
D/MainActivity: onStop--->      用户不可见  


### 点击按钮调finish(), 销毁Main2Activity  

D/Main2Activity: onPause--->     失去焦点  
D/MainActivity: onRestart-----> 重新回到前台  
D/MainActivity: onStart--->     用户可见  
D/MainActivity: onResume--->    得到焦点  
D/MainActivity: onPostResume--->   
D/Main2Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false  
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  
D/Main2Activity: onStop--->      用户不可见  
D/Main2Activity: onDestroy--->   界面销毁  
D/Main2Activity: onDetachedFromWindow---------------->   

### 从MainActivity跳转到Main3Activity  

D/MainActivity: onPause--->     失去焦点  
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false  
D/Main3Activity: onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: null  
D/Main3Activity: onStart--->     用户可见  
D/Main3Activity: onResume--->    得到焦点  
D/Main3Activity: onPostResume--->   
D/Main3Activity: onAttachedToWindow---------------->   
D/Main3Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  
D/MainActivity: onSaveInstanceState---------------> 开始保存界面的数据, .onSaveInstanceState(outState), outState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@212f37f2, 2131427405=android.view.AbsSavedState$1@212f37f2, 2131427406=android.view.AbsSavedState$1@212f37f2, 2131427407=android.support.v7.widget.Toolbar$SavedState@3cb8da0a, 2131427408=android.view.AbsSavedState$1@212f37f2}}]}]  
D/MainActivity: onStop--->      用户不可见  


### 显示Dialog  

D/Main3Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false  

### 隐藏Dialog  

D/Main3Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true

### 显示Toast  

Toast已显示, 没走生命周期方法  

### Main3Activity崩溃, 重新创建  

D/MainActivity: onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: Bundle[{android:viewHierarchyState=Bundle[mParcelledData.dataSize=528]}]  
D/MainActivity: onStart--->     用户可见  
D/MainActivity: onRestoreInstanceState------------> 开始恢复界面的数据-->onRestoreInstanceState(savedInstanceState), savedInstanceState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@180892, 2131427405=android.view.AbsSavedState$1@180892, 2131427406=android.view.AbsSavedState$1@180892, 2131427407=android.support.v7.widget.Toolbar$SavedState@fc45263, 2131427408=android.view.AbsSavedState$1@180892}}]}]  
D/MainActivity: onResume--->    得到焦点  
D/MainActivity: onPostResume--->   
D/MainActivity: onAttachedToWindow---------------->   
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  


### Main4Activity屏幕旋转  

D/Main4Activity: onPause--->     失去焦点  
E/Main4Activity: onSaveInstanceState---------------> 开始保存界面的数据, .onSaveInstanceState(outState), outState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@212f37f2, 2131427405=android.view.AbsSavedState$1@212f37f2, 2131427406=android.view.AbsSavedState$1@212f37f2, 2131427407=android.support.v7.widget.Toolbar$SavedState@23059cc0, 2131427408=android.view.AbsSavedState$1@212f37f2}}]}]  
D/Main4Activity: onStop--->      用户不可见  
D/Main4Activity: onDestroy--->   界面销毁  
D/Main4Activity: onDetachedFromWindow---------------->   
D/Main4Activity: onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@212f37f2, 2131427405=android.view.AbsSavedState$1@212f37f2, 2131427406=android.view.AbsSavedState$1@212f37f2, 2131427407=android.support.v7.widget.Toolbar$SavedState@23059cc0, 2131427408=android.view.AbsSavedState$1@212f37f2}}]}]  
D/Main4Activity: onStart--->     用户可见  
E/Main4Activity: onRestoreInstanceState------------> 开始恢复界面的数据-->onRestoreInstanceState(savedInstanceState), savedInstanceState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@212f37f2, 2131427405=android.view.AbsSavedState$1@212f37f2, 2131427406=android.view.AbsSavedState$1@212f37f2, 2131427407=android.support.v7.widget.Toolbar$SavedState@23059cc0, 2131427408=android.view.AbsSavedState$1@212f37f2}}]}]  
D/Main4Activity: onResume--->    得到焦点  
D/Main4Activity: onPostResume--->   
D/Main4Activity: onAttachedToWindow---------------->   
D/Main4Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  

### Main3Activity 点击home键
03-16 14:17:10.882 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false   
03-16 14:17:10.920 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onPause--->     失去焦点   
03-16 14:17:11.338 32204-32204/com.houtrry.activitylifeciycledemo E/Main3Activity: onSaveInstanceState---------------> 开始保存界面的数据, .onSaveInstanceState(outState), outState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@3c0dff9, 2131427405=android.view.AbsSavedState$1@3c0dff9, 2131427406=android.view.AbsSavedState$1@3c0dff9, 2131427407=android.support.v7.widget.Toolbar$SavedState@d970d08, 2131427408=android.view.AbsSavedState$1@3c0dff9, 2131427422=android.view.AbsSavedState$1@3c0dff9, 2131427423=android.view.AbsSavedState$1@3c0dff9, 2131427424=android.view.AbsSavedState$1@3c0dff9, 2131427425=android.view.AbsSavedState$1@3c0dff9, 2131427426=android.view.AbsSavedState$1@3c0dff9}}]}]   
03-16 14:17:11.338 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onStop--->      用户不可见   

### Main3Activity 点击home键后，再次进入app
03-16 14:17:21.479 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onRestart-----> 重新回到前台   
03-16 14:17:21.487 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onStart--->     用户可见   
03-16 14:17:21.487 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onResume--->    得到焦点   
03-16 14:17:21.488 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onPostResume--->   
03-16 14:17:21.516 32204-32204/com.houtrry.activitylifeciycledemo D/Main3Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  

### MainActivity 直接锁屏
03-16 14:35:53.203 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onPause--->     失去焦点  
03-16 14:35:53.223 847-847/com.houtrry.activitylifeciycledemo E/MainActivity: onSaveInstanceState---------------> 开始保存界面的数据, .onSaveInstanceState(outState), outState: Bundle[{android:viewHierarchyState=Bundle[{android:views={16908290=android.view.AbsSavedState$1@e09952e, 2131427405=android.view.AbsSavedState$1@e09952e, 2131427406=android.view.AbsSavedState$1@e09952e, 2131427407=android.support.v7.widget.Toolbar$SavedState@51cb8cf, 2131427408=android.view.AbsSavedState$1@e09952e}}]}]  
03-16 14:35:53.223 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onStop--->      用户不可见  
03-16 14:35:54.222 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false 

### MainActivity 解锁屏幕
03-16 14:36:51.213 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onRestart-----> 重新回到前台  
03-16 14:36:51.227 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onStart--->     用户可见  
03-16 14:36:51.229 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onResume--->    得到焦点  
03-16 14:36:51.229 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onPostResume--->   
03-16 14:36:51.311 847-847/com.houtrry.activitylifeciycledemo D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  



## 总结

* 屏幕旋转时, 执行的方法顺序为:  
    onPause --> onSaveInstanceState --> onStop --> onDestroy --> onDetachedFromWindow --> onCreate --> onStart --> onRestoreInstanceState -->onResume -->onAttachedToWindow --> onWindowFoucsChanged.  
* onSaveInstanceState方法执行在onPause和onStop之间. 对应的, onRestoreInstanceState执行在onStart和onResume之间.  
* 从B页面点击返回按钮返回到A页面或者B页面调用finish方法返回到A页面, 方法都是  
    onPause(B) --> onRestart(A) --> onStart(A) --> onResume(A) --> onStop(B) -->onDestroy(B)
* 从A页面跳转到B页面时, 方法是  
    onPause(A) --> onCreate(B) --> onStart(B) --> onResume(B) --> onSaveInstanceState(A) --> onStop(A)
* onWindowFoucsChanged 方法执行在onResume和onPause方法之后, 在onStop之前.
* 从A页面跳转到B页面,   
    A会在onPause之后立刻执行onWindowFoucsChanged(false), 从而失去焦点.B在onResume后获取焦点.  
  从B页面返回到A页面,  
    A/B均是在B的onStop方法之前执行onWindowFoucsChanged, 两个onWindowFoucsChanged顺序不一定.
    
  