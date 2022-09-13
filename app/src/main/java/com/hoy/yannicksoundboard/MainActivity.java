package com.hoy.yannicksoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView header;
Button sue;
Button skibidipapap;
Button skiskiska;
Button brrr;
Button skrt;
Button aufzumatem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sue = findViewById(R.id.sue);
        skibidipapap = findViewById(R.id.skibidi);
        skiskiska = findViewById(R.id.skiskiska);
        brrr = findViewById(R.id.brrr);
        skrt = findViewById(R.id.skrt);
        aufzumatem = findViewById(R.id.aufzumatem);

        sue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer.create(v.getContext(), R.raw.sue).start();
            }
        });
        skibidipapap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer.create(v.getContext(), R.raw.skibidipapap).start();
            }
        });
        skiskiska.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer.create(v.getContext(), R.raw.skiskiska).start();
            }
        });
        brrr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer.create(v.getContext(), R.raw.brr).start();
            }
        });
        aufzumatem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer.create(v.getContext(), R.raw.aufzumatem).start();
            }
        });
        skrt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MediaPlayer.create(v.getContext(), R.raw.skrt).start();
            }
        });


    }
}