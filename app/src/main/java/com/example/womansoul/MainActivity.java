package com.example.womansoul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText correo;
    private EditText pass;
    private Button login;
    private Button create;
    private int cantidadusuarios=10;
    public String [] usuarios= new String[cantidadusuarios];
    public String [] passwords= new String[cantidadusuarios];


    public MainActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuarios[0]="Admin";
        passwords[0]="1234";
        correo = (EditText)findViewById(R.id.txtEmail);
        pass =(EditText)findViewById(R.id.txtPassword);
        login = (Button)findViewById(R.id.btnLogin);
        create = (Button)findViewById(R.id.btnCreateAcc);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validar(correo.getText().toString(),pass.getText().toString());
            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
    private void validar(String username, String userpass){
        for(int i=0;i<cantidadusuarios;i++){
            if((username.equals(usuarios[i]))&&(userpass.equals(passwords[i]))){
                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        }
    }
}
