package com.example.snake;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.ArrayList;

public class Serpiente {
    //todas la imagenes que necesitamos con todas las partes de la serpiente en distintas direcciones
    // (arriba,abajo,izq,derecha)
    private Bitmap bm,bm_cabeza_arriba,bm_cabeza_abajo,bm_cabeza_iz,
            bm_cabez_der,bm_cuerpo_vertical,bm_cuerpo_horizontal, bm_cuerpo_ar_de, bm_cuerpo_ar_iz,
            bm_cuerpo_abajo_der,bm_cuerpo_abajo_iz,bm_cola_der,bm_cola_iz,bm_cola_ar,bm_cola_abajo;

    private int x,y,length;
    private ArrayList<PartesSerpiente>arrPartesSer=new ArrayList<>();

    public Serpiente(Bitmap bm, int y, int x, int length) { //constructor, creamos una serpiente, con una longitud y coordenadas
        this.length = length;
        this.y = y;
        this.x = x;
        this.bm = bm;
        //guardamos una imagen de cada una de las partes que puede tener la serpiente, cogemos de la imagen grande(bm), una pequeña (cabeza, cuerpo,cola)
        bm_cuerpo_abajo_iz=Bitmap.createBitmap(bm,0,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);  //pieza 1
        bm_cuerpo_abajo_der=Bitmap.createBitmap(bm,VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa); //ppieza 2
        bm_cuerpo_horizontal=Bitmap.createBitmap(bm,2*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);  //pieza 3....
        bm_cuerpo_ar_iz=Bitmap.createBitmap(bm,3*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cuerpo_ar_de=Bitmap.createBitmap(bm,4*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cuerpo_vertical=Bitmap.createBitmap(bm,5*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cabeza_abajo=Bitmap.createBitmap(bm,6*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cabeza_iz=Bitmap.createBitmap(bm,7*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cabez_der=Bitmap.createBitmap(bm,8*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cabeza_arriba=Bitmap.createBitmap(bm,9*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cola_ar=Bitmap.createBitmap(bm,10*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cola_der=Bitmap.createBitmap(bm,11*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cola_iz=Bitmap.createBitmap(bm,12*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        bm_cola_abajo=Bitmap.createBitmap(bm,13*VistaJuego.tamañoMapa,0,VistaJuego.tamañoMapa,VistaJuego.tamañoMapa);
        arrPartesSer.add(new PartesSerpiente(bm_cabez_der,x,y));
        for(int i=1;i<length-1;i++){
            arrPartesSer.add(new PartesSerpiente(bm_cuerpo_horizontal, arrPartesSer.get(i-1).getX()-VistaJuego.tamañoMapa,y));
        }
        arrPartesSer.add(new PartesSerpiente(bm_cola_der, arrPartesSer.get(length-2).getX()-VistaJuego.tamañoMapa,y));

    }

    public void draw(Canvas canvas){ //dibujamos serpiente en la pantalla
        //cada vez que queramos mostrar la serpiente en pantalla, llamamos a este método
        for(int i=0;i<length;i++){
            canvas.drawBitmap(arrPartesSer.get(i).getBm(),arrPartesSer.get(i).getX(),arrPartesSer.get(i).getY(),null);
        }
    }

    //getter setter

    public Bitmap getBm() {
        return bm;
    }

    public void setBm(Bitmap bm) {
        this.bm = bm;
    }

    public Bitmap getBm_cabeza_arriba() {
        return bm_cabeza_arriba;
    }

    public void setBm_cabeza_arriba(Bitmap bm_cabeza_arriba) {
        this.bm_cabeza_arriba = bm_cabeza_arriba;
    }

    public Bitmap getBm_cabeza_abajo() {
        return bm_cabeza_abajo;
    }

    public void setBm_cabeza_abajo(Bitmap bm_cabeza_abajo) {
        this.bm_cabeza_abajo = bm_cabeza_abajo;
    }

    public Bitmap getBm_cabeza_iz() {
        return bm_cabeza_iz;
    }

    public void setBm_cabeza_iz(Bitmap bm_cabeza_iz) {
        this.bm_cabeza_iz = bm_cabeza_iz;
    }

    public Bitmap getBm_cabez_der() {
        return bm_cabez_der;
    }

    public void setBm_cabez_der(Bitmap bm_cabez_der) {
        this.bm_cabez_der = bm_cabez_der;
    }

    public Bitmap getBm_cuerpo_vertical() {
        return bm_cuerpo_vertical;
    }

    public void setBm_cuerpo_vertical(Bitmap bm_cuerpo_vertical) {
        this.bm_cuerpo_vertical = bm_cuerpo_vertical;
    }

    public Bitmap getBm_cuerpo_horizontal() {
        return bm_cuerpo_horizontal;
    }

    public void setBm_cuerpo_horizontal(Bitmap bm_cuerpo_horizontal) {
        this.bm_cuerpo_horizontal = bm_cuerpo_horizontal;
    }

    public Bitmap getBm_cuerpo_ar_de() {
        return bm_cuerpo_ar_de;
    }

    public void setBm_cuerpo_ar_de(Bitmap bm_cuerpo_ar_de) {
        this.bm_cuerpo_ar_de = bm_cuerpo_ar_de;
    }

    public Bitmap getBm_cuerpo_ar_iz() {
        return bm_cuerpo_ar_iz;
    }

    public void setBm_cuerpo_ar_iz(Bitmap bm_cuerpo_ar_iz) {
        this.bm_cuerpo_ar_iz = bm_cuerpo_ar_iz;
    }

    public Bitmap getBm_cuerpo_abajo_der() {
        return bm_cuerpo_abajo_der;
    }

    public void setBm_cuerpo_abajo_der(Bitmap bm_cuerpo_abajo_der) {
        this.bm_cuerpo_abajo_der = bm_cuerpo_abajo_der;
    }

    public Bitmap getBm_cuerpo_abajo_iz() {
        return bm_cuerpo_abajo_iz;
    }

    public void setBm_cuerpo_abajo_iz(Bitmap bm_cuerpo_abajo_iz) {
        this.bm_cuerpo_abajo_iz = bm_cuerpo_abajo_iz;
    }

    public Bitmap getBm_cola_der() {
        return bm_cola_der;
    }

    public void setBm_cola_der(Bitmap bm_cola_der) {
        this.bm_cola_der = bm_cola_der;
    }

    public Bitmap getBm_cola_iz() {
        return bm_cola_iz;
    }

    public void setBm_cola_iz(Bitmap bm_cola_iz) {
        this.bm_cola_iz = bm_cola_iz;
    }

    public Bitmap getBm_cola_ar() {
        return bm_cola_ar;
    }

    public void setBm_cola_ar(Bitmap bm_cola_ar) {
        this.bm_cola_ar = bm_cola_ar;
    }

    public Bitmap getBm_cola_abajo() {
        return bm_cola_abajo;
    }

    public void setBm_cola_abajo(Bitmap bm_cola_abajo) {
        this.bm_cola_abajo = bm_cola_abajo;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ArrayList<PartesSerpiente> getArrPartesSer() {
        return arrPartesSer;
    }

    public void setArrPartesSer(ArrayList<PartesSerpiente> arrPartesSer) {
        this.arrPartesSer = arrPartesSer;
    }
}
