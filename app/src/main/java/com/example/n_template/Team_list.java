package com.example.n_template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.n_template.ui.Adapters.team_list_adapter;
import com.example.n_template.ui.Models.Team_list_model;

import java.util.ArrayList;

public class Team_list extends AppCompatActivity {

    RecyclerView Rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        Rc = findViewById(R.id.team_list_recyclerview);

        ArrayList<Team_list_model> list = new ArrayList<>();

        list.add(new Team_list_model("Team A"));
        list.add(new Team_list_model("Team B"));
        list.add(new Team_list_model("Team C"));
        list.add(new Team_list_model("Team D"));


        team_list_adapter adp = new team_list_adapter(this, list);
        LinearLayoutManager mng = new LinearLayoutManager(this);
        Rc.setAdapter(adp);
        Rc.setLayoutManager(mng);
    }
}