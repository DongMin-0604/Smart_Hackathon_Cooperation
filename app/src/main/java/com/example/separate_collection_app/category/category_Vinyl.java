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
import com.example.separate_collection_app.Select_Vinyl.category_air_cap;
import com.example.separate_collection_app.Select_Vinyl.category_coffee_bag;
import com.example.separate_collection_app.Select_Vinyl.category_noodle_bag;
import com.example.separate_collection_app.Select_Vinyl.category_pill_packaging;
import com.example.separate_collection_app.Select_Vinyl.category_plastic_bag;
import com.example.separate_collection_app.Select_Vinyl.category_snack_bag;
import com.example.separate_collection_app.Select_Vinyl.category_wrap;

public class category_Vinyl extends Fragment {

    Button back_BT;
    Button noodle_bag_BT,snack_bag_BT,wrap_BT,plastic_bag_BT,air_cap_BT,pill_packaging_BT,coffee_bag_BT;

    public static category_Vinyl newInstance(){
        return new category_Vinyl();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_vinyl, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        noodle_bag_BT = (Button)v.findViewById(R.id.noodle_bag_bt);
        snack_bag_BT = (Button)v.findViewById(R.id.snack_bag_bt);
        wrap_BT = (Button)v.findViewById(R.id.wrap_bt);
        plastic_bag_BT = (Button)v.findViewById(R.id.plastic_bag_bt);
        air_cap_BT = (Button)v.findViewById(R.id.air_cap_bt);
        pill_packaging_BT = (Button)v.findViewById(R.id.pill_packaging_bt);
        coffee_bag_BT = (Button)v.findViewById(R.id.coffee_bag_bt);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(category_Vinyl.this).commit();
                fragmentManager.popBackStack();
            }
        });

        noodle_bag_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_noodle_bag.newInstance());
            }
        });

        snack_bag_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_snack_bag.newInstance());
            }
        });

        wrap_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_wrap.newInstance());
            }
        });

        plastic_bag_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_plastic_bag.newInstance());
            }
        });

        air_cap_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_air_cap.newInstance());
            }
        });

        pill_packaging_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_pill_packaging.newInstance());
            }
        });

        coffee_bag_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_coffee_bag.newInstance());
            }
        });

        return v;
    }

}
