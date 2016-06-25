/*
    The actual meat and potatoes of the app. All 5 facts are iteratively displayed to the user
     through the next button. If the user wishes, they can also view earlier facts through the
     previous button.
 */

package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Facts extends AppCompatActivity {

    int index = 0;  //Keeps track of which fact and header are being displayed

    String fact1_Header;    //String variables which store the headers and body text for each of the
    String fact1_Body;      //facts, which are all stored in strings.xml

    String fact2_Header;
    String fact2_Body;

    String fact3_Header;
    String fact3_Body;

    String fact4_Header;
    String fact4_Body;

    String fact5_Header;
    String fact5_Body;

    ArrayList<String> bodyText = new ArrayList<String>();   //ArrayLists which store the header and
    ArrayList<String> headerText = new ArrayList<String>(); //body strings

    TextView facts_Body;
    TextView facts_Header;

    Button previousButton;  //Instatiated so that the visibility of this button can be turned
                            //on and off
    Intent intent;  //Intent which will be used to launch the References activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
        previousButton = (Button) findViewById(R.id.previousButton);
        setupArrays();  //Sets up the ArrayLists so that the Strings are ready once the activity is
                        //launched
        Intent previousIntent = getIntent();    //Intent handling
        //Preparing these variables so that they're available for the nextFact and previousFact
        //methods
        facts_Body = (TextView) findViewById(R.id.factBody);
        facts_Header = (TextView) findViewById(R.id.factHeader);
    }

    /**
     * Iterates through the ArrayList objects in the forward direction in order to display the
     * next fact to the user.
     *
     * @param view Necessary parameter for the function to operate
     */
    public void nextFact(View view){
        if ((index+1) < bodyText.size()) {
            index++;    //Increment index to move onto the next fact

            //The previous button should now be displayed only if we're past the very first fact
            //i.e., index has been incremented past 0
            if (index == 1)
                previousButton.setVisibility(View.VISIBLE);
            facts_Header.setText(headerText.get(index));    //Display the fact
            facts_Body.setText(bodyText.get(index));
        }
        else{
            //If we've gone through all of the facts, start the next Intent
            intent = new Intent (this, References.class);
            startActivity(intent);
        }
    }

    /**
     * Iterates through the ArrayList objects in the backward direction so that the previous facts
     * are displayed. It also makes the previous button invisible if necessary (we arrive back to
     * the first fact, index == 0)
     *
     * @param view Necessary parameter for the function to operate
     */
    public void previousFact(View view){
        //If we're going back to the first fact, remove the previous button
        if (index == 1)
            previousButton.setVisibility(View.INVISIBLE);
        //Otherwise, decrement index and show the previous fact
        if (index > 0) {
            index--;
            facts_Header.setText(headerText.get(index));
            facts_Body.setText(bodyText.get(index));
        }
    }

    /**
     * Sets up the ArrayLists for the header and body text so that they already have the elements
     * correctly stored for the nextFact and previousFact methods.
     */
    private void setupArrays(){
        //Pull the strings from strings.xml
        fact1_Header = getString(R.string.fact1_header);
        fact1_Body = getString(R.string.fact1_body);

        fact2_Header = getString(R.string.fact2_header);
        fact2_Body = getString(R.string.fact2_body);

        fact3_Header = getString(R.string.fact3_header);
        fact3_Body = getString(R.string.fact3_body);

        fact4_Header = getString(R.string.fact4_header);
        fact4_Body = getString(R.string.fact4_body);

        fact5_Header = getString(R.string.fact5_header);
        fact5_Body = getString(R.string.fact5_body);

        //Store them into the arrays accordingly
        bodyText.add(fact1_Body);
        bodyText.add(fact2_Body);
        bodyText.add(fact3_Body);
        bodyText.add(fact4_Body);
        bodyText.add(fact5_Body);

        headerText.add(fact1_Header);
        headerText.add(fact2_Header);
        headerText.add(fact3_Header);
        headerText.add(fact4_Header);
        headerText.add(fact5_Header);

    }


}
