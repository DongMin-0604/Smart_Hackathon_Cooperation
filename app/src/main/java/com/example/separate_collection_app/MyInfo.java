package com.example.separate_collection_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MyInfo extends Fragment {

    public static MyInfo newInstance(){
        return new MyInfo();
    }

    TextView City_TV2,Country_TV2,Town_TV2;

    Button setting_BT;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_info, container, false);

        City_TV2 = (TextView) v.findViewById(R.id.city_temp1);
        Country_TV2 = (TextView) v.findViewById(R.id.country_temp1);
        Town_TV2 = (TextView) v.findViewById(R.id.town_temp1);
        setting_BT = (Button)v.findViewById(R.id.myinfo_setting);




        setting_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), StartActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }
}