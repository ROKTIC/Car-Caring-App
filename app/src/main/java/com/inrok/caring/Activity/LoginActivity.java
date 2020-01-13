package com.inrok.caring.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inrok.caring.R;

public class LoginActivity extends AppCompatActivity {


    private Button Login_Button;
    private Button Sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





        Sign_up = (Button)findViewById(R.id.btn_signup);
        Login_Button = (Button)findViewById(R.id.btn_login);



        // ------------------------------------- CLICK EVENT ----------------------------

        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

        Login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,MypageActivity.class);
                startActivity(intent);
            }
        });
    }
}
