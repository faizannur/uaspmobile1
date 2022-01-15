package com.example.programhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {

     EditText edtpanjang, edtlebar;
    Button btnhitung;

     String panjang, lebar;
     double p, l, luas;
     TextView txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        edtpanjang = (EditText) findViewById(R.id.edtpanjang);
        edtlebar = (EditText) findViewById(R.id.edtlebar);
        btnhitung = (Button) findViewById(R.id.btnhitung);
        txthasil = (TextView) findViewById(R.id.txtHasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                panjang = edtpanjang.getText().toString();
                lebar = edtlebar.getText().toString();

                p = Double.parseDouble(panjang);
                l = Double.parseDouble(lebar);

                luas = p * l;

                txthasil.setText("Luas = "+luas);
            }
        });

    }
}