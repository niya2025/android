package com.example.adapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView l1;
    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.ls);
        e1 = findViewById(R.id.editTextText3);
        e2 = findViewById(R.id.editTextText4);
        b1 = findViewById(R.id.button);
        String[] students = {
                "Niya",
                "karuna",
                "anu",
                "punnya",
                "aswani",};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,
                        students
                );

        l1.setAdapter(adapter);

        b1.setOnClickListener(v -> {
                    try {
                        int a = Integer.parseInt(
                                e1.getText().toString()
                        );
                        int b = Integer.parseInt(
                                e2.getText().toString()
                        );
                        int l1 = a / b;
                        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
                    }
                        catch (ArithmeticException e) {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Cannot divide by zero",
                                    Toast.LENGTH_SHORT).show();
                        } catch (NumberFormatException e) {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Enter Valid Number",
                                    Toast.LENGTH_SHORT).show();
                        } catch (Exception e) {
                            Toast.makeText(
                                    MainActivity.this,
                                    "error",
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    }
