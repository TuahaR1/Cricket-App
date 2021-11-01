package com.example.n_template.ui.Models;

public class addplayer_model {

    public addplayer_model(){}

    String playername, phone_number,age ,address ,role_of_player;
    int pic;

    public addplayer_model(String playername, String phone_number, String age, String address, String role_of_player, int pic) {
        this.playername = playername;
        this.phone_number = phone_number;
        this.age = age;
        this.address = address;
        this.role_of_player = role_of_player;
        this.pic = pic;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole_of_player() {
        return role_of_player;
    }

    public void setRole_of_player(String role_of_player) {
        this.role_of_player = role_of_player;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
