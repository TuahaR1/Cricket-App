package com.example.n_template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.n_template.ui.Adapters.join_team_list_adapter;
import com.example.n_template.ui.Models.Join_team_model;

import java.util.ArrayList;

public class Join_Team_req_list extends AppCompatActivity {

    RecyclerView Rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_team_req_list);
        getSupportActionBar().hide();

        Rc = findViewById(R.id.join_team_list_recyclerview);

        ArrayList<Join_team_model> list = new ArrayList<>();

        list.add(new Join_team_model("Team A"));
        list.add(new Join_team_model("Team B"));
        list.add(new Join_team_model("Team C"));
        list.add(new Join_team_model("Team D"));


        join_team_list_adapter adp = new join_team_list_adapter(this, list);
        LinearLayoutManager mng = new LinearLayoutManager(this);
        Rc.setAdapter(adp);
        Rc.setLayoutManager(mng);
    }
}