package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //codigo para o botao buscar utilizar
    public void startBuscaActivity (View view){
        Intent buscaActivity = new Intent(this,BuscaActivity.class);
        startActivity(buscaActivity);
    }
    //codigo para o botão sair utilizar(android:onClick)
    public void startSairDoMenu (View view){
        Intent loginActivity = new Intent(this,LoginActivity.class);
        startActivity(loginActivity);
    }



}