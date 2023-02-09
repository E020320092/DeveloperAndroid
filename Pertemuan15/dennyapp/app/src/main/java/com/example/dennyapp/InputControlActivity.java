package com.example.dennyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class InputControlActivity extends AppCompatActivity {
    TextView tvValues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_control);

        SeekBar seekBar = findViewById(R.id.seekBar);
        tvValues = findViewById(R.id.tv_values);

        seekBar.setOnSeekBarChangeListener();

    }
}