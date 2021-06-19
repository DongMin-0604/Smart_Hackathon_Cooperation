package com.example.separate_collection_app.category;

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
import com.example.separate_collection_app.Select_Other.category_wire_cloth;

public class category_Other extends Fragment {

    Button back_BT;
    Button wire_cloth_BT;

    public static category_Other newInstance(){
        return new category_Other();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_other, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        wire_cloth_BT = (Button)v.findViewById(R.id.wire_cloth_bt);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(category_Other.this).commit();
                fragmentManager.popBackStack();

            }
        });
        wire_cloth_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_wire_cloth.newInstance());
            }
        });

        return v;
    }

}
