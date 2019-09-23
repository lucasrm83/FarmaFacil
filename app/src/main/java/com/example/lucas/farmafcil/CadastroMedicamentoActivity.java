package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

public class CadastroMedicamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_medicamento);
    }

    public void Clicar(View v){
        Toast.makeText(this,"Voce Clicou",Toast.LENGTH_LONG).show();
    }
}

