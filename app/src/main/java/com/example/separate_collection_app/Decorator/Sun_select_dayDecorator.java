package com.example.separate_collection_app.Decorator;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import com.example.separate_collection_app.R;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

import java.util.Calendar;

public class Sun_select_dayDecorator implements DayViewDecorator {

    private final Drawable drawable;
    private int color;
    private final Calendar calendar= Calendar.getInstance();


    public Sun_select_dayDecorator(Activity context) {
        drawable = context.getResources().getDrawable(R.drawable.calender_background);

    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        day.copyTo(calendar);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        return weekday == Calendar.SUNDAY;
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setBackgroundDrawable(drawable);
    }
}
