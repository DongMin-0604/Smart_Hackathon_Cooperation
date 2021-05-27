package com.example.separate_collection_app;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    TextView start_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        //   시작화면 제목 두껍게 하기위한 코드
        start_title =(TextView) findViewById(R.id.Start_Title);
        start_title.setPaintFlags(start_title.getPaintFlags()| Paint.FAKE_BOLD_TEXT_FLAG);

        Button TestBT = (Button)findViewById(R.id.go_main_bt);
        TestBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
            }
        });

    }
}