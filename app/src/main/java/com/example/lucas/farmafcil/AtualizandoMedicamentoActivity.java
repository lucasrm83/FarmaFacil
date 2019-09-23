package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AtualizandoMedicamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atualizando_medicamento);
    }
    public void startMedicamentoAtualizadoActivity (View view){
        Intent medicamentoAtualizadoActivity = new Intent(this, MedicamentoAtualizadoActivity.class);
        startActivity(medicamentoAtualizadoActivity);
    }
}
