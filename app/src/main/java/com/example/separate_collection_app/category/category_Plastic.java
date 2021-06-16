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
import com.example.separate_collection_app.Select_plastic.category_straw;

public class category_Plastic extends Fragment {

    Button back_BT, straw_BT;

    public static category_Plastic newInstance(){
        return new category_Plastic();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_plastic, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        straw_BT = (Button)v.findViewById(R.id.straw_bt);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent_plastic =new Intent(getActivity(),MainActivity.class);
                startActivity(intent_plastic);

            }
        });

        straw_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_straw.newInstance());
            }
        });

        return v;
    }

}
