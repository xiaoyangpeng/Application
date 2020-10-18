package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends Activity {
  public int  contador;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        contador=0;
    }


    public void aumentar(View vista){

        contador++;

        pintar();

    }

    public void restar(View vita){

        contador--;
        pintar();
    }
    public void resetear(View vita){

        contador=0;
        pintar();
    }

    public  void pintar(){
      TextView text=(TextView) findViewById(R.id.TextoSegundo);

        text.setText(" "+contador);
    }
}