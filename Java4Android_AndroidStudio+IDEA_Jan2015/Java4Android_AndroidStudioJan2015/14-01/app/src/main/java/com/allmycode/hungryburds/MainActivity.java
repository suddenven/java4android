package com.allmycode.hungryburds;

import java.util.Random;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity
    implements OnClickListener, AnimationListener {

  final int NUMBER_OF_BURDS = 10;
  final long AVERAGE_SHOW_TIME = 1000L;
  final long MINIMUM_SHOW_TIME = 500L;
  TextView textView;
  int countShown = 0, countClicked = 0;
  Random random = new Random();

  RelativeLayout relativeLayout;
  int displayWidth, displayHeight;

  SharedPreferences prefs;
  SharedPreferences.Editor editor;

  /* Activity methods */

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textView = (TextView) findViewById(R.id.textView1);
    relativeLayout = (RelativeLayout) 
        findViewById(R.id.relativeLayout);

    Display display = 
        getWindowManager().getDefaultDisplay();
    Point size = new Point();
    display.getSize(size);
    displayWidth = size.x;
    displayHeight = size.y;

    prefs = getPreferences(MODE_PRIVATE);
    editor = prefs.edit();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public void onResume() {
    super.onResume();
    countClicked = countShown = 0;
    textView.setText(R.string.nothing);
    showABurd();
  }

  /* Game methods */

  void showABurd() {
    long duration = 
        random.nextInt((int) AVERAGE_SHOW_TIME)
        + MINIMUM_SHOW_TIME;

    LayoutParams params = new LayoutParams
                     (LayoutParams.WRAP_CONTENT, 
                      LayoutParams.WRAP_CONTENT);
    
    params.leftMargin = 
        random.nextInt(displayWidth) * 7 / 8;
    params.topMargin = 
        random.nextInt(displayHeight) * 4 / 5;

    ImageView burd = new ImageView(this);
    burd.setOnClickListener(this);
    burd.setLayoutParams(params);
    burd.setImageResource(R.drawable.burd);
    burd.setVisibility(View.INVISIBLE);

    relativeLayout.addView(burd);

    AlphaAnimation animation = 
        new AlphaAnimation(0.0F, 1.0F);
    animation.setDuration(duration);
    animation.setAnimationListener(this);
    burd.startAnimation(animation);
  }

  private void showScores() {
    int highScore = prefs.getInt("highScore", 0);
    
    if (countClicked > highScore) {
      highScore = countClicked;
      editor.putInt("highScore", highScore);
      editor.commit();
    }
    
    textView.setText("Your score: " + countClicked +
                     "\nHigh score: " + highScore);
  }

  /* OnClickListener method */

  public void onClick(View view) {
    countClicked++;
    ((ImageView) view).setImageResource
                             (R.drawable.burd_burger);
    view.setVisibility(View.VISIBLE);
  }

  /* AnimationListener methods */

  public void onAnimationEnd(Animation animation) {
    if (++countShown < NUMBER_OF_BURDS) {
      showABurd();
    } else {
      showScores();
    }
  }

  public void onAnimationRepeat(Animation arg0) {
  }

  public void onAnimationStart(Animation arg0) {
  }
}
