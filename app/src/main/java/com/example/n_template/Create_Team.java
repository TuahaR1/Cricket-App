package com.example.n_template;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.n_template.ui.home.DashboardFragment;

public class Create_Team extends AppCompatActivity {
    Button create,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);

        create = findViewById(R.id.btn_create_createteam);
        back = findViewById(R.id.btn_back_createteam);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Create_Team.this, Add_player.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Create_Team.this, DashboardFragment.class);
                startActivity(intent);
            }
        });
    }
}