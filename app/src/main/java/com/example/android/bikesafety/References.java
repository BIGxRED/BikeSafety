/*
    Class used to show outside references in case the user is interested in additional information.
 */

package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class References extends AppCompatActivity {

    //Instances of all TextViews which will become hyperlinks to references used for this project
    TextView reference1;
    TextView reference2;
    TextView reference3;
    TextView reference4;
    TextView iconReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_references);
        Intent previousIntent = getIntent();

        //This needs to be performed for all TextViews so that the once the links are tapped by the
        //user, they are brought to the appropriate webpage.

        reference1 = (TextView) findViewById(R.id.reference1);
        reference1.setMovementMethod(LinkMovementMethod.getInstance());
        reference2 = (TextView) findViewById(R.id.reference2);
        reference2.setMovementMethod(LinkMovementMethod.getInstance());
        reference3 = (TextView) findViewById(R.id.reference3);
        reference3.setMovementMethod(LinkMovementMethod.getInstance());
        reference4 = (TextView) findViewById(R.id.reference4);
        reference4.setMovementMethod(LinkMovementMethod.getInstance());
        iconReference = (TextView) findViewById(R.id.iconReference);
        iconReference.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
