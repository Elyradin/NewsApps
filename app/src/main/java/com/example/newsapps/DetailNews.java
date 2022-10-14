package com.example.newsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailNews extends AppCompatActivity {
    TextView juduldet, katdet, usiadet, isidet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);
        Bundle bundle = getIntent().getExtras();
        String judul = bundle.getString("judul");
        String kategori = bundle.getString("kategori");
        String usia = bundle.getString("usia");
        String isi = bundle.getString("isi");

        juduldet = findViewById(R.id.det_judul);
        katdet = findViewById(R.id.det_kategori);
        usiadet = findViewById(R.id.det_usia);
        isidet = findViewById(R.id.det_isi);

        juduldet.setText(judul);
        katdet.setText(kategori);
        usiadet.setText(usia);
        isidet.setText(isi);
    }
}