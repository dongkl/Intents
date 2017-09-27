package com.example.engg6600.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextActivity(View view){
        Intent startIntent = new Intent(this, SecondActivity.class);
        startActivity(startIntent);

    }

    public void NextActivityPutExtra(View view){
        Intent startIntentWithExtra = new Intent(this, SecondActivityWithExtra.class);
        startIntentWithExtra.putExtra("com.example.engg6600.intents","Hello from 1006");
        startActivity(startIntentWithExtra);

    }

    public void NextActivityForResult(View view){
        Intent startIntentForResult = new Intent(this, SecondActivityForResult.class);
        startActivityForResult(startIntentForResult, 1);

    }

    public void GoToWebPage(View view){
        String url =  "http://www.uoguelph.ca";
        Uri webpage = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW);
        webIntent.setData(webpage);
        if(webIntent.resolveActivity(getPackageManager()) != null){
            startActivity(webIntent);
        }

    }

    public void GoToMap(View view){
        Uri location = Uri.parse("geo:39.6118,19.8306?z=8");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        if(mapIntent.resolveActivity(getPackageManager()) != null){
            startActivity(mapIntent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            String updateText = data.getStringExtra("com.example.engg6600.intents");
            TextView text = (TextView)findViewById(R.id.textView2);
            text.setText(updateText);
        }
    }
}
