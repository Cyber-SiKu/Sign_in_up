package com.example.siku.sign_in_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class EnterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        Button button_entry = (Button) findViewById(R.id.button_entry);
        button_entry.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(EnterActivity.this,Sign_in.class);
        startActivity(intent);
    }
}
