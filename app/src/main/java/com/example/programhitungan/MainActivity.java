package com.example.programhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegi(View view) {
        Intent intent = new Intent(MainActivity.this, persegi.class);
        startActivity(intent);
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, lingkaran.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, profil.class);
        startActivity(intent);
    }
}