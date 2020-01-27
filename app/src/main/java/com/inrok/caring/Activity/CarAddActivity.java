package com.inrok.caring.Activity;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.inrok.caring.R;

import java.util.ArrayList;

public class CarAddActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayList<String> carArr = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_add);
        // Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        listView = (ListView) findViewById(R.id.Carlistview);
        //EditText CarSearchedit = (EditText)findViewById(R.id.CarSearch);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carArr);
        ImageView hyundai_logo = (ImageView) findViewById(R.id.hyundai_logo);
        ImageView kia_logo= (ImageView) findViewById(R.id.kia_logo);
        hyundai_logo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (v.getId() == R.id.hyundai_logo) {
                    for (int i = 0; i < 20; i++) {
                        carArr.add("현대차량 " + i);
                    }
                    listView.setAdapter(adapter);
                }
            }
        });

        kia_logo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (v.getId() == R.id.kia_logo) {
                    for (int i = 0; i < 20; i++) {
                        carArr.add("기아차량 " + i);
                    }
                    listView.setAdapter(adapter);
                }
            }
        });

        //*********************** 임시 코드 <삭제 예정>
        TextView Whatcar = (TextView) findViewById(R.id.Whatcar);
        Whatcar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (v.getId() == R.id.Whatcar) {
                    Intent intent = new Intent(CarAddActivity.this, MypageActivity.class);
                    startActivity(intent);
                }
            }
        });

        // FloatingActionButton fab = findViewById(R.id.fab);
        /*
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */
    }
}
