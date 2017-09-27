package com.example.engg6600.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivityWithExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity_with_extra);

        Intent receivedIntent = getIntent();
        String updateText = receivedIntent.getStringExtra("com.example.engg6600.intents");
        TextView text = (TextView)findViewById(R.id.textView3);
        text.setText(updateText);
    }
}
