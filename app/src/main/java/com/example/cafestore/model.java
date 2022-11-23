package com.example.cafestore;

public class model {

    private String name;
    private String price;
    private int img;
    private String h_name;
    private String h_rating;
    private int h_imag;

    public model() {
    }

    public model(String name, String price, int img, String h_name, String hrating, int h_imag) {
        this.name = name;
        this.price = price;
        this.img = img;
        this.h_name = h_name;
        this.h_rating = hrating;
        this.h_imag = h_imag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public String getH_rating() {
        return h_rating;
    }

    public void setH_rating(String h_rating) {
        this.h_rating = h_rating;
    }

    public int getH_imag() {
        return h_imag;
    }

    public void setH_imag(int h_imag) {
        this.h_imag = h_imag;
    }
}
