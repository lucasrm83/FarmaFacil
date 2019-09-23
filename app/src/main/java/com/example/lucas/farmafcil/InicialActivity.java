package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class InicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
    }



    public void startMenuFuncActivity (View view){
        Intent menuFuncActivity = new Intent(this, MenuFuncActivity.class);
        startActivity(menuFuncActivity);
    }
    public void startLoginActivity (View view){
        Intent loginActivity = new Intent(this, LoginActivity.class);
        startActivity(loginActivity);


    }}

