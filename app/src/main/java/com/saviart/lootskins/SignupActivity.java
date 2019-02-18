package com.saviart.lootskins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SignupActivity extends AppCompatActivity {

    ImageButton btnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_main);
        btnSignup = (ImageButton) findViewById(R.id.btnSignup);
        Animation animsighup = AnimationUtils.loadAnimation(this,R.anim.animbtnsignup);
        btnSignup.startAnimation(animsighup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignupActivity.this,LoadActivity.class));

                overridePendingTransition(R.anim.animactivitytop,R.anim.animactivitybottom);
            }


        });

        /// test github
    }
}