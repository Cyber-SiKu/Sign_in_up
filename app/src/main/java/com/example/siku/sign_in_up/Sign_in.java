package com.example.siku.sign_in_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_in extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button button_sign_up = (Button) findViewById(R.id.sign_up_button);
        button_sign_up.setOnClickListener(this);
        Button button_ensure = (Button) findViewById(R.id.sure_button);
        button_ensure.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.sign_up_button) {
            //sign up
            Intent intent = new Intent(Sign_in.this, sign_up.class);
            startActivity(intent);
        }else{
            //sign in
            EditText username = (EditText) findViewById(R.id.username);
            EditText password = (EditText) findViewById(R.id.password);
            UsernamePassword up = new UsernamePassword(username.getText().toString(),password.getText().toString());
            if (UsernamePasswordList.contains(up)){
                Toast.makeText(Sign_in.this, "登录成功!", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(Sign_in.this, "不存在此用户!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
