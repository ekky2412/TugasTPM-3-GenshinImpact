package com.example.intentdanrecyclertugas.model;

public class ModelKarakter {
    public String namaKarakter, detailKarakter,tipeWeapon;
    public int gambarKarakter,iconWeapon,gambarRarity;

    public String getNamaKarakter() {
        return namaKarakter;
    }

    public void setNamaKarakter(String namaKarakter) {
        this.namaKarakter = namaKarakter;
    }

    public String getDetailKarakter() {
        return detailKarakter;
    }

    public void setDetailKarakter(String detailKarakter) {
        this.detailKarakter = detailKarakter;
    }

    public String getTipeWeapon() {
        return tipeWeapon;
    }

    public void setTipeWeapon(String tipeWeapon) {
        this.tipeWeapon = tipeWeapon;
    }

    public int getGambarKarakter() {
        return gambarKarakter;
    }

    public void setGambarKarakter(int gambarKarakter) {
        this.gambarKarakter = gambarKarakter;
    }

    public int getIconWeapon() {
        return iconWeapon;
    }

    public void setIconWeapon(int iconWeapon) {
        this.iconWeapon = iconWeapon;
    }

    public int getGambarRarity() {
        return gambarRarity;
    }

    public void setGambarRarity(int gambarRarity) {
        this.gambarRarity = gambarRarity;
    }

    public ModelKarakter(String namaKarakter, String detailKarakter, String tipeWeapon, int gambarKarakter, int iconWeapon, int gambarRarity) {
        this.namaKarakter = namaKarakter;
        this.detailKarakter = detailKarakter;
        this.tipeWeapon = tipeWeapon;
        this.gambarKarakter = gambarKarakter;
        this.iconWeapon = iconWeapon;
        this.gambarRarity = gambarRarity;
    }
}
