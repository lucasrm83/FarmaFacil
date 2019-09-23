package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //codigo para botao cadastrar, irá para tela de cadastro
    public void startCadastroPessoaActivity (View view){
        Intent cadastroPessoaActivity = new Intent(this, CadastroPessoaActivity.class);
        startActivity(cadastroPessoaActivity);
    }

    //codigo do botao entrar, irá para tela de mainActivity
    public void startMainActivity (View view){
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }}