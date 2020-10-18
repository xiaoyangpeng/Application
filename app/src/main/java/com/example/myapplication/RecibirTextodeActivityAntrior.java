package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecibirTextodeActivityAntrior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poner_texto);

        //Activity接收从另一个Acttibity传入的数据
        //接收方
        /* Intent I2=getIntent();

         String jaja=I2.getStringExtra("Nombre de valor");//不同类型的数据只要改变Stringj就好

        TextView text=findViewById(R.id.TextodePonerTexto);
        text.setText(jaja);
*/

        // 当传入多个数据时
        Intent receptor2=getIntent();
        Bundle bdreceptpor=receptor2.getExtras();
        int num1=bdreceptpor.getInt("Numero");
        String st=bdreceptpor.getString("String");

        TextView text=findViewById(R.id.TextodeRecipirActivityAnterior2);
        text.setText(st+num1);
    }


}