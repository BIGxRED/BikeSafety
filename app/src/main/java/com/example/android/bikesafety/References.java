package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class References extends AppCompatActivity {

    TextView reference1;
    TextView reference2;
    TextView reference3;
    TextView reference4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_references);
        Intent previousIntent = getIntent();
        reference1 = (TextView) findViewById(R.id.reference1);
        reference1.setMovementMethod(LinkMovementMethod.getInstance());
        reference2 = (TextView) findViewById(R.id.reference2);
        reference2.setMovementMethod(LinkMovementMethod.getInstance());
        reference3 = (TextView) findViewById(R.id.reference3);
        reference3.setMovementMethod(LinkMovementMethod.getInstance());
        reference4 = (TextView) findViewById(R.id.reference4);
        reference4.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
