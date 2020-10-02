package com.e.wgbaty.Models;

public class Notifi {
    private String name , time , details;
    private int  img;
    private boolean expanded;



    public  boolean isExpanded(){
        return expanded;
    }

    public void setExpanded(boolean expanded)
    {
        this.expanded = expanded;
    }


    public Notifi() {

        this.expanded = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
