package com.example.gaurav.superdev;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // load view form xml.
        setContentView(R.layout.activity_main);


        // uncommenting below will require commenting above view creation and show how to create views in android using java
        // createViewProgramatically();
    }

    private void createViewProgramatically() {
        // uncomment below line to create text view using java
        // addTextView();

        // uncomment below line to create view group using java
        // addMultipleView();
    }

    private void addTextView() {
        TextView tv = new TextView(this);
        tv.setAllCaps(true);
        tv.setText("Hello World");
        setContentView(tv);
    }

    private void addMultipleView() {
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        TextView tv = new TextView(this);
        tv.setAllCaps(true);
        tv.setText("Hello World");

        TextView tv1 = new TextView(this);
        tv1.setAllCaps(true);
        tv1.setText("Imam will create new world for all");
        tv1.setTextColor(Color.BLUE);
        tv1.setTextSize(15);

        Button button = new Button(this);
        button.setText("Start Show");

        ll.addView(tv);
        ll.addView(button);
        ll.addView(tv1);

        setContentView(ll);
    }
}
