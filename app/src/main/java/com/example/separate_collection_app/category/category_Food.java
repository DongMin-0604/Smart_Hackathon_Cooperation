package com.example.separate_collection_app.category;

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
import com.example.separate_collection_app.Search;

public class category_Food extends Fragment {

    Button back_BT;
    Button shellfish_BT,meat_BT,vegetables_BT,fruits_BT,cereals_BT,seafood_BT,Others_BT;

    public static category_Food newInstance(){
        return new category_Food();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_food, null);

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
