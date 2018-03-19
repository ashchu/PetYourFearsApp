package com.chicktech.example;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.math.MathUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.CountDownTimer;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.bumptech.glide.Glide;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {


    @BindView(R.id.text) TextView text;
    @BindView(R.id.logo) ImageView logo; //instantiates item
    @BindView(R.id.start_button) Button start_button;
    @BindView(R.id.progressBar) ImageView progressBar;

    @Override

    protected void onCreate(Bundle savedInstanceState) { //beginning of method function

        super.onCreate(savedInstanceState); //things you need just cause
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Glide.with(this)
                .load("https://image.ibb.co/kogfzc/Arachnify_Logo.png") //declares it
                .into(logo);

        Glide.with(this)
                .load("https://image.ibb.co/bPZPuc/progress_Bar.png")
                .into(progressBar);

        start_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InstructionActivity.class));
            }
        });



    }
}


