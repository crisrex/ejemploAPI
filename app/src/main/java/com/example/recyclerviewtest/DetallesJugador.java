package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class DetallesJugador extends AppCompatActivity {
    TextView item_dorsal, item_nombre, item_apellidos, item_equipo, item_goles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalles);

        item_dorsal = (TextView) findViewById(R.id.item_dorsal);
        item_nombre = (TextView) findViewById(R.id.item_nombre);
        item_apellidos = (TextView) findViewById(R.id.item_apellido);
        item_equipo = (TextView) findViewById(R.id.item_equipo);
        item_goles = (TextView) findViewById(R.id.item_goles);

        Bundle extras = getIntent().getExtras();
        if (extras !=null) {
            int dorsal = extras.getInt("dorsal");
            String nombre = extras.getString("nombre");
            String apellidos = extras.getString("apellido");
            String equipo = extras.getString("equipo");
            int goles = extras.getInt("goles");

            item_dorsal.setText("Dorsal: " + String.valueOf(dorsal));
            item_nombre.setText("Nombre: " + nombre);
            item_apellidos.setText("Apellidos: " + apellidos);
            item_equipo.setText("Equipo: " + equipo);
            item_goles.setText("Goles: " + String.valueOf(goles));
        }



    }
}
