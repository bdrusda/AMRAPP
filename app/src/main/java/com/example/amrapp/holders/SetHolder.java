package com.example.amrapp.holders;

import android.widget.EditText;
import android.widget.TextView;

public class SetHolder {
    TextView setNumber;
    EditText reps;
    EditText weight;

    public TextView getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(TextView setNumber) {
        this.setNumber = setNumber;
    }

    public EditText getReps() {
        return reps;
    }

    public void setReps(EditText reps) {
        this.reps = reps;
    }

    public EditText getWeight() {
        return weight;
    }

    public void setWeight(EditText weight) {
        this.weight = weight;
    }
}
