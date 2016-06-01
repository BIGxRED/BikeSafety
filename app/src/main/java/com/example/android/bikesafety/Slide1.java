package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Slide1 extends AppCompatActivity {

    int index = 0;

    String fact1_Header = getString(R.string.fact1_header);
    String fact1_Body = getString(R.string.fact1_body);

    String fact2_Header = getString(R.string.fact2_header);
    String fact2_Body = getString(R.string.fact2_body);

    String fact3_Header = getString(R.string.fact3_header);
    String fact3_Body = getString(R.string.fact3_body);

    ArrayList<String> bodyText = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);
        Intent intent = getIntent();
        setupArrays();
    }

    public void displayFacts(View view){
        TextView facts_Body = (TextView) findViewById(R.id.factTextField);
        if (index < bodyText.size()) {
            facts_Body.setText(bodyText.get(index));
            index++;
        }
    }

    private void setupArrays(){
        bodyText.add(fact1_Body);
        bodyText.add(fact2_Body);
        bodyText.add(fact3_Body);
    }


}
