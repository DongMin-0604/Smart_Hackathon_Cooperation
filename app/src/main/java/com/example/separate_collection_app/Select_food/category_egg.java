package com.example.separate_collection_app.Select_food;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.separate_collection_app.Activity.MainActivity;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.category.category_Can;
import com.example.separate_collection_app.category.category_Food;

public class category_egg extends Fragment {

    Button back_BT;
    TextView textView, textView2;

    public static category_egg newInstance(){
        return new category_egg();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_select_egg, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        textView = (TextView)v.findViewById(R.id.info_tv);
        textView2 = (TextView)v.findViewById(R.id.warning_tv2);

        Spannable spannable = (Spannable)textView.getText();
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),4,9,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),11,17,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),24,31,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),33,35,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),55,62,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable spannable1 = (Spannable)textView2.getText();
        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),0,54,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        back_BT.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Food.newInstance());

            }
        });

        return v;
    }

}