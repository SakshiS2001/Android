package com.example.toggle_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tog1,tog2,tog3;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tog1 = findViewById(R.id.tog1);
        tog2 = findViewById(R.id.tog2);
        tog3 = findViewById(R.id.tog3);
        text2 = findViewById(R.id.text2);

        tog1.setOnCheckedChangeListener(toggleButtonListener);
        tog2.setOnCheckedChangeListener(toggleButtonListener);
        tog3.setOnCheckedChangeListener(toggleButtonListener);
    }
    private final CompoundButton.OnCheckedChangeListener toggleButtonListener =
            new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    String buttonLabel = ((ToggleButton) buttonView).getText().toString();
                    if (isChecked) {
                        Toast.makeText(MainActivity.this, buttonLabel+" is On", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, buttonLabel+" is Off", Toast.LENGTH_SHORT).show();
                    }
                }
            };
    }


