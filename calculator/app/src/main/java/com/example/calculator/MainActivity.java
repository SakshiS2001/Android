package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText src;
    boolean newvalue=true;
    String operator = "";
    String number = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        src = findViewById(R.id.src);
    }
    public void digit(View view){
        String input;
        switch(view.getId()){
            case R.id.btn1:
                src.append("7");
                break;
            case R.id.btn2:
                src.append("8");
                break;
            case R.id.btn3:
                src.append("9");
                break;
            case R.id.btn5:
                src.append("4");
                break;
            case R.id.btn6:
                src.append("5");
                break;
            case R.id.btn7:
                src.append("6");
                break;
            case R.id.btn9:
                src.append("1");
                break;
            case R.id.btn10:
                src.append("2");
                break;
            case R.id.btn11:
                src.append("3");
                break;
            case R.id.btn14:
                src.append("0");
                break;
        }
    }
    public void arithmatic(View view)
    {
        newvalue=true;
        number=src.getText().toString();
        switch(view.getId())
        {
            case R.id.btn4:
                operator ="+";
                break;
            case R.id.btn8:
                operator="*";
                break;
            case R.id.btn12:
                operator="-";
                break;
            case R.id.btn16:
                operator="/";
                break;
        }
        src.append(operator);
    }
    public void equal(View view)
    {
        newvalue=true;

        String[] values= src.getText().toString().split("[+*/-]");
        String anotherNumber = values[1];
        double answer=0.0;
        switch (operator)
        {
            case "+": answer=Double.parseDouble(number)+Double.parseDouble(anotherNumber); break;
            case "-": answer=Double.parseDouble(number)-Double.parseDouble(anotherNumber); break;
            case "/": answer=Double.parseDouble(number)/Double.parseDouble(anotherNumber); break;
            case "*": answer=Double.parseDouble(number)*Double.parseDouble(anotherNumber); break;
        }
        src.append(""+"\n"+answer+"");
    }
    public void clear(View view)
    {
        src.setText("");
        newvalue=true;
    }
}