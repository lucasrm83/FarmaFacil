package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastroPessoaFimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa_fim);
    }

    public void inicialActivity(View view) {
        Intent inicialActivity = new Intent(this, InicialActivity.class);
        startActivity(inicialActivity);
    }
}
