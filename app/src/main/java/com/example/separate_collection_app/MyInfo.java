package com.example.separate_collection_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.separate_collection_app.Activity.StartActivity;


public class MyInfo extends Fragment {

    public static MyInfo newInstance(){
        return new MyInfo();
    }

    TextView City_TV2,Country_TV2,Town_TV2;
    String City_st;
    String temp1,temp2,temp3,temp4,temp5,temp6,temp7;

    Button setting_BT;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Bundle bundle = getArguments();
//        if (getArguments() != null) {
//            temp1 = getArguments().getString("str1");
//            temp2 = getArguments().getString("str2");
//            temp3 = getArguments().getString("str3");
//            temp4 = getArguments().getString("str4");
//            temp5 = getArguments().getString("str5");
//            temp6 = getArguments().getString("str6");
//            temp7 = getArguments().getString("str7");
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_info, container, false);


        City_TV2 = (TextView) v.findViewById(R.id.city_temp1);
        Country_TV2 = (TextView) v.findViewById(R.id.country_temp1);
        Town_TV2 = (TextView) v.findViewById(R.id.town_temp1);
        setting_BT = (Button)v.findViewById(R.id.myinfo_setting);

//        if (temp1 == "일요일"){
//            City_TV2.setText("일요일");
//        }
//        if (temp2 == "월요일"){
//            City_TV2.setText("월요일");
//        }

//        if (getArguments() != null) {
//            temp1 = getArguments().getString("str1");
//            temp2 = getArguments().getString("str2");
//            temp3 = getArguments().getString("str3");
//            temp4 = getArguments().getString("str4");
//            temp5 = getArguments().getString("str5");
//            temp6 = getArguments().getString("str6");
//            temp7 = getArguments().getString("str7");
//        }

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