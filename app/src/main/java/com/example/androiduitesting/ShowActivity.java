package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    TextView cityNameText;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityNameText = findViewById(R.id.text_city_name);
        backButton = findViewById(R.id.button_back);

        // Get city name from Intent
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");

        cityNameText.setText(cityName);

        backButton.setOnClickListener(v -> {
            finish();   // Go back to MainActivity
        });
    }
}