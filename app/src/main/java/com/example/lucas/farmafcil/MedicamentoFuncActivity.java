package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MedicamentoFuncActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento_func);
    }
    public void startAtualizandoMedicamentoActivity (View view) {
        Intent atualizandoMedicamentoActivity = new Intent(this, AtualizandoMedicamentoActivity.class);
        startActivity(atualizandoMedicamentoActivity);
    }
    public void startMedicamentoExcluidoActivity (View view) {
        Intent medicamentoExcluidoActivity = new Intent(this, MedicamentoExcluidoActivity.class);
        startActivity(medicamentoExcluidoActivity);
    }

    public void startMenuFuncActivity (View view){
        Intent menuFuncActivity = new Intent(this, MenuFuncActivity.class);
        startActivity(menuFuncActivity);
    }
}
