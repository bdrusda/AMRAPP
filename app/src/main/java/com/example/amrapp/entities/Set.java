package com.example.amrapp.entities;

import lombok.Setter;

@Setter
public class Set {
    private int number;
    private Integer reps;
    private Integer weight;

    public Set(int number) {
        this(number, null, null);
    }

    public Set(int number, Integer reps, Integer weight) {
        this.number = number;
        this.reps = reps;
        this.weight = weight;
    }

    public String getNumber() {
        return Integer.toString(number);
    }

    public String getReps() {
        return (reps != null) ? Integer.toString(reps) : "";
    }

    public String getWeight() {
        return (weight != null) ? Integer.toString(weight) : "";
    }
}
