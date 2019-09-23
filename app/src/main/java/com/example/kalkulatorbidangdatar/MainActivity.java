package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    Button hitungpersegi;
    Button hitungsegitiga;
    Button hitunglingkaran;

    TextView hasil1 ;
    TextView hasil2;
    TextView hasil3;;


    EditText alas;
    EditText tinggi;
    EditText sisi;
    EditText jarijari;

    double alas1, tinggi1, sisi1, jarijari1, hasil4, hasil5, hasil6;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Persegi

        hitungpersegi= (Button)findViewById(R.id.hitungpersegi);
        sisi = (EditText)findViewById(R.id.sisi);
        hasil1 = (TextView)findViewById(R.id.hasilpersegi);

        //Segitiga

        hitungsegitiga = (Button)findViewById(R.id.hitungsegitiga);
        alas = (EditText)findViewById(R.id.alassegitiga);
        tinggi = (EditText)findViewById(R.id.tinggisegitiga);
        hasil2 = (TextView)findViewById(R.id.hasilsegitiga);

        //Lingkaran

        hitunglingkaran = (Button)findViewById(R.id.hitunglingkaran);
        jarijari = (EditText)findViewById(R.id.jarijarilingkaran);
        hasil3 = (TextView)findViewById(R.id.hasillingkaran);



    }
    public void hitungpersegi(View V){
        sisi1 = Double.parseDouble(sisi.getText().toString());
        hasil4 = (sisi1 * sisi1);
        hasil1.setText("Hasil Persegi="+hasil4);

    }
    public void hitungsegitiga(View V){
        alas1 = Double.parseDouble((alas.getText().toString()));
        hasil5 = (alas1 * tinggi1);
        hasil2.setText("Hasil Segitiga"+hasil5);
    }
    public void hitunglingkaran(View V){
        jarijari1 = Double.parseDouble(jarijari.getText().toString());
        hasil6 = (2 * Math.PI * jarijari1);
        hasil3.setText("Hasil Lingkaran"+hasil6);
    }


}
