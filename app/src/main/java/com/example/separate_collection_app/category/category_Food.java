package com.example.separate_collection_app.category;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.separate_collection_app.Activity.MainActivity;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.Select_food.category_bone;
import com.example.separate_collection_app.Select_food.category_corn;
import com.example.separate_collection_app.Select_food.category_crab;
import com.example.separate_collection_app.Select_food.category_egg;
import com.example.separate_collection_app.Select_food.category_fish_bone;
import com.example.separate_collection_app.Select_food.category_fruit;
import com.example.separate_collection_app.Select_food.category_gum;
import com.example.separate_collection_app.Select_food.category_nuts;
import com.example.separate_collection_app.Select_food.category_onion;
import com.example.separate_collection_app.Select_food.category_root;
import com.example.separate_collection_app.Select_food.category_salted_fish;
import com.example.separate_collection_app.Select_food.category_seeds_of_nuclear;
import com.example.separate_collection_app.Select_food.category_shellfish;
import com.example.separate_collection_app.Select_food.category_tangerine;

public class category_Food extends Fragment {

    Button back_BT;
    Button crab_BT,nuts_BT,tangerine_BT,fruit_BT,bone_BT,egg_BT,fish_bone_BT,
    root_BT,onion_BT,corn_BT,shellfish_BT,salted_fish_BT,seeds_of_nuclear_BT,gum_BT;

    public static category_Food newInstance(){
        return new category_Food();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_food, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        crab_BT = (Button)v.findViewById(R.id.crab_bt);
        nuts_BT = (Button)v.findViewById(R.id.nuts_bt);
        tangerine_BT = (Button)v.findViewById(R.id.tangerine_bt);
        fruit_BT = (Button)v.findViewById(R.id.fruit_bt);
        bone_BT = (Button)v.findViewById(R.id.bone_bt);
        egg_BT = (Button)v.findViewById(R.id.egg_bt);
        fish_bone_BT = (Button)v.findViewById(R.id.fish_bone_bt);
        root_BT = (Button)v.findViewById(R.id.root_bt);
        onion_BT = (Button)v.findViewById(R.id.onion_bt);
        corn_BT = (Button)v.findViewById(R.id.corn_bt);
        shellfish_BT = (Button)v.findViewById(R.id.shellfish_bt);
        salted_fish_BT = (Button)v.findViewById(R.id.salted_fish_bt);
        seeds_of_nuclear_BT = (Button)v.findViewById(R.id.seed_of_nuclear_bt);
        gum_BT = (Button)v.findViewById(R.id.gum_bt);

        crab_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_crab.newInstance());
            }
        });

        nuts_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_nuts.newInstance());
            }
        });

        tangerine_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_tangerine.newInstance());
            }
        });

        fruit_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_fruit.newInstance());
            }
        });

        bone_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_bone.newInstance());
            }
        });

        egg_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_egg.newInstance());
            }
        });

        fish_bone_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_fish_bone.newInstance());
            }
        });

        root_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_root.newInstance());
            }
        });

        onion_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_onion.newInstance());
            }
        });

        corn_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_corn.newInstance());
            }
        });

        shellfish_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_shellfish.newInstance());
            }
        });

        salted_fish_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_salted_fish.newInstance());
            }
        });

        seeds_of_nuclear_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_seeds_of_nuclear.newInstance());
            }
        });

        gum_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_gum.newInstance());
            }
        });



        back_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_food =new Intent(getActivity(),MainActivity.class);
                startActivity(intent_food);

            }
        });

        return v;
    }

}
