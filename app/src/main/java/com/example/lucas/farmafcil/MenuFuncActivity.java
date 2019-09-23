package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuFuncActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_func);
    }


    //codigo que botão SAIR utilizará, voltando a tela inicialActivity
    public void startInicialActivity (View view){
        Intent inicialActivity = new Intent(this, InicialActivity.class);
        startActivity(inicialActivity);


    }}