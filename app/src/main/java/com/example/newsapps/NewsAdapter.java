package com.example.newsapps;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
    private final ArrayList<Berita> values;
    private final LayoutInflater inflater;

    public NewsAdapter(Context context, ArrayList<Berita> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Berita berita = values.get(position);

        String judulnews = berita.judul;
        String kategorinews = berita.kategori;
        String usianews = Integer.toString(berita.age);
        String isinews = berita.isi;

        holder.txtjudul.setText(judulnews);
        holder.txtumur.setText(usianews);
        holder.txtkategori.setText(kategorinews);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentdetail = new Intent(view.getContext(), DetailNews.class);
                intentdetail.putExtra("judul", judulnews);
                intentdetail.putExtra("isi", isinews);
                intentdetail.putExtra("kategori", kategorinews);
                intentdetail.putExtra("usia", usianews);
                view.getContext().startActivity(intentdetail);
            }
        });

    }


    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtjudul, txtkategori, txtumur;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtjudul = itemView.findViewById(R.id.txt_judul);
            txtumur = itemView.findViewById(R.id.txt_umur);
            txtkategori = itemView.findViewById(R.id.txt_kategori);

        }
    }
}
