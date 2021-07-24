package com.example.amrapp.entities;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.amrapp.R;
import com.example.amrapp.adapters.ExerciseMediumAdapter;
import com.example.amrapp.adapters.SetAdapter;
import com.example.amrapp.views.ResizableListView;

import java.util.ArrayList;

public class ActiveWorkout {
    Context context;

    RelativeLayout workoutActive;
    LayoutInflater inflater;
    ArrayList<ExerciseMedium> exercises;
    ExerciseMediumAdapter exerciseMediumAdapter;

    public ActiveWorkout(Context context) {
        this.context = context;

        // Create the Active Workout
        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        this.workoutActive = (RelativeLayout) inflater.inflate(R.layout.workout_active, null, false);

        // Create the Exercise List
        ListView exerciseSection = workoutActive.findViewById(R.id.exercise_list);
        exercises = new ArrayList<>();

        this.exerciseMediumAdapter = new ExerciseMediumAdapter(context, exercises);
        exerciseSection.setAdapter(exerciseMediumAdapter);

        // Create Add Exercise button
        Button addSet = workoutActive.findViewById(R.id.add_exercise);
        addSet.setOnClickListener(v -> addExercise());
    }

    private void addExercise() {
        exercises.add(new ExerciseMedium(context, "Barbell Bench", "bench press with olympic barbell"));
        exerciseMediumAdapter.notifyDataSetChanged();
    }

    public RelativeLayout getWorkoutActive() {
        return workoutActive;
    }
}
