package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    public void reverseWord(View view) {

        EditText editText = findViewById(R.id.word);
        EditText answer = findViewById(R.id.Reverse);
        String reverse="";

        //get the text written in the editText input field
        String text = editText.getText().toString();
        int length = text.length();
        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + text.charAt(i);
        //Log.i("ok","ok");
        answer.setText(reverse);
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}