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

import com.bumptech.glide.Glide;

import java.util.concurrent.TimeUnit;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {


    @BindView(R.id.awesome_image) ImageView imageview; //instantiantes the variable and the filetyoe
    @BindView(R.id.awesome_image_left) ImageView iconLeft;
    @BindView(R.id.text) TextView text;
    @BindView(R.id.ground) ImageView ground1;
    @BindView(R.id.flower) ImageView flowerPower;
    @BindView(R.id.flower_right) ImageView rightFlower;
    @BindView(R.id.count_time) EditText timeText;
    @BindView(R.id.start_button) Button beginButton;
    @BindView(R.id.flower_left) ImageView leftFlower;
    @BindView(R.id.reset) Button resetButton;
    @BindView(R.id.flower_leftcenter) ImageView leftCenter;
    @BindView(R.id.flower_rightCenter) ImageView rightCenter;
    @BindView(R.id.goodLuck_gif) ImageView plantGif;

    @Override

    protected void onCreate(Bundle savedInstanceState) { //beginning of method function

        super.onCreate(savedInstanceState); //things you need just cause
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Glide.with(this) //idk what glide does but it allows you to important the image in
                .load("https://t4.rbxcdn.com/4acfddda242f2996937cfc3ec905af85")
                .into(imageview);

        Glide.with(this)
                .load("https://image.ibb.co/jVm72w/ground.png")
                .into(ground1);

        Glide.with(this)
                .load("https://t4.rbxcdn.com/4acfddda242f2996937cfc3ec905af85")
                .into(iconLeft);

//        Glide.with(this)
//                .load("https://gallery.yopriceville.com/var/albums/Free-Clipart-Pictures/Trees-PNG-Clipart/Oack_Tree_PNG_Clipart_Picture.png?m=1399672800")
//                .into(treePic);


        resetButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                timeText.setText("30");
                timeText.setEnabled(true);
                flowerPower.setImageDrawable(null);
                rightFlower.setImageDrawable(null);
                leftFlower.setImageDrawable(null);
                leftCenter.setImageDrawable(null);
                rightCenter.setImageDrawable(null);
                plantGif.setImageDrawable(null);
            }
        });

        beginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int userTime = Integer.parseInt(timeText.getText().toString());
                final int userFullTime = userTime;
                timeText.setEnabled(false);
                Toast.makeText(MainActivity.this, "Stay Focused", Toast.LENGTH_SHORT).show();
                final boolean started = true;
                final String[] flowerLocations = {"https://cdn.pixabay.com/photo/2014/04/02/10/26/flower-303860_640.png", "http://www.clker.com/cliparts/h/y/Z/T/e/4/red-flower-hi.png", "http://www.clker.com/cliparts/f/d/f/8/12103879671931980577HakanL_Simple_Flower.svg.hi.png"};
                final int[] fillerFlowerNumVals = {0, 1, 2, 3, 4};


                if (started == true)
                {
                    new CountDownTimer(TimeUnit.SECONDS.toMillis(userTime), 1000) {

                        public void onTick(long millisUntilFinished) {
                            timeText.setText("" + TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished));
                            if(TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) == 13)
                            {
                                Random r = new Random();
                                int randomeNum = modValue(r.nextInt());
                                Log.d("MainActivity","Amrita :"+randomeNum);
                                Glide.with(MainActivity.this)
//                                        .load("https://cdn.pixabay.com/photo/2014/04/02/10/26/flower-303860_640.png")
                                        .load(flowerLocations[randomeNum%3])
                                        .into(flowerPower);
                            }
                            else if(TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished)  == (userFullTime/2))
                            {
                                Random r = new Random();
                                int randomeNum = modValue(r.nextInt());
                                Log.d("MainActivity","Num :"+randomeNum);
                                Glide.with(MainActivity.this)
//                                        .load("http://www.clker.com/cliparts/h/y/Z/T/e/4/red-flower-hi.png")
                                        .load(flowerLocations[randomeNum%3])
                                        .into(rightFlower);
                            }
                            else if (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) == userFullTime/4)
                            {
                                Random r = new Random();
                                int randomeNum = modValue(r.nextInt());
                                Log.d("MainActivity","Num :"+randomeNum);
                                Glide.with(MainActivity.this)
//                                        .load("http://www.clker.com/cliparts/f/d/f/8/12103879671931980577HakanL_Simple_Flower.svg.hi.png")
                                        .load(flowerLocations[randomeNum%3])
                                        .into(leftFlower);
                            }
                            else if (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) == userFullTime - 5)
                            {
                                Random r = new Random();
                                int randomeNum = modValue(r.nextInt());
                                Log.d("MainActivity","Num :"+randomeNum);
                                Glide.with(MainActivity.this)
//                                        .load("http://www.clker.com/cliparts/f/d/f/8/12103879671931980577HakanL_Simple_Flower.svg.hi.png")
                                        .load(flowerLocations[randomeNum%3])
                                        .into(leftCenter);
                            }
                            else if (TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) == userFullTime/6)
                            {
                                Random r = new Random();
                                int randomeNum = modValue(r.nextInt());
                                Log.d("MainActivity","Num :"+randomeNum);
                                Glide.with(MainActivity.this)
//                                        .load("http://www.clker.com/cliparts/f/d/f/8/12103879671931980577HakanL_Simple_Flower.svg.hi.png")
                                        .load(flowerLocations[randomeNum%3])
                                        .into(rightCenter);
                            }

                        }

                        public void onFinish() {
                            timeText.setText("done!");
                            String[] arrayOfGifs = {"https://media.giphy.com/media/oZ4hsNeuMpkSA/giphy.gif", "https://im4.ezgif.com/tmp/ezgif-4-7c1b2d8949.gif", "https://orig00.deviantart.net/3442/f/2017/020/6/2/yay_the_third__fempocalypse_by_fluffymystic-daw293i.gif", "https://media.giphy.com/media/stYnZNptINFsY/giphy.gif","https://pa1.narvii.com/6455/31a302f326276f6a996fe3bb8609a3634bc11bab_hq.gif", "https://68.media.tumblr.com/876aad85e757c3005a4f9b933efccad3/tumblr_om9pm5oRL71vg2y1io3_400.gif"};
                            int gifNum = (int)(Math.random() * 7);
                            Glide.with(MainActivity.this)
                                    .load(arrayOfGifs[gifNum])
                                    .into(plantGif);

                        }
                    }.start();
                }
            }
        });
    }

    protected int modValue(int val) { //  method to find the modifying value
        if(val <0 ){
            val = val * -1;
        }
        return val;
    }
}


