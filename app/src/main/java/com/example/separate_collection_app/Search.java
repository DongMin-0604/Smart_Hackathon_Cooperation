package com.example.separate_collection_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Search extends Fragment {

    public static Search newInstance(){
        return new Search();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, null);
        // Inflate the layout for this fragment
        Button plastic_BT = (Button)v.findViewById(R.id.plastic_garbage);

        plastic_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_plastic.newInstance());
            }
        });
        return v;
    }


}