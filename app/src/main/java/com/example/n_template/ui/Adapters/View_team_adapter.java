package com.example.n_template.ui.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.n_template.Detail_player;
import com.example.n_template.R;
import com.example.n_template.ui.Models.View_team_model;

import java.util.ArrayList;

public class View_team_adapter extends RecyclerView.Adapter<View_team_adapter.view_holder> {

    Context context;
    ArrayList<View_team_model> list;

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_view_team,parent,false);
        return new View_team_adapter.view_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {

        View_team_model model = list.get(position);
        holder.name.setText(model.getPlayername());
        holder.role.setText(model.getRole());
        holder.pic.setImageResource(model.getPic());
        holder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detail_player.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public View_team_adapter(Context context, ArrayList<View_team_model> list) {
        this.context = context;
        this.list = list;
    }

    public class view_holder extends RecyclerView.ViewHolder
    {
        TextView name , role;
        Button drop , detail;
        ImageView pic;
        public view_holder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.view_team_sample_name);
            role = itemView.findViewById(R.id.view_team_sample_role);
            drop = itemView.findViewById(R.id.drop_btn_sample_view_team);
            detail = itemView.findViewById(R.id.detail_btn_sample_view_team);
            pic = itemView.findViewById(R.id.profile_image_sample_view_team);
        }
    }
}
