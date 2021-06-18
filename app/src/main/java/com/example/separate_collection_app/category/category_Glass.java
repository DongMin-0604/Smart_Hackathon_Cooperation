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
import androidx.fragment.app.FragmentManager;

import com.example.separate_collection_app.Activity.MainActivity;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.Select_food.category_nuts;
import com.example.separate_collection_app.Select_glass.category_coffee_pot;
import com.example.separate_collection_app.Select_glass.category_cup;
import com.example.separate_collection_app.Select_glass.category_flower_pot;
import com.example.separate_collection_app.Select_glass.category_glass_bottle;
import com.example.separate_collection_app.Select_glass.category_glass_plate;
import com.example.separate_collection_app.Select_glass.category_holder;
import com.example.separate_collection_app.Select_glass.category_lamp;
import com.example.separate_collection_app.Select_glass.category_lid;
import com.example.separate_collection_app.Select_glass.category_porcelain;
import com.example.separate_collection_app.Select_glass.category_weighing;

public class category_Glass extends Fragment {

    Button back_BT;
    Button lid_BT,holder_BT,porcelain_BT,glass_bottle_BT,glass_plate_BT,weighing_BT,cup_BT,coffee_pot_BT,lamp_BT,flower_pot_BT;

    public static category_Glass newInstance(){
        return new category_Glass();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_glass, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        lid_BT = (Button)v.findViewById(R.id.lid_bt);
        holder_BT = (Button)v.findViewById(R.id.holder_bt);
        porcelain_BT = (Button)v.findViewById(R.id.porcelain_bt);
        glass_bottle_BT = (Button)v.findViewById(R.id.glass_bottle_bt);
        glass_plate_BT = (Button)v.findViewById(R.id.glass_plate_bt);
        weighing_BT = (Button)v.findViewById(R.id.weighing_bt);
        cup_BT = (Button)v.findViewById(R.id.cup_bt);
        coffee_pot_BT = (Button)v.findViewById(R.id.coffee_pot_bt);
        lamp_BT = (Button)v.findViewById(R.id.lamp_bt);
        flower_pot_BT = (Button)v.findViewById(R.id.flowerpot_bt);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(category_Glass.this).commit();
                fragmentManager.popBackStack();

            }
        });

        lid_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_lid.newInstance());
            }
        });

        holder_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_holder.newInstance());
            }
        });

        porcelain_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_porcelain.newInstance());
            }
        });

        glass_bottle_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_glass_bottle.newInstance());
            }
        });

        glass_plate_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_glass_plate.newInstance());
            }
        });

        weighing_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_weighing.newInstance());
            }
        });

        cup_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_cup.newInstance());
            }
        });

        coffee_pot_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_coffee_pot.newInstance());
            }
        });

        lamp_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_lamp.newInstance());
            }
        });

        flower_pot_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_flower_pot.newInstance());
            }
        });

        return v;
    }

}
