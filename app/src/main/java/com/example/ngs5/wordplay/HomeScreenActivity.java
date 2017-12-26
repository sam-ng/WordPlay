package com.example.ngs5.wordplay;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        /*RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.homeScreen);
        rlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        ImageView logo = (ImageView) findViewById(R.id.logo);

        PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat(View.SCALE_X, 2);
        PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 2);

        ObjectAnimator logoAnimation = ObjectAnimator.ofPropertyValuesHolder(logo, pvhX, pvhY);
        logoAnimation.setRepeatCount(ValueAnimator.INFINITE);
        logoAnimation.setRepeatMode(ValueAnimator.REVERSE);
        logoAnimation.start();
    }
}
