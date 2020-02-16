package com.example.womansoul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText fecha;
    private EditText user;
    private EditText pass;
    private Button create;
    private int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        nombre=(EditText)findViewById(R.id.newName);
        fecha=(EditText)findViewById(R.id.newBirth);
        user=(EditText)findViewById(R.id.newUser);
        pass=(EditText)findViewById(R.id.newPass);
        create=(Button)findViewById(R.id.btnNewAcc);
    }
}
