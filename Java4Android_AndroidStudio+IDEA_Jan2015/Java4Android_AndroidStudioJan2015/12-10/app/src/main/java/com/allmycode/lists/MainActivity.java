package com.allmycode.lists;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
  static CheckBox[] checkBoxes = new CheckBox[5];
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    LinearLayout layout = 
        (LinearLayout) findViewById(R.id.linearLayout);
    for (int i = 0; i < 5; i++) {
      checkBoxes[i] = new CheckBox(this);
      layout.addView(checkBoxes[i]);
    }
  }
  
  public void onShowListClick(View view) {
    Intent intent =
        new Intent(this, MyListActivity.class);
    startActivity(intent);
  }
}
