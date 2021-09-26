package com.example.infogram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.infogram.View.Container_activity;
import com.example.infogram.View.crear_cuenta;

public class Infograms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infograms);
    }
    public void goCreateAccount(View view){
        //Intent intent = new Intent(Infograms.this,crear_cuenta.class);

        Intent intent = new Intent(this, crear_cuenta.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(this, Container_activity.class);
        startActivity(intent);
    }
}
