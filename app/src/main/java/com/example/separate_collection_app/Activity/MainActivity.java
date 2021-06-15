package com.example.separate_collection_app.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.separate_collection_app.Home;
import com.example.separate_collection_app.MyInfo;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    private long backkeyPressedTime = 0;

    private Toast toast;

    private View Home_LO,Category_LO,myinfo_LO;

    FrameLayout main_frame;

    Button home_home_BT,home_category_BT,home_info_BT,categor_home_BT,category_category_BT,category_info_BT,info_home_BT,info_category_BT,info_info_BT;

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

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_frame, Search.newInstance()).commit();

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

        Home_LO.setVisibility(View.VISIBLE);



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

//        bottomNavigationView = findViewById(R.id.bottomNavi);
//        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new Home()).commit();
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item){
//
//                switch (item.getItemId()){
//                    case R.id.item_1:
//                       getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Home()).commit();
//                       Home_LO.setVisibility(View.VISIBLE);
//                        Category_LO.setVisibility(View.INVISIBLE);
//                       myinfo_LO.setVisibility(View.INVISIBLE);
//                        main_frame.addView(Home_LO);
//                        main_frame.removeViewInLayout(Category_LO);
//                        main_frame.removeViewInLayout(myinfo_LO);
//                        break;
//                    case R.id.item_2:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Search()).commit();
//                        Category_LO.setVisibility(View.VISIBLE);
//                        myinfo_LO.setVisibility(View.INVISIBLE);
//                        Home_LO.setVisibility(View.INVISIBLE);
//                        main_frame.addView(Category_LO);
//                        main_frame.removeViewInLayout(Home_LO);
//                        main_frame.removeViewInLayout(myinfo_LO);
//                        break;
//                    case R.id.item_3:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new MyInfo()).commit();
//                        myinfo_LO.setVisibility(View.VISIBLE);
//                        Home_LO.setVisibility(View.INVISIBLE);
//                        Category_LO.setVisibility(View.INVISIBLE);
//                        main_frame.addView(myinfo_LO);
//                        main_frame.removeViewInLayout(Home_LO);
//                        main_frame.removeViewInLayout(Category_LO);
//                        break;
//                    }
//                return true;
//            }
//        });
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
}