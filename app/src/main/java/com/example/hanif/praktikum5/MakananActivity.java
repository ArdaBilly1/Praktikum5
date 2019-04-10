package com.example.hanif.praktikum5;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;


import com.example.hanif.praktikum5.RecycleView.Makanan;
import com.example.hanif.praktikum5.RecycleView.MakananAdapter;

import java.util.ArrayList;
import java.util.List;

public class MakananActivity extends AppCompatActivity {
    List<Makanan> makananList = new ArrayList<>();
    Button btnPesan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        List<Makanan> makananList = new ArrayList<>();
        makananList.add(new Makanan("makanan_1", "Nasi Goreng","Rp 20.000,00",R.drawable.nasgor));
        makananList.add(new Makanan("makanan_2", "Nasi Kebuli","Rp 25.000,00", R.drawable.kebuli));
        makananList.add(new Makanan("makanan_3", "Nasi Kucing","Rp 5.000,00", R.drawable.kucing));
        makananList.add(new Makanan("makanan_4", "Nasi Kucing Premium","Rp 50.000,00" ,R.drawable.segonekopremium));
        makananList.add(new Makanan("makanan_5", "Nasi Kuning","Rp 17.500,00" ,R.drawable.segokun));
        makananList.add(new Makanan("makanan_6", "Nasi Liwet","Rp 10.000,00" , R.drawable.liwet));
        makananList.add(new Makanan("makanan_7", "Nasi Pecel", "Rp 15.000,00", R.drawable.pecel));
        makananList.add(new Makanan("makanan_8", "Nasi Rames", "Rp 17.500,00", R.drawable.rames));
        makananList.add(new Makanan("makanan_9", "Nasi Tumpang", "Rp 9.000,00", R.drawable.segotump));
        makananList.add(new Makanan("makanan_10", "Nasi Uduk","Rp 15.000,00", R.drawable.segogurih));
        MakananAdapter adapterMakanan= new MakananAdapter(makananList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Makanan);
        recyclerView.setAdapter(adapterMakanan);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btnPesan = findViewById(R.id.btnPesan);


    }

}
