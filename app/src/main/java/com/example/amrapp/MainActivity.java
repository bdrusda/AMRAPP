package com.example.amrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.amrapp.adapters.SetAdapter;
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

        // Create a workoutView
        LinearLayout workoutView = (LinearLayout)getLayoutInflater().inflate(R.layout.workout_active, null, false);
        LinearLayout exerciseSection = workoutView.findViewById(R.id.exercise_section);

        /*TODO so now we're going to create a WorkoutView class
            and in that class we will have an add exercise button (we can temporarily start it with one)
            and we'll set it up to add ExerciseMedium objects - like ExerciseMedium adds Set objects
                so we'll probably need to create an ExerciseMediumAdapter and Holder as well
                    actually it's a scroll view so will we?  maybe
            Once that's done we'll be able to just create the WorkoutView here
            and MainActivity will be a lot cleaner
         */


        //Create a exerciseMedium
        ExerciseMedium exerciseMedium = new ExerciseMedium(this, "Barbell Bench");

        //Add the exerciseMedium
        exerciseSection.addView(exerciseMedium.getExerciseMedium());

        //Add the workoutView
        mainActivityBody.addView(workoutView);
    }
}