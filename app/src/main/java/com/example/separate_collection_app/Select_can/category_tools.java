package com.example.separate_collection_app.Select_can;

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

import com.example.separate_collection_app.Activity.MainActivity;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.category.category_Can;

public class category_tools extends Fragment {

    Button back_BT;
    TextView textView, textView2;

    public static category_tools newInstance(){
        return new category_tools();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_select_tools, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        textView = (TextView)v.findViewById(R.id.info_tv);
        textView2 = (TextView)v.findViewById(R.id.warning_tv2);

        Spannable spannable = (Spannable)textView.getText();
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),45,59,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new StyleSpan(Typeface.BOLD),45,59,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        Spannable spannable1 = (Spannable)textView2.getText();
        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),0,6,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),7,29,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),11,13,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannable1.setSpan(new StyleSpan(Typeface.BOLD),7,9,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannable1.setSpan(new StyleSpan(Typeface.BOLD),11,13,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        back_BT.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Can.newInstance());

            }
        });

        return v;
    }

}
