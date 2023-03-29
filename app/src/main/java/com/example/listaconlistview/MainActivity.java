package com.example.listaconlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList listadoEdificios = new ArrayList<Edificacion>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // llamar a los metodos
        data();
        generarLista();
    }

    public void generarLista(){
        ArrayAdapter<Edificacion> adapter = new EdificacionListAdapter(this, R.layout.item, listadoEdificios, getLayoutInflater());
        ListView lv = findViewById(R.id.lv_lista);
        lv.setAdapter(adapter);
    }

    public void data(){
        listadoEdificios.add(new Edificacion(R.drawable.edificio1,"Edificio Baxter Avenida Madison y Calle 42", 500000.0));
        listadoEdificios.add(new Edificacion(R.drawable.edificio2,"Escuela Howard ingreso por Plataforma 9 y 3/4", 1200000.0));
        listadoEdificios.add(new Edificacion(R.drawable.edificio3,"Castillo de Zafra", 900000.0));

    }
}