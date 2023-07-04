package com.example.penjualantiketbus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHargaTiket, textviewHasil;
    private CheckBox checkboxMalang, checkboxSurabaya, checkboxSemarang, checkboxJakarta;
    private Button buttonProses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHargaTiket = findViewById(R.id.textviewHargaTiket);
        textviewHasil = findViewById(R.id.textviewHasil);

        checkboxMalang = findViewById(R.id.checkboxMalang);
        checkboxSurabaya = findViewById(R.id.checkboxSurabaya);
        checkboxSemarang = findViewById(R.id.checkboxSemarang);
        checkboxJakarta = findViewById(R.id.checkboxJakarta);

        buttonProses = findViewById(R.id.buttonProses);
        buttonProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prosesPemesanan();
            }
        });
    }

    private void prosesPemesanan() {
        String kotaTujuan = "";
        int harga = 0;

        if (checkboxMalang.isChecked()) {
            kotaTujuan = "Malang";
            harga = 100000;
        } else if (checkboxSurabaya.isChecked()) {
            kotaTujuan = "Surabaya";
            harga = 150000;
        } else if (checkboxSemarang.isChecked()) {
            kotaTujuan = "Semarang";
            harga = 250000;
        } else if (checkboxJakarta.isChecked()) {
            kotaTujuan = "Jakarta";
            harga = 300000;
        }

        textViewHargaTiket.setText("Harga Tiket");
        if (!kotaTujuan.isEmpty()) {
            textViewHargaTiket.append("\n(" + kotaTujuan + " : " + harga + ")");
        }

        textviewHasil.setText("Kota Tujuan: " + kotaTujuan + "\nHarga Tiket: " + harga);
    }
}
