package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textResult;
        EditText edtHeightInch, edtHeightFeet,edtWeight;
        Button btnCalculate;
        edtHeightInch = findViewById(R.id.edtHeightInch);
        edtHeightFeet = findViewById(R.id.edtHeightFeet);
        textResult = findViewById(R.id.txtResult);
        btnCalculate = findViewById(R.id.btnCalculate);
        edtWeight = findViewById(R.id.edtWeight);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int htft = Integer.parseInt(edtHeightFeet.getText().toString());
                int htin = Integer.parseInt(edtHeightInch.getText().toString());
                int totalInch = htft * 12 + htin;
                double ht = ((totalInch*2.53)/100);
                double bmi = wt/(ht*ht);
                textResult.setText("Your BMI is "+ bmi);
            }
        });

    }
}