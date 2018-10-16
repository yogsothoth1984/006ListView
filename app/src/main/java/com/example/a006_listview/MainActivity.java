package com.example.a006_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> paises;
    private List<String> habitantes;
    private TextView textView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paises = new ArrayList<String>();
        paises.add("Argentina"),("Chile"), ("Bolivia"), ("Paraguay"), ("Peru"), ("Ecuador"), ("Brasil"),
                ("Colombia"), ("Venezuela"),("Uruguay");
        habitantes.add("40000", "17000", "65000", "10000", "30000", "14000", "183000",
                "44000", "29000", "85000");
        //Vincular
        textView = findViewById(R.id.textViewId);
        listView = findViewById(R.id.listViewId);
        //Un Adapter es una forma de mostrar los datos en el ListView y se le pasa un layout y lo rellena
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        //Enlazamos el adaptador con nuestro listView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clickeado: "+paises.get(position),Toast.LENGTH_SHORT).show();
            }
        });}}