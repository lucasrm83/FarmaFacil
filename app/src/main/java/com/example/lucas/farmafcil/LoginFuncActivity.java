package com.example.lucas.farmafcil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginFuncActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_func);
    }
    public void startMenuFuncActivity (View view){
        Intent menuFuncActivity = new Intent(this, MenuFuncActivity.class);
        startActivity(menuFuncActivity);
    }
    public void startCadastroPessoaActivity (View view){
        Intent cadastroPessoaActivity = new Intent(this, CadastroPessoaActivity.class);
        startActivity(cadastroPessoaActivity);
    }

}
