package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MedicamentoAtualizadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento_atualizado);
    }
    public void startMenuFuncActivity (View view){
        Intent menuFuncActivity = new Intent(this, MenuFuncActivity.class);
        startActivity(menuFuncActivity);
    }
}
