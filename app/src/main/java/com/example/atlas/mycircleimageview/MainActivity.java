package com.example.atlas.mycircleimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.user_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "~(^_^)~", Toast.LENGTH_SHORT).show();

                //使用动画实现头像控件抖动的效果
                final TranslateAnimation anim = new TranslateAnimation(0, 10, 0, 0);
                // 利用 CycleInterpolator 参数 为float 的数  表示 抖动的次数，而抖动的快慢是由 duration 和 CycleInterpolator 的参数的大小 联合确定的
                anim.setInterpolator(new CycleInterpolator(2f));
                anim.setDuration(300);

                v.startAnimation(anim);
            }
        });
    }
}
