package com.chicktech.example;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.math.MathUtils;
import android.util.Log;
//import com.chicktech.R;
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

import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class InstructionActivity extends Activity {

    @BindView(R.id.text) TextView text;
    @BindView(R.id.gifPress) ImageView gifPress;
    @BindView(R.id.pressText) TextView pressText;
    @BindView(R.id.challengeButton) TextView challengeButton;
    @BindView(R.id.step2) TextView step2;
    @BindView(R.id.step2Image) ImageView step2Image;
    @BindView(R.id.step3img) ImageView step3img;
    @BindView(R.id.step3) TextView step3;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);
        ButterKnife.bind(this);

        Glide.with(this)
                .load("https://media.giphy.com/media/4PXWcbwJ1gojTrkvbF/giphy.gif")
                .into(gifPress);

        Glide.with(this)
                .load("https://media1.tenor.com/images/8235e7e749036f21689d25ab1249afd5/tenor.gif?itemid=4852806")
                .into(step3img);

        Glide.with(this)
                .load("https://m.popkey.co/305190/Ll9Jq_s-200x150.gif?c=popkey-web&p=popkey&i=3d-gifs&l=search&f=.gif")
                .into(step2Image);

        challengeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                startActivity(new Intent(InstructionActivity.this, LevelActivity.class));
            }
        });

    }

}
