package com.example.jm.jimmy_1202150108_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioGroup pilihan;
    RadioButton di,ta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pilihan = findViewById(R.id.RG);
        di = findViewById(R.id.dinein);
        ta = findViewById(R.id.takeaway);
    }

    public void pesan(View view) {
        int selected = pilihan.getCheckedRadioButtonId();

        if (selected == di.getId()){
            Toast.makeText(Main2Activity.this,"Dine In",Toast.LENGTH_SHORT).show();

            Intent dine = new Intent(Main2Activity.this,Main4Activity.class);
            startActivity(dine);
        }else if (selected == ta.getId()){
            Toast.makeText(Main2Activity.this,"Take Away",Toast.LENGTH_SHORT).show();

            Intent take = new Intent(Main2Activity.this,Main3Activity.class);
            startActivity(take);
        }

    }
}
