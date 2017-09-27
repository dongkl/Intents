package com.example.engg6600.intents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivityForResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity_for_result);
    }

    public void ReturnResult(View view){
        Intent returnIntent = new Intent();
        EditText number = (EditText)findViewById(R.id.editText);
        String returnNumber = number.getText().toString();
        returnIntent.putExtra("com.example.engg6600.intents",returnNumber);
        setResult(Activity.RESULT_OK,returnIntent);
        finish();

    }

}
