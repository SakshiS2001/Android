package com.example.addition_of_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2,num3,num4,num5;
    Button add;
    TextView result;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        result = findViewById(R.id.result);
        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a = Integer.parseInt(num1.getText().toString());
                Integer b = Integer.parseInt(num1.getText().toString());
                Integer c = Integer.parseInt(num1.getText().toString());
                Integer d = Integer.parseInt(num1.getText().toString());
                Integer e = Integer.parseInt(num1.getText().toString());
                Integer f = a+b+c+d+e;
                result.setText("Addition is : "+f);
            }
        });
    }
}