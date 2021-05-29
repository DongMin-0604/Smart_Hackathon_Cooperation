package com.example.separate_collection_app;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;

public class StartActivity extends AppCompatActivity {

    private Spinner CitySP,CountrySP,TownSP;
    private TextView CityTV,CountryTV,TownTV;

    TextView start_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        //   시작화면 제목 두껍게 하기위한 코드 로고로 대체시 삭제 예정
        start_title =(TextView) findViewById(R.id.Start_Title);
        start_title.setPaintFlags(start_title.getPaintFlags()| Paint.FAKE_BOLD_TEXT_FLAG);

        CitySP = (Spinner)findViewById(R.id.dropdown_spinner);
        CountrySP = (Spinner)findViewById(R.id.dropdown_country);
        TownSP = (Spinner)findViewById(R.id.dropdown_town);
        CityTV = (TextView)findViewById(R.id.city_temp);
        CountryTV  = (TextView)findViewById(R.id.country_temp);
        TownTV = (TextView)findViewById(R.id.town_temp);

        Button GO_MAIN_BT = (Button)findViewById(R.id.go_main_bt);

        GO_MAIN_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);


            }
        });

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



    }
}