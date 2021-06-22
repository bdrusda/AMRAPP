package com.example.amrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        View exerciseMedium = findViewById(R.id.exer1);
        //TODO this is what's breaking it, look into things
        Button addSetButton = exerciseMedium.findViewById(R.id.add_set);
        /*
        addSetButton.setOnClickListener(v -> addSet(v));
         */
    }

    public void addSet(View v) {
        Toast.makeText(this, "Add set clicked", Toast.LENGTH_SHORT).show();
        //TODO so now we want to create a new set_entry object and add it either above the button or below the last entry
    }
}