package com.example.jm.jimmy_1202150108_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        spin = findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        if (spin != null) {
            spin.setAdapter(adapter);
        }
    }

    public void pilihh(View view) {

        String meja = spin.getSelectedItem().toString();

        if (meja.equalsIgnoreCase("Meja 1")){
            Toast.makeText(Main4Activity.this, "Meja 1 telah terpilih",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(intent);
        } else if (meja.equalsIgnoreCase("Meja 2")){
            Toast.makeText(Main4Activity.this, "Meja 2 telah terpilih",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(intent);
        } else if (meja.equalsIgnoreCase("Meja 3")){
            Toast.makeText(Main4Activity.this, "Meja 3 telah terpilih",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(intent);
        }
    }
}
