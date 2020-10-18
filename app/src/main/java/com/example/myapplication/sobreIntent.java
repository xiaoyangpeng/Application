package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class sobreIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_intent);
    }


    //作用
    /*
    ntent是一个将要执行的动作的抽象的描述，一般来说是作为参数来使用，
    由 Intent来协助完成 Android各个组件之间的通讯。比如说调用startActivity()来启动一个Activity
    ，或者由broadcaseIntent()来传递给所有感兴趣的BroadcaseReceiver，
    再或者由startService() / bindservice()来启动一个后台的 service。所以可以看出来，
    Intent 主要是用来启动其他的 activity 或者 service，所以可以将 intent 理解成 activity 之间的粘合剂。


     */
}