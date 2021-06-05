package com.example.separate_collection_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyInfo extends Fragment {

    TextView City_TV2,Country_TV2,Town_TV2;

    String text;
    String text2;
    String text3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_info, container, false);

        City_TV2 = (TextView) v.findViewById(R.id.city_temp1);
        Country_TV2 = (TextView) v.findViewById(R.id.country_temp1);
        Town_TV2 = (TextView) v.findViewById(R.id.town_temp1);

        Bundle bundle = getArguments();

        if (bundle != null) {
            text = bundle.getString("city_value".toString());
            text2 = bundle.getString("country_value".toString());
            text3 = bundle.getString("town_value".toString());
        }
        City_TV2.setText(text);
        Country_TV2.setText(text2);
        Town_TV2.setText(text3);

        return v;
    }
}