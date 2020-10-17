package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    /** 当活动第一次被创建时调用 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_main);

/*
        TextView mitexto=new TextView(this);

        mitexto.setText("Hola mundo");

        setContentView(mitexto);*/

    }

    //每个组件都有ID
    /*TextView texto= findViewById(R.id.TextoPincipal);// 找到关于TextView 的组件

    Button boton= findViewById(R.id.BotonPaginaPrincipal);// 找到关于buton 的组件

*/

    public  void pulsaboton(View v){
        /*
   Intent I=new Intent(this,SegundoActivity.class);// Intent 就像java的evento一样
   startActivity(I);
*/
//如何启动Activity
        //1:startActivity(new Intent(当前的的Actividy ,  要启动的Activity.class));

     //2:   ComponentName cn=new ComponentName(this,SegundoActivity.class);
       // Intent intent=new Intent();
       // intent.setComponent(cn);
       // startActivity(intent);



    }



}
