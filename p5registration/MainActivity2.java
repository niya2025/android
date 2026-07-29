package com.example.registration;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2  extends AppCompatActivity {
    TextView txtWelcome;
    @SuppressLint("MissingflatedId")
    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        txtWelcome = findViewById(R.id.textView);
        String name = getIntent().getStringExtra("username");
        txtWelcome.setText("Welcome" + name);
    }
}
