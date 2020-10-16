package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    String msg="Andoid :";
    public int contador;

    /** 当活动第一次被创建时调用 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
      /*  TextView mitexto=new TextView(this);

        mitexto.setText("Hola mundo");

        setContentView(mitexto);*/


    }
    boolean ok=false;
   /* public void pulsacionBoton(View s){

        //Log.v("Que cosa","Que va salir");

       /*TextView jaja = findViewById(R.id.textView);

        if(ok){
            jaja.setText("");
            ok=false;
        }
        else{
            jaja.setText(R.string.aviso);
            ok=true;
        }

      // setContentView(R.layout.otraventana);

    }

    public void volver(View j){

        setContentView(R.layout.activity_main);

    }
*/

public  void pulsaboton(View v){
   Intent I=new Intent(this,SegundoActivity.class);

   startActivity(I);

}

/**
public void nada(View v){

}
   // /** 当活动即将可见时调用
    @Override
    protected void onStart() {
        super.onStart();

        Log.d(msg, "The onStart() event");
    }

   // /** 当活动可见时调用
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

   // /** 当其他活动获得焦点时调用
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }
    ///** 当活动不再可见时调用
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    ///** 当活动将被销毁时调用
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
*/
}
