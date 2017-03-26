package com.example.siku.sign_in_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button button_sure = (Button) findViewById(R.id.sure_button);
        button_sure.setOnClickListener(this);
        Button button_cancel = (Button) findViewById(R.id.cancel_button);
        button_cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cancel_button){
            finish();
        } else {
            EditText password = (EditText) findViewById(R.id.edit_password);
            EditText password_sure = (EditText) findViewById(R.id.edit_password_ensure);
            EditText username = (EditText) findViewById(R.id.edit_name);
            if (password.getText().toString().isEmpty() || password_sure.getText().toString().isEmpty() || username.getText().toString().isEmpty()) {
                Toast.makeText(sign_up.this, "请完整填写!", Toast.LENGTH_SHORT).show();
            } else {
                if (password.getText().toString().equals(password_sure.getText().toString())) {
                    //these paaaword are same
                    UsernamePassword up = new UsernamePassword(username.toString(), password.toString());
                    if (!UsernamePasswordList.contains(up)) {
                        Toast.makeText(sign_up.this, username.getText().toString() + "注册成功", Toast.LENGTH_SHORT).show();
                        UsernamePasswordList.add(up);
                    } else {
                        Toast.makeText(sign_up.this, username.getText().toString() + "用户名已存在", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(sign_up.this, "两次密码不一致!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
