package com.example.new2pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button newButton;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newButton = findViewById(R.id.button8);
        text = findViewById(R.id.textView1);
        ArrayList<String> myList = new ArrayList<>();
        int max = 99;
        int min = 1;
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = (int)Math.floor(Math.random()*(max-min+1)+min);
                String ran_num = String.valueOf(num);
                boolean contains;
                contains = myList.contains(ran_num);
                if(!contains)
                {
                    myList.add(ran_num);
                    text.setText(ran_num);
                }
                else{
                    text.setText("oops");
                }
            }
        });
    }
}

