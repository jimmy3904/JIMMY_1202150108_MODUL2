package com.example.jm.jimmy_1202150108_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;

    //Daftar Menu Makanan
    private String[] Judul = {"Bulgogi", "Nasi Goreng","Iga Bakar","Steak Beef","Steak Ayam","Kimchi",
            "Dumpling","Es Campur","Es Teh","Milk Shake"};
    //Daftar Hargac
    private String[] Harga = {"Rp. 30.000", "Rp. 20.000","Rp. 65.000","Rp. 70.000","Rp. 55.000","Rp. 10.000","Rp. 35.000","Rp. 15.000",
            "Rp. 5.000","Rp. 15.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.bulgogi, R.drawable.nasigoreng,R.drawable.igabakar,R.drawable.steakayam,R.drawable.steakayam,
            R.drawable.kimchi,R.drawable.dumpling,R.drawable.escampur,R.drawable.esteh,R.drawable.milkshake};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rvView = (RecyclerView) findViewById(R.id.recycler_view);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(dataMenu,dataHarga,gambar);
        rvView.setAdapter(adapter);

    }
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(Harga[w]);
            gambar.add(Gambar[w]);
        }
    }
}
