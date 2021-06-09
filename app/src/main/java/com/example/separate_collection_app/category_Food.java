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

        back_BT = (Button)v.findViewById(R.id.bt_back);
        meat_BT = (Button)v.findViewById(R.id.meat_bt);
        shellfish_BT = (Button)v.findViewById(R.id.shellfish_bt);
        vegetables_BT = (Button)v.findViewById(R.id.vegetables_bt);
        fruits_BT = (Button)v.findViewById(R.id.fruits_bt);
        cereals_BT = (Button)v.findViewById(R.id.cereals_bt);
        seafood_BT = (Button)v.findViewById(R.id.seafood_bt);
        Others_BT = (Button)v.findViewById(R.id.Others_bt);


        Spannable span = (Spannable)shellfish_BT.getText();
        span.setSpan(new ForegroundColorSpan(Color.BLACK),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new ForegroundColorSpan(Color.BLACK),18,29,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new AbsoluteSizeSpan(65),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new StyleSpan(Typeface.BOLD),0,17,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable span1 = (Spannable)meat_BT.getText();
        span1.setSpan(new ForegroundColorSpan(Color.BLACK),0,2,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span1.setSpan(new ForegroundColorSpan(Color.BLACK),14,25,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span1.setSpan(new AbsoluteSizeSpan(65),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span1.setSpan(new StyleSpan(Typeface.BOLD),0,14,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable span2 = (Spannable)vegetables_BT.getText();
        span2.setSpan(new ForegroundColorSpan(Color.BLACK),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span2.setSpan(new ForegroundColorSpan(Color.BLACK),15,26,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span2.setSpan(new AbsoluteSizeSpan(65),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span2.setSpan(new StyleSpan(Typeface.BOLD),0,14,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable span3 = (Spannable)fruits_BT.getText();
        span3.setSpan(new ForegroundColorSpan(Color.BLACK),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span3.setSpan(new ForegroundColorSpan(Color.BLACK),17,28,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span3.setSpan(new AbsoluteSizeSpan(65),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span3.setSpan(new StyleSpan(Typeface.BOLD),0,17,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable span4 = (Spannable)cereals_BT.getText();
        span4.setSpan(new ForegroundColorSpan(Color.BLACK),0,2,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span4.setSpan(new ForegroundColorSpan(Color.BLACK),14,25,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span4.setSpan(new AbsoluteSizeSpan(65),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span4.setSpan(new StyleSpan(Typeface.BOLD),0,14,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable span5 = (Spannable)seafood_BT.getText();
        span5.setSpan(new ForegroundColorSpan(Color.BLACK),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span5.setSpan(new ForegroundColorSpan(Color.BLACK),15,26,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span5.setSpan(new AbsoluteSizeSpan(65),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span5.setSpan(new StyleSpan(Typeface.BOLD),0,15,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable span6 = (Spannable)Others_BT.getText();
        span6.setSpan(new ForegroundColorSpan(Color.BLACK),0,2,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span6.setSpan(new ForegroundColorSpan(Color.BLACK),11,22,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span6.setSpan(new AbsoluteSizeSpan(65),0,3,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span6.setSpan(new StyleSpan(Typeface.BOLD),0,11,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(Search.newInstance());

            }
        });

        shellfish_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(Fragment_shellfish_category.newInstance());
            }
        });
        meat_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(Fragment_meat_category.newInstance());
            }
        });

        return v;
    }

}
