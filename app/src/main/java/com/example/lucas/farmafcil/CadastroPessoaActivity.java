package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastroPessoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);
    }

    public void startFimDoCadastro (View view){
        Intent fimcadastroPessoaActivity = new Intent(this, CadastroPessoaFimActivity.class);
        startActivity(fimcadastroPessoaActivity);
    }
}