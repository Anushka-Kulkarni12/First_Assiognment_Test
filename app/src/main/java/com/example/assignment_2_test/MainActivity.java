package com.example.assignment_2_test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        EditText edtAmount;
        Button btnConvert;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edtAmount = findViewById(R.id.edtAmount);
            btnConvert = findViewById(R.id.btnConvert);

            btnConvert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String amountStr = edtAmount.getText().toString();
                    if (!amountStr.isEmpty()) {
                        int amount = Integer.parseInt(amountStr);

                        Toast.makeText(MainActivity.this, "Amount: " + amount, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter an amount", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }


