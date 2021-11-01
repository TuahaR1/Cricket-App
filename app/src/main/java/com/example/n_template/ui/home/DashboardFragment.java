package com.example.n_template.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.n_template.Add_player;
import com.example.n_template.Create_Team;
import com.example.n_template.Detail_player;
import com.example.n_template.Join_Team;
import com.example.n_template.Join_Team_req_list;
import com.example.n_template.MainActivity;
import com.example.n_template.R;
import com.example.n_template.Ranking;
import com.example.n_template.Select_player;
import com.example.n_template.Set_Match;
import com.example.n_template.Team_list;
import com.example.n_template.Umpiring;
import com.example.n_template.View_team;
import com.example.n_template.Virtual_Umpiring;
import com.example.n_template.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentDashboardBinding binding;
    ImageView crteam,viewteam, virtualump,setmatch, joinmatch,rankingplayer;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);


        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        crteam = root.findViewById(R.id.imgv_createam);
        viewteam = root.findViewById(R.id.imgv_viewteam);
        virtualump=root.findViewById(R.id.imv_virtual_ump);
        setmatch = root.findViewById(R.id.imgv_setmatch);
        joinmatch = root.findViewById(R.id.imgv_joinmatch);
        rankingplayer = root.findViewById(R.id.imgv_ratingplayer);

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//          @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        crteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(getActivity(), Create_Team.class);
            startActivity(intent);
            }
        });
        viewteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), View_team.class);
                startActivity(intent);
            }
        });
        virtualump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Virtual_Umpiring.class);
                startActivity(intent);
            }
        });
        setmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Set_Match.class);
                startActivity(intent);
            }
        });
        joinmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Join_Team.class);
                startActivity(intent);
            }
        });
        rankingplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Ranking.class);
                startActivity(intent);
            }
        });


        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}