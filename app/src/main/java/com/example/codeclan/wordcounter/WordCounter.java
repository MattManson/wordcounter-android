package com.example.codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounter extends AppCompatActivity {

    EditText phraseEditText;
    TextView wordsNumber;
    Button countButton;
    TextView wordsByInstance;
    Words words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().toString(),"onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        phraseEditText = findViewById(R.id.inputText);
        wordsNumber = findViewById(R.id.result1);
        countButton = findViewById(R.id.countWordsButton);
        wordsByInstance = findViewById(R.id.result2);
    }

    public void onCountButtonClicked(View button){
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        String question = phraseEditText.getText().toString();
        Log.d(getClass().toString(), "The Phrase for counting is: '" + question + "'" );
        words = new Words(question);
        wordsNumber.setText(words.wordCount().toString());
        wordsByInstance.setText(words.instancesList().toString());
    }

}
