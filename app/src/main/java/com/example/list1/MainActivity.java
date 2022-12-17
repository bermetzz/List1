package com.example.list1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView studentsRecyclerView;
    private ArrayList<String> studentsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentsRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        StudentsAdapter adapter = new StudentsAdapter(studentsList);
        studentsRecyclerView.setAdapter(adapter);
    }
    private void loadData(){
        studentsList.add("Kate");
        studentsList.add("Nathan");
        studentsList.add("Maddy");
        studentsList.add("Alice");
        studentsList.add("John");
        studentsList.add("Blair");
        studentsList.add("Serena");
        studentsList.add("Chuck");
        studentsList.add("Rue");
        studentsList.add("Cass");
    }
}