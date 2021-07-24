package com.example.amrapp.holders;

import android.widget.TextView;

import com.example.amrapp.views.ResizableListView;

import lombok.Data;

@Data
public class ExerciseMediumHolder {
    TextView logo;
    TextView name;
    TextView description;
    ResizableListView sets;
}
