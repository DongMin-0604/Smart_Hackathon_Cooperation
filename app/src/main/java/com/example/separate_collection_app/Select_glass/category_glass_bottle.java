package com.example.separate_collection_app.Select_glass;

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
import com.example.separate_collection_app.category.category_Glass;

public class category_glass_bottle extends Fragment {

    Button back_BT;
    TextView textView, textView2;

    public static category_glass_bottle newInstance(){
        return new category_glass_bottle();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_select_glass_bottle, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        textView = (TextView)v.findViewById(R.id.info_tv);
        textView2 = (TextView)v.findViewById(R.id.warning_tv2);

        Spannable spannable = (Spannable)textView.getText();
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),15,22,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.rgb(79,60,151)),34,42,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        Spannable spannable1 = (Spannable)textView2.getText();
        spannable1.setSpan(new ForegroundColorSpan(Color.rgb(159,33,33)),0,58,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        back_BT.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_Glass.newInstance());

            }
        });

        return v;
    }

}
