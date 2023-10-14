package com.example.switch_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch sw1,sw2,sw3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw1 = findViewById(R.id.sw1);
        sw2 = findViewById(R.id.sw2);
        sw3 = findViewById(R.id.sw3);
        sw1.setOnCheckedChangeListener(switchListener);
        sw2.setOnCheckedChangeListener(switchListener);
        sw3.setOnCheckedChangeListener(switchListener);
    }
    private final CompoundButton.OnCheckedChangeListener switchListener =
            new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    String switchLabel = ((Switch) buttonView).getText().toString();
                    if (isChecked) {
                        Toast.makeText(MainActivity.this, switchLabel+" On", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, switchLabel+" Off", Toast.LENGTH_SHORT).show();
                    }
                }
            };
}
