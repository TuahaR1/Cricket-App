package com.example.n_template.ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.n_template.R;
import com.example.n_template.ui.Models.addplayer_model;

import java.util.ArrayList;

public class Add_player_adapter extends RecyclerView.Adapter<Add_player_adapter.view_holder> {



    Context context;
    ArrayList<addplayer_model> list;

    public Add_player_adapter(Context context, ArrayList<addplayer_model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_add_player,parent,false);
        return new view_holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class view_holder extends RecyclerView.ViewHolder
    {
        EditText name , phone , address , age , role;
        ImageView img;
        Button add , edit;
        public view_holder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.addplayer_sample_name);
            phone = itemView.findViewById(R.id.addplayer_sample_phone);
            address =itemView.findViewById(R.id.addplayer_sample_name);
            age = itemView.findViewById(R.id.addplayer_sample_age);
            role = itemView.findViewById(R.id.addplayer_sample_role);
            img = itemView.findViewById(R.id.profile_image_sample_addplayer);
            add =itemView.findViewById(R.id.btn_edit);
            edit = itemView.findViewById(R.id.btn_back_personalfragment);
        }
    }
}
