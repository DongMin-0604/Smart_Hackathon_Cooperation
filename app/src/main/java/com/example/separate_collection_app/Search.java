package com.example.separate_collection_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;

public class Search extends Fragment {

    public static Search newInstance(){
        return new Search();
    }

    SearchView SV;
    Button plastic_BT,Food_BT,glass_BT,can_BT,paper_BT,vinyl_BT,other_BT;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, null);
        // Inflate the layout for this fragment

        plastic_BT = (Button)v.findViewById(R.id.plastic_garbage);
        Food_BT = (Button)v.findViewById(R.id.Food_waste);
        can_BT = (Button)v.findViewById(R.id.cans_scrap_metal);
        glass_BT = (Button)v.findViewById(R.id.glass_bottle_trash);
        paper_BT = (Button)v.findViewById(R.id.paper_waste);
        vinyl_BT = (Button)v.findViewById(R.id.vinyl_trash);
        other_BT = (Button)v.findViewById(R.id.other_trash) ;


        plastic_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Plastic.newInstance());
            }
        });
        Food_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Food.newInstance());
            }
        });
        can_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Can.newInstance());
            }
        });
        glass_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Glass.newInstance());
            }
        });
        paper_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_paper.newInstance());
            }
        });
        vinyl_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Vinyl.newInstance());
            }
        });
        other_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Other.newInstance());
            }
        });


        return v;
    }


}