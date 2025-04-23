package com.example.snake;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //PANTALLA COMPLETA
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        DisplayMetrics dm=new DisplayMetrics(); //informacion sobre la pantalla
        this.getWindowManager().getDefaultDisplay().getMetrics(dm); //info pantalla actual
        //guardamos ancho y alto de la pantallla
        Constantes.screenWidt=dm.widthPixels;
        Constantes.screenHeight=dm.heightPixels;
        setContentView(R.layout.activity_main);


    }
}