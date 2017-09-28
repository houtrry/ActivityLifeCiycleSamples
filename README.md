# ActivityLifeCiycleSamples


D/MainActivity: onCreate----------------> 创建界面  -->onCreate(savedInstanceState), savedInstanceState: null  
D/MainActivity: onStart--->     用户可见  
D/MainActivity: onResume--->    得到焦点  
D/MainActivity: onPostResume--->   
D/MainActivity: onAttachedToWindow---------------->   
D/MainActivity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true  



MainActivity跳转到Main2Activity

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




Main2Activity点击返回按钮  

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


再次MainActivity跳转到Main2Activity  

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


点击按钮调finish(), 销毁Main2Activity  

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

从MainActivity跳转到Main3Activity  

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


显示Dialog  

D/Main3Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: false  

隐藏Dialog  

D/Main3Activity: onWindowFocusChanged---------------> 用户焦点发生变化, hasFocus: true

显示Toast  

Toast已显示, 没走生命周期方法  

