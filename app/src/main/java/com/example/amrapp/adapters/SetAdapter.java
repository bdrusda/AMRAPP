package com.example.amrapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.amrapp.R;
import com.example.amrapp.holders.SetHolder;
import com.example.amrapp.entities.Set;

import java.util.ArrayList;

public class SetAdapter extends ArrayAdapter<Set> {
    private final Context context;
    private final ArrayList<Set> setList;

    public SetAdapter(Context context, ArrayList<Set> setArrayList) {
        super(context, R.layout.set_entry, setArrayList);
        this.context = context;
        this.setList = setArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View setView = convertView;
        SetHolder holder = null;

        Set set = setList.get(position);

        if (setView == null) {
            setView = LayoutInflater.from(getContext()).inflate(R.layout.set_entry, parent, false);

            holder = new SetHolder();
            holder.setSetNumber(setView.findViewById(R.id.set_number));
            holder.setReps(setView.findViewById(R.id.reps));
            holder.setWeight(setView.findViewById(R.id.weight));

            setView.setTag(holder);
        } else {
            holder = (SetHolder)setView.getTag();
        }

        holder.getSetNumber().setText(set.getNumber());
        holder.getReps().setText(set.getReps());
        holder.getWeight().setText(set.getWeight());

        return setView;
    }
}
