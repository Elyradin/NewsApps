package com.example.newsapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ListBerita extends AppCompatActivity {
    private NewsAsset completeNewsAssetclass;
    private RecyclerView recyclerView;
    private ArrayList<Berita> newsArray = new ArrayList<>();
    private NewsAdapter newsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_berita);
        Bundle bundle = getIntent().getExtras();
        String kategori = bundle.getString("kategori");
        String tanggalLahir = bundle.getString("tahun");
        int usia = 2022 - Integer.parseInt(tanggalLahir);

        completeNewsAssetclass = new NewsAsset();

        filterNews(usia, kategori);

        newsAdapter = new NewsAdapter(this, newsArray);
        recyclerView = findViewById(R.id.rv_berita);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newsAdapter);

    }

    private void filterNews(int umur, String kategory) {
        ArrayList <Berita> completeNewsAsset = completeNewsAssetclass.berita;

        for (int i = 0; i <= completeNewsAsset.size()-1; i++){
            Berita hotnews = completeNewsAsset.get(i);
            if (hotnews.kategori.equals(kategory) && hotnews.age <= umur){
                newsArray.add(hotnews);
            }
            else{
                continue;
            }
        }
    }

}