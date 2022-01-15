package com.example.programhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends AppCompatActivity {

    EditText edtjari;
    String jari;
    Button btnhitung;
double j, luas;
TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        btnhitung = (Button) findViewById(R.id.btnhitung);
        txthasil = (TextView) findViewById(R.id.txtHasil);

        edtjari = (EditText) findViewById(R.id.edtjari);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                jari= edtjari.getText().toString();

                j = Double.parseDouble(jari);


                luas =3.14*j*j;

                txthasil.setText("luas = "+j);
            }
        });

    }
}