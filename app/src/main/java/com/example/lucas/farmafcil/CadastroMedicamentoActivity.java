package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

public class CadastroMedicamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_medicamento);
    }
    public void startMedicamentoCadastradoActivity (View view) {
        Intent medicamentoCadastradoActivity = new Intent(this, MedicamentoCadastradoActivity.class);
        startActivity(medicamentoCadastradoActivity);
    }


}

