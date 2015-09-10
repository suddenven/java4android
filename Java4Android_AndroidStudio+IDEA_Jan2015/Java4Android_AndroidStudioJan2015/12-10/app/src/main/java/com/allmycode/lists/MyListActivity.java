package com.allmycode.lists;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyListActivity extends ListActivity {

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    
    ArrayList<Integer> listItems =
        new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      if (MainActivity.checkBoxes[i].isChecked()) {
        listItems.add(i);
      }
    }

    setListAdapter(new ArrayAdapter<Integer>(this,
        R.layout.my_list_layout, listItems));
  }
}
