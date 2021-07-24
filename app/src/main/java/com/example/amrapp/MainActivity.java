package com.example.amrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.amrapp.adapters.SetAdapter;
import com.example.amrapp.entities.ActiveWorkout;
import com.example.amrapp.entities.ExerciseMedium;
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

        ActiveWorkout activeWorkout = new ActiveWorkout(this);

        //Add the workoutView
        mainActivityBody.addView(activeWorkout.getWorkoutActive());
    }
}