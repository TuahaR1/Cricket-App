package com.example.n_template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.n_template.ui.Adapters.View_team_adapter;
import com.example.n_template.ui.Models.View_team_model;

import java.util.ArrayList;

public class View_team extends AppCompatActivity {

    RecyclerView Rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_team);
        Rc = findViewById(R.id.view_team_recyclerview);

        ArrayList<View_team_model> list = new ArrayList<>();

        list.add(new View_team_model("Tuaha","Batsman",R.drawable.camera));
        list.add(new View_team_model("Zaka","Bowler",R.drawable.camera));
        list.add(new View_team_model("Nadeem ","All Rounder",R.drawable.camera));
        list.add(new View_team_model("Tuaha","Batsman",R.drawable.camera));


        View_team_adapter adp = new View_team_adapter(this, list);
        LinearLayoutManager mng = new LinearLayoutManager(this);
        Rc.setAdapter(adp);
        Rc.setLayoutManager(mng);
    }
}