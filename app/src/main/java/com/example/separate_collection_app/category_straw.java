package com.example.separate_collection_app;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class category_straw extends Fragment {

    Button back_BT;
    TextView straw_TV,straw_TV2;

    public static category_straw newInstance(){
        return new category_straw();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_straw, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        straw_TV = (TextView)v.findViewById(R.id.straw_tv);
        straw_TV2 = (TextView)v.findViewById(R.id.straw_tv2);

        Spannable spannable = (Spannable)straw_TV.getText();
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),45,59,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new StyleSpan(Typeface.BOLD),45,59,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable spannable1 = (Spannable)straw_TV2.getText();
        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),0,6,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),7,29,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),11,13,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannable1.setSpan(new StyleSpan(Typeface.BOLD),7,9,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannable1.setSpan(new StyleSpan(Typeface.BOLD),11,13,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        back_BT.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Plastic.newInstance());

            }
        });

        return v;
    }

}
