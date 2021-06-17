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
import com.example.separate_collection_app.Select_plastic.category_beaker;
import com.example.separate_collection_app.Select_plastic.category_bio_plastic;
import com.example.separate_collection_app.Select_plastic.category_cassette_tape;
import com.example.separate_collection_app.Select_plastic.category_disposable_container;
import com.example.separate_collection_app.Select_plastic.category_filament;
import com.example.separate_collection_app.Select_plastic.category_fishing_line;
import com.example.separate_collection_app.Select_plastic.category_lunch_box;
import com.example.separate_collection_app.Select_plastic.category_plastic_bottle;
import com.example.separate_collection_app.Select_plastic.category_protect_glass;
import com.example.separate_collection_app.Select_plastic.category_shampoo;
import com.example.separate_collection_app.Select_plastic.category_small_plastic;
import com.example.separate_collection_app.Select_plastic.category_strainer;
import com.example.separate_collection_app.Select_plastic.category_straw;
import com.example.separate_collection_app.Select_plastic.category_toothbrush;
import com.example.separate_collection_app.Select_plastic.category_toy;
import com.example.separate_collection_app.Select_plastic.category_wire_cloth;

public class category_Plastic extends Fragment {

    Button back_BT;
    Button straw_BT,strainer_BT,fishing_line_BT,lunch_box_BT,bio_plastic_BT,protect_glass_BT,beaker_BT,shampoo_BT,disposable_container_BT;
    Button small_plastic_BT,wire_cloth_BT,toy_BT,toothbrush_BT,cassette_tape_BT,plastic_bottle_BT,filament_BT;

    public static category_Plastic newInstance(){
        return new category_Plastic();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_plastic, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        straw_BT = (Button)v.findViewById(R.id.straw_bt);
        fishing_line_BT = (Button)v.findViewById(R.id.fishing_line_bt);
        lunch_box_BT = (Button)v.findViewById(R.id.lunch_box_bt);
        bio_plastic_BT = (Button)v.findViewById(R.id.bio_plastic_bt);
        protect_glass_BT = (Button)v.findViewById(R.id.protect_glasses_bt);
        beaker_BT = (Button)v.findViewById(R.id.beaker_bt);
        shampoo_BT = (Button)v.findViewById(R.id.shampoo_container_bt);
        disposable_container_BT = (Button)v.findViewById(R.id.disposable_container_bt);
        small_plastic_BT = (Button)v.findViewById(R.id.small_plastic_bt);
        wire_cloth_BT = (Button)v.findViewById(R.id.wire_cloth_bt);
        toy_BT = (Button)v.findViewById(R.id.toy_bt);
        toothbrush_BT = (Button)v.findViewById(R.id.toothbrush_bt);
        cassette_tape_BT = (Button)v.findViewById(R.id.cassette_tape_bt);
        plastic_bottle_BT = (Button)v.findViewById(R.id.plastic_bottle_bt);
        filament_BT = (Button)v.findViewById(R.id.filament_bt);
        strainer_BT = (Button)v.findViewById(R.id.strainer_bt);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(category_Plastic.this).commit();
                fragmentManager.popBackStack();

            }
        });

        straw_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_straw.newInstance());
            }
        });
        strainer_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_strainer.newInstance());
            }
        });
        fishing_line_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_fishing_line.newInstance());
            }
        });
        lunch_box_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_lunch_box.newInstance());
            }
        });
        bio_plastic_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_bio_plastic.newInstance());
            }
        });
        protect_glass_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_protect_glass.newInstance());
            }
        });
        beaker_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_beaker.newInstance());
            }
        });
        shampoo_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_shampoo.newInstance());
            }
        });
        disposable_container_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_disposable_container.newInstance());
            }
        });
        small_plastic_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_small_plastic.newInstance());
            }
        });
        wire_cloth_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_wire_cloth.newInstance());
            }
        });
        toy_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_toy.newInstance());
            }
        });
        toothbrush_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_toothbrush.newInstance());
            }
        });
        cassette_tape_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_cassette_tape.newInstance());
            }
        });
        plastic_bottle_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_plastic_bottle.newInstance());
            }
        });
        filament_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_filament.newInstance());
            }
        });


        return v;
    }

}
