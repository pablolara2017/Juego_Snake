package com.example.snake;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class PartesSerpiente {
    //clase con una parte del cuerpo de la serpiente
    private Bitmap bm; //representar una imagen del cuerpo
    private int x, y; //coordenadas
    private Rect rBody, rTop, rBottom, rLeft, rRight; //variables tipo rectangulo para colisiones en cada direcion

    public PartesSerpiente(Bitmap bm,int x, int y) { //constructor
        this.x = x;
        this.bm = bm;
        this.y = y;
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

    public Rect getrBody() { //getter de colisiones, devuelve el cuadradoi principal con tamaño del mapa
        return new Rect(this.x, this.y, this.x+VistaJuego.tamañoMapa, this.y+VistaJuego.tamañoMapa);
    }

    public void setrBody(Rect rBody) {
        this.rBody = rBody;
    }

    //formulapara adaptar un valor a la resolucion de pantalla: 10*screenHeight/1920
    public Rect getrTop() {  //rectangulo encima del cuerpo, para saber si algo choca arriba
        return new Rect(this.x, this.y-10*Constantes.screenHeight/1920, this.x+VistaJuego.tamañoMapa, this.y);
    }

    public void setrTop(Rect rTop) {
        this.rTop = rTop;
    }

    public Rect getrBottom() { //rectangulo debajo del cuerpo, colisiones por abajo
        return new Rect(this.x, this.y+VistaJuego.tamañoMapa, this.x+VistaJuego.tamañoMapa, this.y+VistaJuego.tamañoMapa+10*Constantes.screenHeight/1920);
    }

    public void setrBottom(Rect rBottom) {
        this.rBottom = rBottom;
    }

    public Rect getrRight() {  //choques derecha
        return new Rect(this.x+VistaJuego.tamañoMapa, this.y, this.x+VistaJuego.tamañoMapa+10*Constantes.screenWidt/1080, this.y+VistaJuego.tamañoMapa);
    }

    public void setrRight(Rect rRight) {
        this.rRight = rRight;
    }

    public Rect getrLeft() { //choques izq
        return new Rect(this.x-10*Constantes.screenWidt/1080, this.y, this.x, this.y+VistaJuego.tamañoMapa);
    }

    public void setrLeft(Rect rLeft) {
        this.rLeft = rLeft;
    }


}
