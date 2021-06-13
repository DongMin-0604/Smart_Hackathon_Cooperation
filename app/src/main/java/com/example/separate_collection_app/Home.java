package com.example.separate_collection_app;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.separate_collection_app.Decorator.FridayDecorator;
import com.example.separate_collection_app.Decorator.MondayDecorator;
import com.example.separate_collection_app.Decorator.OneDayDecorator;
import com.example.separate_collection_app.Decorator.SaturdayDecorator;
import com.example.separate_collection_app.Decorator.SundayDecorator;
import com.example.separate_collection_app.Decorator.weddayDecorator;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Home extends Fragment{

    TextView TV_Date;
    long Time;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd");
    MaterialCalendarView materialCalendarView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        materialCalendarView = v.findViewById(R.id.calendar_view);
        TV_Date = (TextView)v.findViewById(R.id.Data_Display);
        // Inflate the layout for this fragment
        TV_Date.setText("오늘은 "+getTime()+" 입니다.");

//        ((StartActivity)getActivity()).mon.toString();


        materialCalendarView.addDecorator(new MondayDecorator(getActivity()));
        materialCalendarView.addDecorator(new SundayDecorator());
        materialCalendarView.addDecorator(new SaturdayDecorator());
        materialCalendarView.addDecorator(new OneDayDecorator());
//        materialCalendarView.addDecorator(new TuesdayDecorator(getActivity()));
        materialCalendarView.addDecorator(new weddayDecorator(getActivity()));
//        materialCalendarView.addDecorator(new ThudayDecorator(getActivity()));
        materialCalendarView.addDecorator(new FridayDecorator(getActivity()));
//        materialCalendarView.addDecorator(new Sat_select_dayDecorator(getActivity()));
//        materialCalendarView.addDecorator(new Sun_select_dayDecorator(getActivity()));


        return v;
    }

    private String getTime(){
        Time = System.currentTimeMillis();
        mDate = new Date(Time);
        return mFormat.format(mDate);
    }
}