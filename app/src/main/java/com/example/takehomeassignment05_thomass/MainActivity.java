package com.example.takehomeassignment05_thomass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers); // declaring the variable to be stored

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() { // onclicklistener variable numbers from the textview linked to the id in XML
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) { //Onclick method is created.    This allows the user to control the button away from its host - more control and flexibility
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class); // goes to the family activity (class) and being a new intent
                Toast.makeText(view.getContext(), "Numbers", Toast.LENGTH_SHORT).show();
                // Start the new activity
                startActivity(numbersIntent); //Explicit intent because we know where the activity is going. 
            }
        });
        TextView family = (TextView) findViewById(R.id.family); // calling a TextView and delcaring the variable then casting to find the id in XML

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() { // declared variable is calling the onClick Listener
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) { // A method is created to store and perform this enclosed information
                // Create a new intent to open the {@link NumbersActivity}
                Intent familyIntent = new Intent(MainActivity.this, NumbersActivity.class);
                Toast.makeText(view.getContext(), "Family", Toast.LENGTH_SHORT).show();
                // Start the new activity
                startActivity(familyIntent);
            }
        });
        // Intent intent = new Intent(this, NumbersActivity.class); //linked to the class attribute
        //TextView theNumbers = (TextView) findViewById(R.id.numbers);
        //startActivity(intent); //calls the activity EXPLICIT intent


        TextView colorsLists = (TextView) findViewById(R.id.colors);

        colorsLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colors);
                Toast.makeText(MainActivity.this, "colorsLists", Toast.LENGTH_SHORT).show();

            }
        });


        TextView phrasesLists = (TextView) findViewById(R.id.phrases);

        phrasesLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
                Toast.makeText(MainActivity.this, "Phrases", Toast.LENGTH_SHORT).show();
            }
        });

    }}
/*
    public void openColorsList(View view) { //Won't be returning a value - linked to onClick
        Intent intent = new Intent(this, NumbersActivity.class); //linked to the class
        //TextView theNumbers = (TextView) findViewById(R.id.numbers);
        startActivity(intent); //calls the activity EXPLICIT intent
    }
    public void openPhrasesList(View view) { //Won't be returning a value - linked to onClick
        Intent intent = new Intent(this, NumbersActivity.class); //linked to the class
        //TextView theNumbers = (TextView) findViewById(R.id.numbers);
        startActivity(intent); //calls the activity EXPLICIT intent
    }}*/
