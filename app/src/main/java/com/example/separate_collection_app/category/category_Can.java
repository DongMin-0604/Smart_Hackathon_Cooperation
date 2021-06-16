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
import com.example.separate_collection_app.Select_can.category_butane;
import com.example.separate_collection_app.Select_can.category_canned_food;
import com.example.separate_collection_app.Select_can.category_cans;
import com.example.separate_collection_app.Select_can.category_coat_hanger;
import com.example.separate_collection_app.Select_can.category_nail;
import com.example.separate_collection_app.Select_can.category_paint;
import com.example.separate_collection_app.Select_can.category_spray;
import com.example.separate_collection_app.Select_can.category_spring;
import com.example.separate_collection_app.Select_can.category_tools;
import com.example.separate_collection_app.Select_can.category_umbrella;

public class category_Can extends Fragment {

    Button back_BT;
    Button butane_BT,canned_food_BT,cans_BT,hanger_BT,nail_BT,paint_BT,spray_BT,spring_BT,tools_BT,umbrella_BT;

    public static category_Can newInstance(){
        return new category_Can();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_can, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        butane_BT = (Button)v.findViewById(R.id.butane_bt);
        canned_food_BT = (Button)v.findViewById(R.id.canned_food_bt);
        cans_BT = (Button)v.findViewById(R.id.cans_bt);
        hanger_BT = (Button)v.findViewById(R.id.hanger_bt);
        nail_BT = (Button)v.findViewById(R.id.nail_bt);
        paint_BT = (Button)v.findViewById(R.id.paint_bt);
        spray_BT = (Button)v.findViewById(R.id.spray_bt);
        spring_BT = (Button)v.findViewById(R.id.spring_bt);
        tools_BT = (Button)v.findViewById(R.id.tools_bt);
        umbrella_BT = (Button)v.findViewById(R.id.umbrella_bt);


        canned_food_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_canned_food.newInstance());
            }
        });
        butane_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_butane.newInstance());
            }
        });
        cans_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_cans.newInstance());
            }
        });
        hanger_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_coat_hanger.newInstance());
            }
        });
        nail_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_nail.newInstance());
            }
        });
        paint_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_paint.newInstance());
            }
        });
        spray_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_spray.newInstance());
            }
        });
        spring_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_spring.newInstance());
            }
        });
        tools_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_tools.newInstance());
            }
        });
        umbrella_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_umbrella.newInstance());
            }
        });
        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent_can =new Intent(getActivity(),MainActivity.class);
                startActivity(intent_can);

            }
        });

        return v;
    }

}
