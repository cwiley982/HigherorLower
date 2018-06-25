package com.caitlynwiley.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int computerNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        computerNumber = rand.nextInt(20) + 1;
    }


    public void checkGuess(View view) {
        EditText userGuess = (EditText) findViewById(R.id.userGuess);
        int guess = Integer.parseInt(userGuess.getText().toString());

        String toastText = "";
        if (guess > computerNumber) {
            toastText = "Lower!";
        } else if (guess < computerNumber) {
            toastText = "Higher!";
        } else {
            toastText = "You guessed it! Try again!";
            Random rand = new Random();
            computerNumber = rand.nextInt(20) + 1;
        }

        Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
    }
}
