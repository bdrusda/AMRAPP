package com.example.amrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.amrapp.adapters.SetAdapter;
import com.example.amrapp.entities.Set;
import com.example.amrapp.views.ResizableListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            this.getSupportActionBar().hide();
        } catch(NullPointerException e) {}

        // Get the mainActivity
        LinearLayout mainActivityBody = findViewById(R.id.body);

        // Create a workoutView
        LinearLayout workoutView = (LinearLayout)getLayoutInflater().inflate(R.layout.workout_active, null, false);
        LinearLayout exerciseSection = workoutView.findViewById(R.id.exercise_section);

        //Create a exerciseMedium
        LinearLayout exerciseView = (LinearLayout)getLayoutInflater().inflate(R.layout.exercise_medium, null, false);
        ResizableListView setList = exerciseView.findViewById(R.id.set_section).findViewById(R.id.set_list);



        //TODO we want to create an arrayAdapter that takes setEntry
        ArrayList<Set> setArrayList = new ArrayList<>();
        setArrayList.add(new Set(1, 10, 50));
        setArrayList.add(new Set(2, 5, 25));
        setArrayList.add(new Set(3, 5, 2));
        setArrayList.add(new Set(4, 8, 185));
        setArrayList.add(new Set(5, 15, 135));

        SetAdapter setAdapter = new SetAdapter(MainActivity.this, setArrayList);
        setList.setAdapter(setAdapter);

        Button addSet = exerciseView.findViewById(R.id.add_set);
        addSet.setOnClickListener(v -> {
            setArrayList.add(new Set(0, 0, 0));
            setAdapter.notifyDataSetChanged();
        });










        //Add the exerciseMedium
        exerciseSection.addView(exerciseView);

        //Add the workoutView
        mainActivityBody.addView(workoutView);
    }
}