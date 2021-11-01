package com.example.n_template.ui.Models;

public class View_team_model {
    String playername , role;
    int pic;
    public  View_team_model(){}

    public View_team_model(String playername, String role, int pic) {
        this.playername = playername;
        this.role = role;
        this.pic = pic;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

}
