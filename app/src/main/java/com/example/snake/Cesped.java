package com.example.snake;

import android.graphics.Bitmap;

public class Cesped {
    private Bitmap bm; //imagen en memoria
    private int x,y,widt,height;

    public Cesped(Bitmap bm, int x, int y, int widt, int height) {
        this.bm = bm;
        this.x = x;
        this.y = y;
        this.widt = widt;
        this.height = height;
    }

    public Bitmap getBm() {
        return bm;
    }

    public void setBm(Bitmap bm) {
        this.bm = bm;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidt() {
        return widt;
    }

    public void setWidt(int widt) {
        this.widt = widt;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
