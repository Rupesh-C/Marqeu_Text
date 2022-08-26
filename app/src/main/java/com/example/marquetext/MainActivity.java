package com.example.marquetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView, text2;
    Button button1, button2;
    Animation animup, animdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.marquee);
        text2=findViewById(R.id.txtview);

        button1=findViewById(R.id.btn);
        button2=findViewById(R.id.btn2);
        animdown= AnimationUtils.loadAnimation(this,R.anim.anim_down);
        animup=AnimationUtils.loadAnimation(this,R.anim.anim_up);

        textView.setSelected(true);
        text2.setSelected(true);


        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    button1.startAnimation(animdown);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    button1.startAnimation(animup);
                }
                return true;
            }
        });

    }
}