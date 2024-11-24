package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText input1, input2, input3;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        resultView = findViewById(R.id.resultView);
    }

    public void calculate(View view) {
        try {
            double value1 = Double.parseDouble(input1.getText().toString());
            double value2 = Double.parseDouble(input2.getText().toString());
            double value3 = input3.getText().toString().isEmpty() ? 0 : Double.parseDouble(input3.getText().toString());

            // Example: Calculate rectangle area
            double result = Logic.rectangleArea(value1, value2);

            resultView.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultView.setText("Please enter valid numbers!");
        }
    }
}
