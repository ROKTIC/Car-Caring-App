package com.inrok.caring.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.inrok.caring.R;

public class MypageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        ImageView mygarage = (ImageView) findViewById(R.id.Mygarage);

        mygarage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if(v.getId() ==R.id.Mygarage){
                    Intent intent=new Intent(MypageActivity.this,MygarageActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
