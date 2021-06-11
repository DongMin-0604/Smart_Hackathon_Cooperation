package com.example.separate_collection_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_shellfish_category extends Fragment {

    public static Fragment_shellfish_category newInstance() {return  new Fragment_shellfish_category();}

    Button back_BT;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_shellfish_category_select, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);

        back_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Food.newInstance());
            }
        });

        return v;
    }
}