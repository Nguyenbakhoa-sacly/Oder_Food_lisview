package com.example.oder_food;

public class item_food {
    private String ten;
    private String mota;
    private int img;

    public item_food(String ten, String mota, int img) {
        this.ten = ten;
        this.mota = mota;
        this.img = img;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
