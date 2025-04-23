package com.example.snake;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class VistaJuego extends View {
    private Bitmap bmCesped1,bmCesped2; //almacenaran imagenes del cesped
    private int h=25,w=12;
    private ArrayList<Cesped>arrCesped=new ArrayList<>();
    public static int tamañoMapa=75*Constantes.screenWidt/1080; //calculo tamaño de las celdas en funcion el ancho
    public VistaJuego(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bmCesped1= BitmapFactory.decodeResource(this.getResources(),R.drawable.grass); //cargamos imagenes
        bmCesped1=Bitmap.createScaledBitmap(bmCesped1,tamañoMapa,tamañoMapa,true);
        bmCesped2= BitmapFactory.decodeResource(this.getResources(),R.drawable.grass03);
        bmCesped2=Bitmap.createScaledBitmap(bmCesped2,tamañoMapa,tamañoMapa,true);
        //generamos el mapa alternando celdas entre cesped1 y 2, formato tablero de ajedez
        for(int i=0;i<h;i++){
            for(int j=0; j<w;j++){
                if((i+j)%2==0){
                    arrCesped.add(new Cesped(bmCesped1,j*tamañoMapa+Constantes.screenWidt/2-(w/2)*tamañoMapa,
                            i*tamañoMapa+100*Constantes.screenHeight/1920,tamañoMapa,tamañoMapa));
                }else{
                    arrCesped.add(new Cesped(bmCesped2,j*tamañoMapa+Constantes.screenWidt/2-(w/2)*tamañoMapa,
                            i*tamañoMapa+100*Constantes.screenHeight/1920,tamañoMapa,tamañoMapa));
                }
            }
        }
    }

    @Override
    public void draw(@NonNull Canvas canvas) { //dibujamos fondo verde oscuro
        super.draw(canvas);
        canvas.drawColor(0xFF1A6100);
        for (int i=0;i<arrCesped.size();i++){
            canvas.drawBitmap(arrCesped.get(i).getBm(),arrCesped.get(i).getX(),arrCesped.get(i).getY(),null);
        }
    }
}
