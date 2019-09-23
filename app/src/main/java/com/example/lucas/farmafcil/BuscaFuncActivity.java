package com.example.lucas.farmafcil;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BuscaFuncActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter2 recyclerAdapter2;

    List<String> moviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_func);

        moviesList = new ArrayList<>();
        moviesList.add("Roacutan");
        moviesList.add("Alprazolan");
        moviesList.add("Amoxilina");
        moviesList.add("Rivotril");
        moviesList.add("Paracetamol");
        moviesList.add("Hidroxizina");
        moviesList.add("Budesonina");
        moviesList.add("Diasepan");
        moviesList.add("Dexametazona");
        moviesList.add("Dipirona");


        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter2 = new RecyclerAdapter2(moviesList);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter2);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.llllaction_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                recyclerAdapter2.getFilter().filter(newText);
                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }
}














