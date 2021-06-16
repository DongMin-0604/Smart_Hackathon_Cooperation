package com.example.separate_collection_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.separate_collection_app.Decorator.FridayDecorator;
import com.example.separate_collection_app.Decorator.MondayDecorator;
import com.example.separate_collection_app.Decorator.OneDayDecorator;
import com.example.separate_collection_app.Decorator.Sat_select_dayDecorator;
import com.example.separate_collection_app.Decorator.SaturdayDecorator;
import com.example.separate_collection_app.Decorator.Sun_select_dayDecorator;
import com.example.separate_collection_app.Decorator.SundayDecorator;
import com.example.separate_collection_app.Decorator.ThudayDecorator;
import com.example.separate_collection_app.Decorator.TuesdayDecorator;
import com.example.separate_collection_app.Decorator.weddayDecorator;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.category.category_Can;
import com.example.separate_collection_app.category.category_Food;
import com.example.separate_collection_app.category.category_Glass;
import com.example.separate_collection_app.category.category_Other;
import com.example.separate_collection_app.category.category_Plastic;
import com.example.separate_collection_app.category.category_Vinyl;
import com.example.separate_collection_app.category.category_paper;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    private long backkeyPressedTime = 0;

    private Toast toast;

    private View Home_LO,Category_LO,myinfo_LO;

    FrameLayout main_frame;

    Button home_home_BT,home_category_BT,home_info_BT,categor_home_BT,category_category_BT,category_info_BT,info_home_BT,info_category_BT,info_info_BT;

    //홈 화면 선언
    TextView TV_Date;
    long Time;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd");
    MaterialCalendarView materialCalendarView;

    String mon_temp,tue_temp,wed_temp,thu_temp,fri_temp,sat_temp,sunString;

    //홈 화면 선언 끝

    //카테고리 화면 선언
    Button plastic_BT,Food_BT,glass_BT,can_BT,paper_BT,vinyl_BT,other_BT;
    //카테고리 화면 선언 끝

    //내 정보 화면
    TextView City_TV2,Country_TV2,Town_TV2;
    String City_st;
    TextView mon_TV,tue_TV,wed_TV,thu_TV,fri_TV,sat_TV,sun_TV,City_TV,Country_TV;

    Button setting_BT;

    boolean check = false;
    //내 정보 화면 끝
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        if (System.currentTimeMillis() > backkeyPressedTime + 2000){
            backkeyPressedTime = System.currentTimeMillis();

            toast = Toast.makeText(this,"뒤로 버튼을 한번 더 누르시면 종료됩니다.",  Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        if (System.currentTimeMillis() <= backkeyPressedTime+2000){
            moveTaskToBack(true);						// 태스크를 백그라운드로 이동
            finishAndRemoveTask();						// 액티비티 종료 + 태스크 리스트에서 지우기
            android.os.Process.killProcess(android.os.Process.myPid());
            toast.cancel();
        }

    }

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Home_LO = findViewById(R.id.Home_layout);
        Category_LO = findViewById(R.id.category_layout);
        myinfo_LO = findViewById(R.id.myinfo_layout);

        home_home_BT = (Button)findViewById(R.id.home_home_bt);
        home_category_BT = (Button)findViewById(R.id.home_category_bt);
        home_info_BT = (Button)findViewById(R.id.home_info_bt);

        categor_home_BT = (Button)findViewById(R.id.category_home_bt);
        category_category_BT = (Button)findViewById(R.id.category_category_bt);
        category_info_BT = (Button)findViewById(R.id.category_info_bt);

        info_home_BT  = (Button)findViewById(R.id.info_home_bt);
        info_category_BT = (Button)findViewById(R.id.info_category_bt);
        info_info_BT = (Button)findViewById(R.id.info_info_bt);

        City_TV2 = (TextView) findViewById(R.id.city_temp1);
        Country_TV2 = (TextView) findViewById(R.id.country_temp1);
        Town_TV2 = (TextView) findViewById(R.id.town_temp1);
        setting_BT = (Button)findViewById(R.id.myinfo_setting);

        materialCalendarView = findViewById(R.id.calendar_view);
        TV_Date = (TextView)findViewById(R.id.Data_Display);

        plastic_BT = (Button)findViewById(R.id.plastic_garbage);
        Food_BT = (Button)findViewById(R.id.Food_waste);
        can_BT = (Button)findViewById(R.id.cans_scrap_metal);
        glass_BT = (Button)findViewById(R.id.glass_bottle_trash);
        paper_BT = (Button)findViewById(R.id.paper_waste);
        vinyl_BT = (Button)findViewById(R.id.vinyl_trash);
        other_BT = (Button)findViewById(R.id.other_trash);

        mon_TV = (TextView)findViewById(R.id.mon_TV);
        tue_TV = (TextView)findViewById(R.id.tue_TV);
        wed_TV = (TextView)findViewById(R.id.wed_TV);
        thu_TV = (TextView)findViewById(R.id.thu_TV);
        fri_TV = (TextView)findViewById(R.id.fri_TV);
        sat_TV = (TextView)findViewById(R.id.sat_TV);
        sun_TV = (TextView)findViewById(R.id.sun_TV);

        City_TV = (TextView)findViewById(R.id.city_temp1);
        Country_TV = (TextView)findViewById(R.id.country_temp1);

        Home_LO.setVisibility(View.VISIBLE);

        TV_Date.setText("오늘은 "+getTime()+"입니다.");


        //홈 화면
        Intent intent1 = getIntent();
        City_TV.setText(intent1.getStringExtra("City"));
        Country_TV.setText(intent1.getStringExtra("Country"));

        if (!TextUtils.isEmpty(intent1.getStringExtra("mon"))){
            materialCalendarView.addDecorator(new MondayDecorator(this));

            Spannable spannable = (Spannable)mon_TV.getText();
            spannable.setSpan(new ForegroundColorSpan(Color.rgb(22,133,35)),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }else {

        }
        if (!TextUtils.isEmpty(intent1.getStringExtra("tue"))){
            materialCalendarView.addDecorator(new TuesdayDecorator(this));

            Spannable spannable = (Spannable)tue_TV.getText();
            spannable.setSpan(new ForegroundColorSpan(Color.rgb(22,133,35)),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }else {

        }
        if (!TextUtils.isEmpty(intent1.getStringExtra("wed"))){
            materialCalendarView.addDecorator(new weddayDecorator(this));

            Spannable spannable = (Spannable)wed_TV.getText();
            spannable.setSpan(new ForegroundColorSpan(Color.rgb(22,133,35)),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }else {

        }
        if (!TextUtils.isEmpty(intent1.getStringExtra("thu"))){
            materialCalendarView.addDecorator(new ThudayDecorator(this));

            Spannable spannable = (Spannable)thu_TV.getText();
            spannable.setSpan(new ForegroundColorSpan(Color.rgb(22,133,35)),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }else {

        }
        if (!TextUtils.isEmpty(intent1.getStringExtra("fri"))){
            materialCalendarView.addDecorator(new FridayDecorator(this));

            Spannable spannable = (Spannable)fri_TV.getText();
            spannable.setSpan(new ForegroundColorSpan(Color.rgb(22,133,35)),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }else {

        }
        if (!TextUtils.isEmpty(intent1.getStringExtra("satur"))){
            materialCalendarView.addDecorator(new Sat_select_dayDecorator(this));

            Spannable spannable = (Spannable)sat_TV.getText();
            spannable.setSpan(new ForegroundColorSpan(Color.rgb(22,133,35)),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }else {

        }
        if (!TextUtils.isEmpty(intent1.getStringExtra("sun"))){
            materialCalendarView.addDecorator(new Sun_select_dayDecorator(this));

            Spannable spannable = (Spannable)sun_TV.getText();
            spannable.setSpan(new ForegroundColorSpan(Color.rgb(22,133,35)),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        }else {

        }

        materialCalendarView.addDecorator(new SundayDecorator());
        materialCalendarView.addDecorator(new SaturdayDecorator());
        materialCalendarView.addDecorator(new OneDayDecorator());
        //홈 화면 끝

        //카테고리 화면

        plastic_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(category_Plastic.newInstance());
            }
        });
        Food_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(category_Food.newInstance());
            }
        });
        can_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(category_Can.newInstance());
            }
        });
        glass_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(category_Glass.newInstance());
            }
        });
        paper_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               replaceFragment(category_paper.newInstance());
            }
        });
        vinyl_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(category_Vinyl.newInstance());
            }
        });
        other_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(category_Other.newInstance());
            }
        });
        //카테고리 화면 끝

        //내 정보 화면
        setting_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = true;
                Intent intent = new Intent(getApplicationContext(),StartActivity.class);
                intent.putExtra("Check",check);
                startActivity(intent);
            }
        });

        //내 정보 화면 끝
        if (Build.VERSION.SDK_INT >= 21) {
            // 21 버전 이상일 때 상태바 색상 변경
            getWindow().setStatusBarColor(Color.BLACK);
        }

        home_home_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.VISIBLE);
                Category_LO.setVisibility(View.INVISIBLE);
                myinfo_LO.setVisibility(View.INVISIBLE);

            }
        });
        categor_home_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.VISIBLE);
                Category_LO.setVisibility(View.INVISIBLE);
                myinfo_LO.setVisibility(View.INVISIBLE);
            }
        });
        info_home_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.VISIBLE);
                Category_LO.setVisibility(View.INVISIBLE);
                myinfo_LO.setVisibility(View.INVISIBLE);
            }
        });

        home_category_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.INVISIBLE);
                Category_LO.setVisibility(View.VISIBLE);
                myinfo_LO.setVisibility(View.INVISIBLE);
            }
        });
        category_category_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.INVISIBLE);
                Category_LO.setVisibility(View.VISIBLE);
                myinfo_LO.setVisibility(View.INVISIBLE);
            }
        });
        info_category_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.INVISIBLE);
                Category_LO.setVisibility(View.VISIBLE);
                myinfo_LO.setVisibility(View.INVISIBLE);
            }
        });

        home_info_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.INVISIBLE);
                Category_LO.setVisibility(View.INVISIBLE);
                myinfo_LO.setVisibility(View.VISIBLE);
            }
        });
        category_info_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.INVISIBLE);
                Category_LO.setVisibility(View.INVISIBLE);
                myinfo_LO.setVisibility(View.VISIBLE);
            }
        });
        info_info_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home_LO.setVisibility(View.INVISIBLE);
                Category_LO.setVisibility(View.INVISIBLE);
                myinfo_LO.setVisibility(View.VISIBLE);
            }
        });
        SharedPreferences pref = getSharedPreferences("IsFirst", Activity.MODE_PRIVATE);
        boolean first = pref.getBoolean("isFirst",false);
        if (first == false){
            Log.d("Is first Time?","first");
            SharedPreferences.Editor editor = pref.edit();
            editor.putBoolean("isFirst",true);
            editor.commit();

            Intent intent = new Intent(getApplicationContext(), StartActivity.class);
            startActivity(intent);
        }else{
            Log.d("Is first Time?","not first");

        }
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_frame,fragment).commit();
    }

    //홈 화면 메소드
    private String getTime(){
        Time = System.currentTimeMillis();
        mDate = new Date(Time);
        return mFormat.format(mDate);
    }
    //홈 화면 메소드 끝
}
