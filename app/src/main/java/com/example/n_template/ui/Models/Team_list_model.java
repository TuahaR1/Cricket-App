package com.example.n_template.ui.Models;

public class Team_list_model {

    String team_name;

    public Team_list_model(String team_name) {
        this.team_name = team_name;
    }

    public Team_list_model(){}

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
