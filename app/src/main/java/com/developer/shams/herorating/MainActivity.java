package com.developer.shams.herorating;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleRate, resultRate;
    RatingBar rateStars;
    Button btnFeed;
    ImageView charPlace, glitter;
    Animation charAnim, stripeAnim,btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titleRate = findViewById(R.id.titleRate);
        resultRate = findViewById(R.id.resultRate);
        rateStars = findViewById(R.id.rateStars);
        btnFeed = findViewById(R.id.btnfeedBack);
        charPlace = findViewById(R.id.charplace);
        glitter = findViewById(R.id.stripe);

        //for initialization
        charAnim = AnimationUtils.loadAnimation(this, R.anim.charanim);
        stripeAnim = AnimationUtils.loadAnimation(this, R.anim.stripeanim);
        btnAnim = AnimationUtils.loadAnimation(this, R.anim.btnanim);
        charPlace.startAnimation(charAnim);
        glitter.startAnimation(stripeAnim);
        btnFeed.startAnimation(btnAnim);
        setFonts();
        changeCharchterStatus();

    }

    private void changeCharchterStatus() {
        rateStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int answervalue = (int) (rateStars.getRating());
                switch (answervalue) {
                    case 1:
                        charPlace.setImageResource(R.drawable.cry);
                        charPlace.startAnimation(charAnim);
                        glitter.animate().alpha(0).setDuration(300).start();
                        btnFeed.startAnimation(btnAnim);
                        resultRate.setText("Just So So");
                        break;
                    case 2:
                        charPlace.setImageResource(R.drawable.cry);
                        charPlace.startAnimation(charAnim);
                        glitter.animate().alpha(0).setDuration(300).start();
                        btnFeed.startAnimation(btnAnim);
                        resultRate.setText("Just So So");
                        break;
                    case 3:
                        charPlace.setImageResource(R.drawable.cool);
                        charPlace.startAnimation(charAnim);
                        glitter.animate().alpha(1).setDuration(300).start();
                        glitter.startAnimation(stripeAnim);
                        btnFeed.startAnimation(btnAnim);
                        resultRate.setText("Good Job");
                        break;
                    case 4:
                        charPlace.setImageResource(R.drawable.cool);
                        charPlace.startAnimation(charAnim);
                        glitter.animate().alpha(1).setDuration(300).start();
                        glitter.startAnimation(stripeAnim);
                        btnFeed.startAnimation(btnAnim);
                        resultRate.setText("Good Job");
                        break;
                    case 5:
                        charPlace.setImageResource(R.drawable.laugh);
                        charPlace.startAnimation(charAnim);
                        glitter.animate().alpha(1).setDuration(300).start();
                        glitter.startAnimation(stripeAnim);
                        btnFeed.startAnimation(btnAnim);
                        resultRate.setText("Awesome");
                        break;

                }

            }
        });
    }

    private void setFonts() {
        //import Fonts
        Typeface MReguler = Typeface.createFromAsset(getAssets(), "fonts/MR.ttf");
        Typeface MMeduim = Typeface.createFromAsset(getAssets(), "fonts/MM.ttf");

        titleRate.setTypeface(MReguler);
        resultRate.setTypeface(MMeduim);
        btnFeed.setTypeface(MMeduim);
    }
}
