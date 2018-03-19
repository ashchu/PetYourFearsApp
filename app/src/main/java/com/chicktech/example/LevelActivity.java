package com.chicktech.example;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.math.MathUtils;
import android.util.Log;
//import com.chicktech.R;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LevelActivity extends Activity {
    @BindView(R.id.text3) TextView text;
    @BindView(R.id.spider_button) ImageButton spider_button;
    @BindView(R.id.lucasSpider) ImageView lucasSpider;
//    @BindView(R.id.sayings) TextView sayings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        ButterKnife.bind(this);

        if (Spider.getLevel() == 0){
            ImageView myImageView = findViewById(R.id.spider_button);
            myImageView.setImageResource(R.drawable.ladybug);
        } else if (Spider.getLevel() == 1){
            ImageView myImageView = findViewById(R.id.spider_button);
            myImageView.setImageResource(R.drawable.cute_spider);
        }
        else if(Spider.getLevel() == 2){
            ImageView myImageView = findViewById(R.id.spider_button);
            myImageView.setImageResource(R.drawable.scary_spider);
        }


        spider_button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Spider.updateTaps();

                if (Spider.getCurrentTaps() == Spider.getLevelTaps()){
                    Spider.updateLevel();
                    startActivity(new Intent(LevelActivity.this, PromptActivity.class));
                }
            }
        });
        //go to next activity
    }
}
