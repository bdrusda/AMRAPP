package com.example.amrapp.entities;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.amrapp.R;
import com.example.amrapp.adapters.SetAdapter;
import com.example.amrapp.views.ResizableListView;

import java.util.ArrayList;

public class ExerciseMedium {
    Context context;
    String name;
    String description;

    LinearLayout exerciseMedium;
    LayoutInflater inflater;
    ArrayList<Set> sets;
    SetAdapter setAdapter;
    int setNumber;

    public ExerciseMedium(Context context, String name) {
        this(context, name, "");
    }

    public ExerciseMedium(Context context, String name, String description) {
        this.context = context;
        this.name = name.trim();
        this.description = description;

        // Create the Exercise Medium
        inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        this.exerciseMedium = (LinearLayout) inflater.inflate(R.layout.exercise_medium, null, false);

        // Set the Set Info
        TextView exerciseTitle = exerciseMedium.findViewById(R.id.exercise_title);
        exerciseTitle.setText(name);
        TextView exerciseLogo = exerciseMedium.findViewById(R.id.exercise_logo);
        exerciseLogo.setText(name.substring(0,1));

        // Create the Set List (initialized with base set)
        setNumber = 1;
        ResizableListView setList = exerciseMedium.findViewById(R.id.set_section).findViewById(R.id.set_list);
        sets = new ArrayList<>();
        sets.add(new Set(setNumber++));

        this.setAdapter = new SetAdapter(context, sets);
        setList.setAdapter(setAdapter);

        // Create Add Set button
        Button addSet = exerciseMedium.findViewById(R.id.add_set);
        addSet.setOnClickListener(v -> addSet());
    }

    private void addSet() {
        sets.add(new Set(setNumber++));
        setAdapter.notifyDataSetChanged();
    }

    public LinearLayout getExerciseMedium() {
        return exerciseMedium;
    }
}
