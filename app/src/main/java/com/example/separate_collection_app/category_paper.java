package com.example.separate_collection_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class category_paper extends Fragment {

    Button back_BT;

    public static category_paper newInstance(){
        return new category_paper();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_paper, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(Search.newInstance());

            }
        });

        return v;
    }

}
