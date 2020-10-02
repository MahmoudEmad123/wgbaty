package com.e.wgbaty.Models;

public class Restaurants {
    private String title , meals , available,txt_c;
    private int imgresturnt , img_available;


    public int getImgresturnt() {
        return imgresturnt;
    }

    public void setImgresturnt(int imgresturnt) {
        this.imgresturnt = imgresturnt;
    }

    public int getImg_available() {
        return img_available;
    }

    public void setImg_available(int img_available) {
        this.img_available = img_available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getTxt_c() {
        return txt_c;
    }

    public void setTxt_c(String txt_c) {
        this.txt_c = txt_c;
    }
}
