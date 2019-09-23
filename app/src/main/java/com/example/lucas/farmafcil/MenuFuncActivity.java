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
    public void startCadastroMedicamentoActivity (View view) {
        Intent cadastroMedicamentoActivity = new Intent(this, CadastroMedicamentoActivity.class);
        startActivity(cadastroMedicamentoActivity);

    }
    public void startBuscaFuncActivity (View view) {
        Intent buscaFuncActivity = new Intent(this, BuscaFuncActivity.class);
        startActivity(buscaFuncActivity);
    }
    public void startAtualizandoMedicamentoActivity (View view) {
        Intent atualizandoMedicamentoActivity = new Intent(this, AtualizandoMedicamentoActivity.class);
        startActivity(atualizandoMedicamentoActivity);
    }
    //codigo que botão SAIR utilizará, voltando a tela inicialActivity
    public void startInicialActivity (View view){
        Intent inicialActivity = new Intent(this, InicialActivity.class);
        startActivity(inicialActivity);


    }}