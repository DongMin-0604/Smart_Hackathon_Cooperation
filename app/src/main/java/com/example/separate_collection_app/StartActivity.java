package com.example.separate_collection_app;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
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

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {


    private Spinner CitySP,CountrySP,TownSP;
    private TextView CityTV,CountryTV,TownTV;

    ToggleButton toggleBT1,toggleBT2,toggleBT3,toggleBT4,toggleBT5,toggleBT6,toggleBT7;

    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

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
                String mon = null;
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
                String tues = null;
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
                String wednes = null;
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
                String thurs = null;
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
                String fri = null;
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
                String satur = null;
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
                String sun = null;
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
            String city_check,country_check,town_check;
            @Override
            public void onClick(View v) {
                city_check = CityTV.getText().toString();
                country_check = CountryTV.getText().toString();
                town_check = TownTV.getText().toString();

                if (city_check.equals("--시") || country_check.equals("--구") || town_check.equals("--동")||check == false){
                    Toast.makeText(getApplicationContext(),"잘못된 정보입니다.",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                    Fragment fragment = new MyInfo();
                    Bundle bundle = new Bundle(3);
                    bundle.putString("city_value",CityTV.getText().toString());
                    bundle.putString("country_value",CountryTV.getText().toString());
                    bundle.putString("town_value",TownTV.getText().toString());

                    fragment.setArguments(bundle);
                }
            }
        });
    }
}