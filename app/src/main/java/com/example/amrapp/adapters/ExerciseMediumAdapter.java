package com.example.amrapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.amrapp.R;
import com.example.amrapp.entities.ExerciseMedium;
import com.example.amrapp.entities.Set;
import com.example.amrapp.holders.ExerciseMediumHolder;
import com.example.amrapp.holders.SetHolder;
import com.example.amrapp.views.ResizableListView;

import java.util.ArrayList;

public class ExerciseMediumAdapter extends ArrayAdapter<ExerciseMedium> {
    private final Context context;
    private final ArrayList<ExerciseMedium> exercises;

    public ExerciseMediumAdapter(Context context, ArrayList<ExerciseMedium> exerciseArrayList) {
        super(context, R.layout.exercise_medium, exerciseArrayList);
        this.context = context;
        this.exercises = exerciseArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View exerciseView = convertView;
        ExerciseMediumHolder holder = null;

        ExerciseMedium exerciseMedium = exercises.get(position);

        if (exerciseView == null) {
            exerciseView = LayoutInflater.from(getContext()).inflate(R.layout.exercise_medium, parent, false);

            holder = new ExerciseMediumHolder();
            holder.setLogo(exerciseView.findViewById(R.id.exercise_logo));
            holder.setName(exerciseView.findViewById(R.id.exercise_name));
            holder.setDescription(exerciseView.findViewById(R.id.exercise_description));
            holder.setSets(exerciseView.findViewById(R.id.set_list));
            exerciseView.setTag(holder);
        } else {
            holder = (ExerciseMediumHolder)exerciseView.getTag();
        }

        // Set the Exercise Info
        holder.getLogo().setText(exerciseMedium.getName().substring(0,1));
        holder.getName().setText(exerciseMedium.getName());
        holder.getDescription().setText(exerciseMedium.getDescription());
        holder.getSets().setAdapter(exerciseMedium.getSetAdapter());

        // Initialize the Add Set Button
        exerciseMedium.initializeAddSetButton(exerciseView.findViewById(R.id.add_set));

        return exerciseView;
    }
}
