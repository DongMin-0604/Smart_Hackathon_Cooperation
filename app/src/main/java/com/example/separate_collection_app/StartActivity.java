package com.example.separate_collection_app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    private Spinner CitySP,CountrySP,TownSP;
    private TextView CityTV,CountryTV,TownTV;
    String city_check,country_check,town_check;

    ArrayAdapter<CharSequence> citysp1,citysp2;

    ToggleButton toggleBT1,toggleBT2,toggleBT3,toggleBT4,toggleBT5,toggleBT6,toggleBT7;

    boolean check = false;

    String  mon = null,sun = null,satur = null,fri = null,thurs = null,wednes = null,tues = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

//        Bundle bundle = new Bundle();
        citysp1 = ArrayAdapter.createFromResource(this,R.array.CityDropDown,R.layout.support_simple_spinner_dropdown_item);
        citysp1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

//        타이틀바 없애는 코드
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        if (Build.VERSION.SDK_INT >= 21) {
            // 21 버전 이상일 때 상태바 색상 변경
            getWindow().setStatusBarColor(Color.BLACK);
        }

        CitySP = (Spinner)findViewById(R.id.dropdown_spinner);
        CountrySP = (Spinner)findViewById(R.id.dropdown_country);
        TownSP = (Spinner)findViewById(R.id.dropdown_town);
        CityTV = (TextView)findViewById(R.id.city_temp);
        CountryTV  = (TextView)findViewById(R.id.country_temp);
        TownTV = (TextView)findViewById(R.id.town_temp);

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
        TownSP.setSelection(0);


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
        TownSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TownTV.setText(parent.getItemAtPosition(position).toString());
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
                    check = true;
                    Toast.makeText(getApplicationContext(),mon,Toast.LENGTH_SHORT).show();
                    toggleBT1.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT1.setTextColor(Color.parseColor("#ffffff"));
                }else{
                     mon = null;
                    check = false;
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
                    check = true;
                    Toast.makeText(getApplicationContext(),tues,Toast.LENGTH_SHORT).show();
                    toggleBT2.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT2.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    tues = null;
                    check = false;
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
                    check = true;
                    Toast.makeText(getApplicationContext(),wednes,Toast.LENGTH_SHORT).show();
                    toggleBT3.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT3.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    wednes = null;
                    check = false;
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
                    check = true;
                    Toast.makeText(getApplicationContext(),thurs,Toast.LENGTH_SHORT).show();
                    toggleBT4.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT4.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    thurs = null;
                    check = false;
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
                    check = true;
                    Toast.makeText(getApplicationContext(),fri,Toast.LENGTH_SHORT).show();
                    toggleBT5.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT5.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    fri = null;
                    check = false;
                    toggleBT5.setBackgroundResource(R.drawable.toggle_bt_background);
                    toggleBT5.setTextColor(Color.parseColor("#000000"));
                }
            }
        });
        toggleBT6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    satur = "토요일";
                    check = true;
                    Toast.makeText(getApplicationContext(),satur,Toast.LENGTH_SHORT).show();
                    toggleBT6.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT6.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    satur = null;
                    check = false;
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
                    check = true;
                    Toast.makeText(getApplicationContext(),sun,Toast.LENGTH_SHORT).show();
                    toggleBT7.setBackgroundResource(R.drawable.toggle_bt_background2);
                    toggleBT7.setTextColor(Color.parseColor("#ffffff"));
                }else {
                    sun = null;
                    check = false;
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
                town_check = TownTV.getText().toString();

                if (city_check.equals("--시/도") || country_check.equals("--시/군/구") || town_check.equals("--동")||check == false){
                    String str = CityTV.getText().toString();
                    if (str.equals("세종특별자치시")){

//                        bundle.putString("str1",CityTV.getText().toString());
//                        MyInfo myInfo = new MyInfo();
//                        myInfo.setArguments(bundle);

                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);

                    }else {
                        Toast.makeText(getApplicationContext(),"잘못된 정보입니다.",Toast.LENGTH_SHORT).show();
                    }
                }else{

//                    bundle.putString("str1",CityTV.getText().toString());
//                    MyInfo myInfo = new MyInfo();
//                    myInfo.setArguments(bundle);

                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                }
            }
        });
    }

}