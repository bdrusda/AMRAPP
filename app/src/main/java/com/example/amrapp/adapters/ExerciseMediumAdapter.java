package com.example.amrapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.amrapp.R;
import com.example.amrapp.entities.ExerciseMedium;
import com.example.amrapp.entities.Set;
import com.example.amrapp.holders.ExerciseMediumHolder;
import com.example.amrapp.holders.SetHolder;

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
        View exercise = convertView;
        ExerciseMediumHolder holder = null;

        ExerciseMedium exerciseMedium = exercises.get(position);

        if (exercise == null) {
            exercise = LayoutInflater.from(getContext()).inflate(R.layout.exercise_medium, parent, false);

            holder = new ExerciseMediumHolder();
            holder.setLogo(exercise.findViewById(R.id.exercise_logo));
            holder.setName(exercise.findViewById(R.id.exercise_name));
            holder.setDescription(exercise.findViewById(R.id.exercise_description));
            holder.setSets(exercise.findViewById(R.id.set_list));
            exercise.setTag(holder);
        } else {
            holder = (ExerciseMediumHolder)exercise.getTag();
        }

        holder.getLogo().setText(exerciseMedium.getName().substring(0,1));
        holder.getName().setText(exerciseMedium.getName());
        holder.getDescription().setText(exerciseMedium.getDescription());
        //TODO we need to add the sets to the array adapter or something idk
        holder.getSets()

        return exercise;
    }
}
