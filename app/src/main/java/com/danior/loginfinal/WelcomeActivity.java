package com.danior.loginfinal;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcomeMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomeMessageTextView = findViewById(R.id.welcomeMessageTextView);
        welcomeMessageTextView.setText("¡Bienvenido!");
    }
}