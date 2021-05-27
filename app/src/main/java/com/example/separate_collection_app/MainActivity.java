package com.example.separate_collection_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

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


    }
}