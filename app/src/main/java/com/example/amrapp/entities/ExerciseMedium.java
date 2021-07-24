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

import lombok.Data;

@Data
public class ExerciseMedium {
    Context context;
    String name;
    String description;

    LinearLayout exerciseMedium;
    LayoutInflater inflater;

    ArrayList<Set> sets;
    SetAdapter setAdapter;
    int setNumber;

    public ExerciseMedium(Context context, String name, String description) {
        this.context = context;
        this.name = name.trim();
        this.description = description;

        // Create the Set List (initialized with base set)
        setNumber = 1;
        sets = new ArrayList<>();
        sets.add(new Set(setNumber++));
        setAdapter = new SetAdapter(context, sets);
    }

    public void initializeAddSetButton(Button button) {
        button.setOnClickListener(v -> addSet());
    }

    private void addSet() {
        sets.add(new Set(setNumber++));
        setAdapter.notifyDataSetChanged();
    }
}
