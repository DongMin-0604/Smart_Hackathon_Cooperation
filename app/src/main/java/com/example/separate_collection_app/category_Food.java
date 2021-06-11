package com.example.separate_collection_app;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

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

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(Search.newInstance());

            }
        });

        return v;
    }

}
