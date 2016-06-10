package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Facts extends AppCompatActivity {

    int index = 0;

    String fact1_Header;
    String fact1_Body;

    String fact2_Header;
    String fact2_Body;

    String fact3_Header;
    String fact3_Body;

    ArrayList<String> bodyText = new ArrayList<String>();
    ArrayList<String> headerText = new ArrayList<String>();

    TextView facts_Body;
    TextView facts_Header;

    Button previousButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
        previousButton = (Button) findViewById(R.id.previousButton);
        setupArrays();
        Intent intent = getIntent();
        facts_Body = (TextView) findViewById(R.id.factBody);
        facts_Header = (TextView) findViewById(R.id.factHeader);
        facts_Header.setText(headerText.get(index));
        facts_Body.setText(bodyText.get(index));
        index++;
        Log.d("","App has been built!");
    }
    //TODO Need to correct the issues with the next and previous methods
    public void nextFact(View view){
        if (index == 1)
            previousButton.setVisibility(View.VISIBLE);
        if (index < bodyText.size()) {
            index++;
            facts_Header.setText(headerText.get(index));
            facts_Body.setText(bodyText.get(index));
        }
        Log.d("","This is the value of index: " + index);
    }

    public void previousFact(View view){
        Log.d("","This is the value of index: " + index);
        if (index == 1)
            previousButton.setVisibility(View.INVISIBLE);
        if (index >= 0) {
            index--;
            facts_Header.setText(headerText.get(index));
            facts_Body.setText(bodyText.get(index));
        }
        Log.d("","This is the value of index: " + index);
    }

    private void setupArrays(){
        fact1_Header = getString(R.string.fact1_header);
        fact1_Body = getString(R.string.fact1_body);

        fact2_Header = getString(R.string.fact2_header);
        fact2_Body = getString(R.string.fact2_body);

        fact3_Header = getString(R.string.fact3_header);
        fact3_Body = getString(R.string.fact3_body);

        bodyText.add(fact1_Body);
        bodyText.add(fact2_Body);
        bodyText.add(fact3_Body);

        headerText.add(fact1_Header);
        headerText.add(fact2_Header);
        headerText.add(fact3_Header);
    }


}
