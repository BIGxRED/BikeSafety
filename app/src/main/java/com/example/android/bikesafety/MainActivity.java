package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.view.View.INVISIBLE;

public class MainActivity extends AppCompatActivity {

    //TODO: Take a picture of your bike and use it as a drawable background for the intro activity
    boolean flag;
    TextView welcomeText;
    Button previousButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeText = (TextView) findViewById(R.id.welcomeTextBody);
        previousButton = (Button) findViewById(R.id.previousButton);
        flag = false;
    }

    public void nextText(View view){
        if (flag == false){
            welcomeText.setText(R.string.introBodyText2);
            previousButton.setVisibility(View.VISIBLE);
            flag = true;
        }
        else {
            Intent intent = new Intent(this, Facts.class);
            startActivity(intent);
        }
    }

    public void previousText(View view){
        flag = false;
        welcomeText.setText(R.string.introBodyText1);
        previousButton.setVisibility(INVISIBLE);
    }
}
