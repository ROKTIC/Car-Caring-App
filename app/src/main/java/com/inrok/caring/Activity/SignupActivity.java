package com.inrok.caring.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inrok.caring.R;

public class SignupActivity extends AppCompatActivity {

    private Button Sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Sign_up = (Button)findViewById(R.id.btn_signup);



        // ------------------------------------- CLICK EVENT ----------------------------
        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignupActivity.this,CarAddActivity.class);
                startActivity(intent);
            }
        });

    }
}
