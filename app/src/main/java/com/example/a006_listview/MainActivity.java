package com.example.a006_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] paises = {"Argentina", "Chile", "Bolivia", "Paraguay", "Peru", "Ecuador", "Brasil",
            "Colombia", "Venezuela", "Uruguay"};
    private String[] habitantes = {"40000", "17000", "65000", "10000", "30000", "14000", "183000",
            "44000", "29000", "85000"};
    private TextView textView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Vincular
        textView = findViewById(R.id.textViewId);
        listView = findViewById(R.id.listViewId);
        //Un Adapter es una forma de mostrar los datos en el ListView y se le pasa un layout y lo rellena
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        //Enlazamos el adaptador con nuestro listView
        listView.setAdapter(adapter);
        listView.setOnClickListener(new AdapterView.OnItemClickListener());{
            @Override
            public void onItemClick(AdapterView adapter, View view, int position, long id) {
                textView.setText("Poblacion de "+listView.getItemAtPosition(position)+" es "+ habitantes[position])})}}}