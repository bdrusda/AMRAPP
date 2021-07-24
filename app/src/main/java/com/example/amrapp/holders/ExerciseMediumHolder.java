package com.example.amrapp.holders;

import android.widget.EditText;
import android.widget.TextView;

import com.example.amrapp.entities.Set;

import java.util.ArrayList;

public class ExerciseMediumHolder {
    String name;
    String description;
    ArrayList<Set> sets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Set> getSets() {
        return sets;
    }

    public void setSets(ArrayList<Set> sets) {
        this.sets = sets;
    }

}
