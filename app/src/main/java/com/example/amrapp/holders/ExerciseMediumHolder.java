package com.example.amrapp.holders;

import android.widget.EditText;
import android.widget.TextView;

import com.example.amrapp.entities.Set;
import com.example.amrapp.views.ResizableListView;

import java.util.ArrayList;

public class ExerciseMediumHolder {
    TextView logo;
    TextView name;
    TextView description;
    ResizableListView sets;

    public TextView getLogo() {
        return logo;
    }

    public void setLogo(TextView logo) {
        this.logo = logo;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getDescription() {
        return description;
    }

    public void setDescription(TextView description) {
        this.description = description;
    }

    public ResizableListView getSets() {
        return sets;
    }

    public void setSets(ResizableListView sets) {
        this.sets = sets;
    }
}
