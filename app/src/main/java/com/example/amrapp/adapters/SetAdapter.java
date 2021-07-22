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
        View setEntry = convertView;
        SetHolder holder = null;

        Set set = setList.get(position);

        if (setEntry == null) {
            setEntry = LayoutInflater.from(getContext()).inflate(R.layout.set_entry, parent, false);

            holder = new SetHolder();
            holder.setSetNumber(setEntry.findViewById(R.id.set_number));
            holder.setReps(setEntry.findViewById(R.id.reps));
            holder.setWeight(setEntry.findViewById(R.id.weight));

            setEntry.setTag(holder);
        } else {
            holder = (SetHolder)setEntry.getTag();
        }

        holder.getSetNumber().setText(set.getNumber());
        holder.getReps().setText(set.getReps());
        holder.getWeight().setText(set.getWeight());

        return setEntry;
    }
}
