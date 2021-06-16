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

public class category_Glass extends Fragment {

    Button back_BT;

    public static category_Glass newInstance(){
        return new category_Glass();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_glass, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(category_Glass.this).commit();
                fragmentManager.popBackStack();

            }
        });

        return v;
    }

}
