package com.example.myapplication2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView i1;
    private RecyclerView i2;
    private Button i3;
    private  who who1=new who();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView)findViewById(R.id.i1);
        i2= (RecyclerView) findViewById(R.id.i2);
        i3= (Button) findViewById(R.id.i3);
        i1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Random random=new Random();
                int index=random.nextInt(100);

                who1.data.add(index+"");
                //通知数据发生改变让它显示新的数据

                who1.notifyItemInserted(who1.data.size()-1);
                //-1因为位置从0开始
                i2.scrollToPosition(who1.data.size()-1);
                //为按钮添加旋转动画
                ObjectAnimator ratation=ObjectAnimator.ofFloat(i1,"rotation",0f,360f);
                ObjectAnimator scaleY=ObjectAnimator.ofFloat(i1,"scaleY",1f,1.5f);
                ObjectAnimator scaleX=ObjectAnimator.ofFloat(i1,"scaleX",1f,1.5f);
                AnimatorSet set= new AnimatorSet();
                set.setDuration(500);
                set.playTogether(ratation,scaleX,scaleY);
                set.start();
            }

        });


        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                who1.data.clear();
                who1.notifyDataSetChanged();

            }
        });
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        i2.setLayoutManager(layoutManager);
        i2.setAdapter(who1);





    }
}