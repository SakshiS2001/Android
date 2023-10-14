package com.example.admission_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email,phone;
    Button register;
    RadioGroup radio_grp;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        radio_grp = findViewById(R.id.radio_grp);
        register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = name.getText().toString();
                String uemail = email.getText().toString();
                String uphone = phone.getText().toString();
                int selected_id = radio_grp.getCheckedRadioButtonId();
                radioButton = findViewById(selected_id);
                String radioButton_text = radioButton.getText().toString();
                Toast.makeText(MainActivity.this, "You Have Successfully Register!"+"\n Name : "+uname+"\n Email ID : "+uemail+"\n Phone Number : "+uphone+"\nGender : "+radioButton_text, Toast.LENGTH_SHORT).show();

            }
        });

    }
}