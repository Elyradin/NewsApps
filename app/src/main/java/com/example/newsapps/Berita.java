package com.example.newsapps;

public class Berita {
    String judul;
    String isi;
    Integer age;
    String kategori;

    public Berita(String judul, Integer age, String kategori) {
        this.judul = judul;
        this.age = age;
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
