package com.example.list1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvStudents;
    public StudentsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvStudents = itemView.findViewById(R.id.tv_students);
    }
    public void bind(String students){
        tvStudents.setText(students);
    }
}
