package com.example.szidonialaszlo.myfirstapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //to display the message that was passed by the first activity

        //Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

        String hello = getResources().getString(R.string.hello_world); //get string value from res -> values -> strings.xml

        /* VAGY
        TextView textView = new TextView(this);
        textView.setText(R.string.hello_world);
         */

    }
}
