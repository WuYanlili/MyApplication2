package com.example.wuqia.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private Button zhuce,denglu,btn_test,btn_dengu;

    private EditText zhanghao,mima;
    private final static String USERNAME="july";
    private final static String PASSWORD="111111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zhanghao = (EditText) findViewById(R.id.zhanghao);
        mima = (EditText) findViewById(R.id.mima);
        denglu= (Button) findViewById(R.id.denglu);
        denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=zhanghao.getText()+"";
                String passwd=mima.getText()+"";
                passwd=passwd.trim();
                if(username.equals(USERNAME)&&passwd.equals(PASSWORD)){
                    Intent intert =new Intent(MainActivity.this,Hello.class);
                    intert.putExtra("USERNAME","HELLO");
                    startActivity(intert);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this,"no",Toast.LENGTH_LONG).show();
                }

            }
        });



    }





}
