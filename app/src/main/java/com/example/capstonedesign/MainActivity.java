package com.example.capstonedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ID;
        ID = findViewById(R.id.name);
        EditText PW = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        String id = ID.getText().toString();
        String pw = PW.getText().toString();
        String pl = "1234";
        String plz = "4321";
        Intent intent = new Intent(MainActivity.this, homepage.class);
        login.setOnClickListener(view -> {
                if (id.equals(pl) && pw.equals(plz)) {

                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "취소하였습니다.", Toast.LENGTH_SHORT).show();
                }
        });

    }
    }