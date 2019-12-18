package com.example.szidonialaszlo.myfirstapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE  = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view){
        //Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        /* 1 parameter - Context | this - is used because the Activity class is a subclass of Context
          2 parameter - class |
         */
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        /*
            adds the EditText's value to the intent
            key - value : key  - public constant
         */
        startActivity(intent);
        //starts an intance of the DisplayMessageActivity specified by the Intent
    }
}
