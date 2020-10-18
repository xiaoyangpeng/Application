package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


///////////////////////////////////////////////////////////////
// Activity  和appcompatActivity区别
//appcompatActivity 会显示 ActionBar 默认显示项目的名称
// Activity 没显示
public class MainActivity extends Activity {


//////////////////////////////////////////////////////
    /*设置默认启动的Actibity
    只要把intert -filter (在manifests 里面的AndoidManifes.xml里面)弄到要启动的activity 的etiqueta里面就好
    // 比如现在显示启动的就是.关于Activity

     <activity android:name=".关于Activity">
                 <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
                </intent-filter>
        </activity>
     */



    /** 当活动第一次被创建时调用 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_mian);
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

   Intent I=new Intent(this,SegundoActivity.class);// Intent intencion 就像java的evento一样
   startActivity(I);

  ////////////////////////////////////////////////////////////

//如何启动Activity
        //1:startActivity(new Intent(当前的的Actividy ,  要启动的Activity.class));

     //2:   ComponentName cn=new ComponentName(this,SegundoActivity.class);
       // Intent intent=new Intent();
       // intent.setComponent(cn);
       // startActivity(intent);

    }

    public void BotonInformacion(View V){

        Intent I=new Intent(this,InformacionActivity.class);
        startActivity(I);

        // 这里显示的界面是通知窗口一样
        //设置这也要在AndoidManifest 里面设置
           /*  <activity android:name=".InformacionActivity"
        android:theme="@style/Theme.AppCompat.Dialog">
        </activity>*/


    }
 public void Salir(View V){

        finish();// 结束软件
 }

 //Activity之间的数据传递
 public void VentanaPoneTexto(View V){
     /*
        Intent I=new Intent(this,PonerTextoActivity.class);
        I.putExtra("Nombre de valor","valor");
        startActivity(I);
*/
        //接收方
     /*
     Intent I2=getIntent();
     String jaja=I2.getStringExtra("Nombre de valor");//不同类型的数据只要改变Stringj就好
     */

     //一次传递多个

     Intent I3=new Intent(this, RecibirTextodeActivityAntrior.class);
     Bundle bd=new Bundle();
     bd.putInt("Numero",5);
     bd.putString("String","Valor de String");
     I3.putExtras(bd);// 注意这里是Extrassss
     startActivity(I3);

     // 接收方
     /*
     Intent receptor2=getIntent();
     Bundle bdreceptpor=receptor2.getExtras();
     int num1=bdreceptpor.getInt("Numero");
     String st=bdreceptpor.getString("String");
*/
 }

}
