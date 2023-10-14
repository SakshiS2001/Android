package com.example.radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radio_grp;
    RadioButton radio1,radio2,radio3;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio_grp = findViewById(R.id.radio_grp);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int selected_id = radio_grp.getCheckedRadioButtonId();
//                radioButton = findViewById(selected_id);
                String res = "You have select : ";
                if(radio1.isChecked()){
                    res += "\nPune";
                }
                if(radio2.isChecked()){
                    res += "\nMumbai";
                }
                if(radio3.isChecked()){
                    res += "\nNagpur";
                }
                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
            }
        });

    }
}