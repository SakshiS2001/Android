package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox check1,check2,check3,check4;
    Button show_me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        show_me = findViewById(R.id.show_me);

        show_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res = "You have selected : ";
                if(check1.isChecked()){
                    res+="\n Pune";
                }
                if(check2.isChecked()){
                    res+="\n Pune";
                }
                if(check3.isChecked()){
                    res+="\n Pune";
                }
                if(check4.isChecked()){
                    res+="\n Pune";
                }
                Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}