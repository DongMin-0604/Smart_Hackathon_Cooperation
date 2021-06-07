package com.example.separate_collection_app;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static android.content.Context.INPUT_METHOD_SERVICE;


public class Home extends Fragment {

    TextView TV_Date;
    long Time;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);


        TV_Date = (TextView)v.findViewById(R.id.Data_Display);
        // Inflate the layout for this fragment
        TV_Date.setText("오늘은 "+getTime()+" 입니다.");




        return v;
    }

    private String getTime(){
        Time = System.currentTimeMillis();
        mDate = new Date(Time);
        return mFormat.format(mDate);
    }





}