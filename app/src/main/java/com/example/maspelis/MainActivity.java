package com.example.maspelis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Cargo el fragmento de la lista de películas
        loadFragment(new ListaPeliculas());
    }

    private void loadFragment(ListaPeliculas listaPeliculas) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, listaPeliculas)
                .addToBackStack(null)
                .commit();
    }
}