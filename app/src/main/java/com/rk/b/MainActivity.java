package com.rk.b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button B_Contoh_IDJAVA;
    TextView TV_Contoh_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_Contoh_IDJAVA = findViewById(R.id.B_Contoh_IDXML);
        TV_Contoh_IDJAVA = findViewById(R.id.TV_Contoh_IDXML);

        B_Contoh_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_Contoh_IDJAVA.setText("Kamu Menekan Tombol!");
            }
        });
    }
}
