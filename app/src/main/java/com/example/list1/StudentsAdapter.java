package com.example.list1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsViewHolder> {
    private ArrayList<String> studentsList;

    public StudentsAdapter(ArrayList<String> studentsList) {
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StudentsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_students, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {
        holder.bind(studentsList.get(position));
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
}
