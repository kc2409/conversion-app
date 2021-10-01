package com.example.conversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConMileToKm = (Button) findViewById(R.id.button1);
        buttonConMileToKm.setOnClickListener((View.OnClickListener) v -> {
            EditText textBoxMiles = (EditText) findViewById(R.id.editTextNumber);
            EditText textBoxKm = (EditText) findViewById(R.id.editTextNumber2);
            double vMiles = Double.valueOf(textBoxMiles.getText().toString());
            double vkm = vMiles / 0.62137;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            textBoxKm.setText(formatVal.format(vkm));
        });
        Button buttonConKmToMile = (Button) findViewById(R.id.button2);
        buttonConKmToMile.setOnClickListener((View.OnClickListener) v -> {
            EditText textBoxMiles = (EditText) findViewById(R.id.editTextNumber);
            EditText textBoxKm = (EditText) findViewById(R.id.editTextNumber2);
            double vkm = Double.valueOf(textBoxKm.getText().toString());
            double vMiles = vkm * 0.62137;
            DecimalFormat formatVal = new DecimalFormat("##.##");
            textBoxMiles.setText(formatVal.format(vMiles));
        });
    }
}