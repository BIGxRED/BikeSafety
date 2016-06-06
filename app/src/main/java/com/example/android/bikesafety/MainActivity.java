package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flag = false;
    }

    public void displayText(View view){
        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextBody);
        if (flag == false){
            welcomeText.setText(R.string.introBodyText2);
            flag = true;
        }
        else {
            Intent intent = new Intent(this, Facts.class);
            startActivity(intent);
        }
    }
}
