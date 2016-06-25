/*
    Main activity of the app. Displays a welcome message to the user to explain the growing
    popularity of biking and the importance of bicycle safety on the road.
 */

package com.example.android.bikesafety;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.INVISIBLE;

public class MainActivity extends AppCompatActivity {

    boolean flag;   //Used to switch between the first and second part of the welcome message
    TextView welcomeText;
    Button previousButton;  //Instantiated in order to set it visible/invisible

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeText = (TextView) findViewById(R.id.welcomeTextBody);
        previousButton = (Button) findViewById(R.id.previousButton);
        flag = false;
    }

    /**
     * Displays the second part of the welcome message and enables the previous button to be
     * visible on the first tap. If the next button is tapped again, the Facts activity will be
     * launched through the Intent object.
     *
     * @param view Necessary parameter for the function to operate
     */
    public void nextText(View view){
        //If the button hasn't been pressed yet, display the second part of the welcome text
        if (flag == false){
            welcomeText.setText(R.string.introBodyText2);
            previousButton.setVisibility(View.VISIBLE);
            flag = true;
        }
        //If the next button has been pressed twice, start the next Intent
        else {
            Intent intent = new Intent(this, Facts.class);
            startActivity(intent);
        }
    }

    /**
     * If the previous button is tapped, flag is reset to false (in order for nextText to operate
     * correctly) and the previous button is invisible.
     *
     * @param view Necessary parameter for the function to operate
     */
    public void previousText(View view){
        flag = false;   //Reset the flag variable
        welcomeText.setText(R.string.introBodyText1);   //Reset the text
        previousButton.setVisibility(INVISIBLE);    //Previous button no longer visible
    }
}
