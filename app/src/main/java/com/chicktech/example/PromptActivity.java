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


public class PromptActivity extends Activity {

    @BindView(R.id.prompt) TextView prompt;
    @BindView(R.id.prompt_button) Button prompt_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);
        ButterKnife.bind(this);

        prompt.setText(Spider.getPrompt());

        prompt_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (Spider.getLevel() == Spider.getNUM_LEVELS()) {
                    startActivity(new Intent(PromptActivity.this, MainActivity.class));
                } else{
                    startActivity(new Intent(PromptActivity.this, LevelActivity.class));
                }
            }
        });


    }
}
