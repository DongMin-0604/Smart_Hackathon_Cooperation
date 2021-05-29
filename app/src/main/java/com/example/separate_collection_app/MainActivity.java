package com.example.separate_collection_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private long backkeyPressedTime = 0;

    private Toast toast;


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);

        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new Home()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_fragment1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Home()).commit();
                        break;
                    case R.id.item_fragment2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Search()).commit();
                        break;
                    case R.id.item_fragment3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new MyInfo()).commit();
                        break;
                    }
                return true;
            }
        });
        SharedPreferences pref = getSharedPreferences("IsFirst", Activity.MODE_PRIVATE);
        boolean first = pref.getBoolean("isFirst",false);
        if (first == false){
            Log.d("Is first Time?","first");
            SharedPreferences.Editor editor = pref.edit();
            editor.putBoolean("isFirst",true);
            editor.commit();

            Intent intent = new Intent(getApplicationContext(),StartActivity.class);
            startActivity(intent);
        }else{
            Log.d("Is first Time?","not first");
        }





    }
}