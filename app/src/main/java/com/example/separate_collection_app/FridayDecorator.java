package com.example.separate_collection_app;

import android.app.Activity;
import android.graphics.drawable.Drawable;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

import java.util.Calendar;

public class FridayDecorator implements DayViewDecorator {

    private final Drawable drawable;
    private int color;
    private final Calendar calendar= Calendar.getInstance();


    public FridayDecorator(Activity context) {
        drawable = context.getResources().getDrawable(R.drawable.calender_background);

    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        day.copyTo(calendar);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        return weekday == Calendar.FRIDAY;
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setBackgroundDrawable(drawable);
    }
}
