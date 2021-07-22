package com.example.amrapp.entities;

public class Set {
    private int number;
    private int reps;
    private int weight;

    public Set(int number, int reps, int weight) {
        this.number = number;
        this.reps = reps;
        this.weight = weight;
    }

    public String getNumber() {
        return Integer.toString(number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getReps() {
        return Integer.toString(reps);
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getWeight() {
        return Integer.toString(weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
