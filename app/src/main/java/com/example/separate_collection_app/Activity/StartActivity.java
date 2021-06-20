package com.example.separate_collection_app.Activity;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.example.separate_collection_app.AlarmRecevier;
import com.example.separate_collection_app.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StartActivity extends AppCompatActivity {

    private Spinner CitySP,CountrySP;
    private TextView CityTV,CountryTV;
    String city_check,country_check;

    ArrayAdapter<CharSequence> citysp1,citysp2;

    ToggleButton toggleBT1,toggleBT2,toggleBT3,toggleBT4,toggleBT5,toggleBT6,toggleBT7;

    String  mon = null,sun = null,sat = null,fri = null,thurs = null,wednes = null,tues = null;

    int day_ch;
   //푸시알림 코드 시작
    private AlarmManager alarmManager;
    private GregorianCalendar mCalendar;

    PendingIntent pendingIntent;

    private  NotificationManager notificationManager;
    NotificationCompat.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        mon = null;
        sun = null;
        sat = null;
        fri = null;
        thurs = null;
        wednes = null;
        tues = null;


        citysp1 = ArrayAdapter.createFromResource(this,R.array.CityDropDown,R.layout.support_simple_spinner_dropdown_item);
        citysp1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        if (Build.VERSION.SDK_INT >= 21) {
            // 21 버전 이상일 때 상태바 색상 변경
            getWindow().setStatusBarColor(Color.BLACK);
        }

        //푸시알림 생성
        notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);

        mCalendar = new GregorianCalendar();

        Log.v("tag",mCalendar.getTime().toString());
        setContentView(R.layout.start);

        CitySP = (Spinner)findViewById(R.id.dropdown_spinner);
        CountrySP = (Spinner)findViewById(R.id.dropdown_country);
        CityTV = (TextView)findViewById(R.id.city_temp);
        CountryTV  = (TextView)findViewById(R.id.country_temp);

        toggleBT1 = (ToggleButton)findViewById(R.id.toggleButton1);
        toggleBT2 = (ToggleButton)findViewById(R.id.toggleButton2);
        toggleBT3 = (ToggleButton)findViewById(R.id.toggleButton3);
        toggleBT4 = (ToggleButton)findViewById(R.id.toggleButton4);
        toggleBT5 = (ToggleButton)findViewById(R.id.toggleButton5);
        toggleBT6 = (ToggleButton)findViewById(R.id.toggleButton6);
        toggleBT7 = (ToggleButton)findViewById(R.id.toggleButton7);


        Button GO_MAIN_BT = (Button)findViewById(R.id.go_main_bt);

        CitySP.setSelection(0);
        CountrySP.setSelection(0);

        CitySP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_Seoul,R.layout.support_simple_spinner_dropdown_item);
                if (citysp1.getItem(position).equals("서울특별시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_Seoul,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("부산광역시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_busan,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("대구광역시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_daegu,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("인천광역시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_incheon,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("광주광역시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_gwangju,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("대전광역시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_deajeon,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("울산광역시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_woolsan,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("세종특별자치시")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_sejong,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("경기도")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_gyeonggi,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("강원도")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_gangwon,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("충청북도")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_choongcheong_buk,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("충청남도")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_choongcheong_nam,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("전라북도")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_jeonla_buk,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("전라남도")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_jeonla_nam,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }else if (citysp1.getItem(position).equals("경상북도")) {
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this, R.array.City_CountryDropDown_gyeongsang_buk, R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                } else if (citysp1.getItem(position).equals("경상남도")) {
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this, R.array.City_CountryDropDown_gyeongsang_nam, R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                } else if (citysp1.getItem(position).equals("제주특별자치도")){
                    citysp2 = ArrayAdapter.createFromResource(StartActivity.this,R.array.City_CountryDropDown_jeju,R.layout.support_simple_spinner_dropdown_item);
                    citysp2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                }

                CountrySP.setAdapter(citysp2);
                CityTV.setText(parent.getItemAtPosition(position).toString());


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        CountrySP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    CountryTV.setText(parent.getItemAtPosition(position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        toggleBT1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    mon = "월요일";
                    Toast.makeText(getApplicationContext(),mon,Toast.LENGTH_SHORT).show();
                    toggleBT1.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT1.setTextColor(Color.parseColor("#ffffff"));
                }else{
                     mon = null;
                    toggleBT1.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT1.setTextColor(Color.parseColor("#000000"));

                }
            }
        });
        toggleBT2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    tues = "화요일";
                    Toast.makeText(getApplicationContext(),tues,Toast.LENGTH_SHORT).show();
                    toggleBT2.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT2.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    tues = null;
                    toggleBT2.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT2.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
        toggleBT3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    wednes = "수요일";
                    Toast.makeText(getApplicationContext(),wednes,Toast.LENGTH_SHORT).show();
                    toggleBT3.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT3.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    wednes = null;
                    toggleBT3.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT3.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
        toggleBT4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    thurs = "목요일";
                    Toast.makeText(getApplicationContext(),thurs,Toast.LENGTH_SHORT).show();
                    toggleBT4.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT4.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    thurs = null;
                    toggleBT4.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT4.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
        toggleBT5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    fri = "금요일";
                    Toast.makeText(getApplicationContext(),fri,Toast.LENGTH_SHORT).show();
                    toggleBT5.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT5.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    fri = null;
                    toggleBT5.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT5.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
        toggleBT6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    sat = "토요일";
                    Toast.makeText(getApplicationContext(),sat,Toast.LENGTH_SHORT).show();
                    toggleBT6.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT6.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    sat = null;
                    toggleBT6.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT6.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
        toggleBT7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    sun = "일요일";
                    Toast.makeText(getApplicationContext(),sun,Toast.LENGTH_SHORT).show();
                    toggleBT7.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT7.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    sun = null;
                    toggleBT7.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT7.setTextColor(Color.parseColor("#000000"));
                }
            }
        });


        GO_MAIN_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                city_check = CityTV.getText().toString();
                country_check = CountryTV.getText().toString();
                if (city_check.equals("--시/도") || country_check.equals("--시/군/구") ){
                    String str = CityTV.getText().toString();
                    if (str.equals("세종특별자치시")){
                        CountryTV.setText("---");
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("mon",mon);
                        intent.putExtra("tue",tues);
                        intent.putExtra("wed",wednes);
                        intent.putExtra("thu",thurs);
                        intent.putExtra("fri",fri);
                        intent.putExtra("satur",sat);
                        intent.putExtra("sun",sun);

                        intent.putExtra("City",CityTV.getText().toString());
                        intent.putExtra("Country",CountryTV.getText().toString());
                        startActivity(intent);
                        finish();
                        PushAlarmgive();
                    }else {
                        Toast.makeText(getApplicationContext(),"잘못된 정보입니다.",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    PushAlarmgive();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("mon",mon);
                    intent.putExtra("tue",tues);
                    intent.putExtra("wed",wednes);
                    intent.putExtra("thu",thurs);
                    intent.putExtra("fri",fri);
                    intent.putExtra("sat",sat);
                    intent.putExtra("sun",sun);

                    intent.putExtra("City",CityTV.getText().toString());
                    intent.putExtra("Country",CountryTV.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });



    }

    private void pushAlarm() {
        Intent ReceiberIntent = new Intent(StartActivity.this, AlarmRecevier.class);
        pendingIntent = PendingIntent.getBroadcast(StartActivity.this, 0, ReceiberIntent, 0);

        Intent intent3 = new Intent(this,AlarmRecevier.class);
        PendingIntent sender = PendingIntent.getBroadcast(this,0,intent3,PendingIntent.FLAG_NO_CREATE);

        Calendar calendar2 = Calendar.getInstance();
//      int mDayOfWeek = calendar2.get(Calendar.DAY_OF_WEEK);
        String from = "080000AM";
        int dayofweek = 0;
        SimpleDateFormat dateFormat1 = new SimpleDateFormat();
        Date datetime = null;
        try {
            datetime = dateFormat1.parse(from);
        }catch (ParseException e){
            e.printStackTrace();
        }

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.DAY_OF_WEEK,day_ch);
        calendar1.set(Calendar.HOUR,Integer.parseInt(from.substring(0,2)));
        calendar1.set(Calendar.MINUTE,Integer.parseInt(from.substring(2,4)));
        calendar1.set(Calendar.SECOND,Integer.parseInt(from.substring(4,6)));

        if (calendar1.getTimeInMillis() < System.currentTimeMillis()){
            calendar1.add(Calendar.DAY_OF_YEAR,7);
        }

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar1.getTimeInMillis(),AlarmManager.INTERVAL_DAY*7,pendingIntent);


    }
    public void PushAlarmgive() {

//        Calendar calendar2 = Calendar.getInstance();
//        int mDayOfWeek = calendar2.get(Calendar.DAY_OF_WEEK);
        if (!TextUtils.isEmpty(sun)) {
                day_ch = 1;
                pushAlarm();
        }
        if (!TextUtils.isEmpty(mon)) {
                day_ch = 2;
                pushAlarm();

        }
        if (!TextUtils.isEmpty(tues)) {
                day_ch = 3;
                pushAlarm();

        }
        if (!TextUtils.isEmpty(wednes)) {
                day_ch = 4;
                pushAlarm();
        }
        if (!TextUtils.isEmpty(thurs)) {
                day_ch = 5;
                pushAlarm();


        }
        if (!TextUtils.isEmpty(fri)) {
                day_ch = 6;
                pushAlarm();


        }
        if (!TextUtils.isEmpty(sat)) {
                day_ch = 7;
                pushAlarm();

        }
    }

    }