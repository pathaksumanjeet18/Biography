package com.example.greathuman.Models;

public class descriptionModel {

    int pic;
    String text1;
    String text2;

    public descriptionModel(int pic, String text1, String text2) {
        this.pic = pic;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
