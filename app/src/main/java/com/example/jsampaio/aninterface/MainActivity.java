package com.example.jsampaio.aninterface;

import android.content.Intent;
import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //private Button mbtnLocalAtual;
    private Button mbtnComecar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MultiDex.install(this);
        setContentView(R.layout.activity_main);

        //Comentado pois foi retirado da interface
        //mbtnLocalAtual = (Button) findViewById(R.id.btnLocalAtual);
        mbtnComecar = (Button) findViewById(R.id.btnComecar);

        mbtnComecar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startCorridaLivre(v);
            }

        });
        /*mbtnLocalAtual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                startSecondActivity(v);
            }

        });*/

    }


    public void startSecondActivity(View view) {

        Intent secondActivity = new Intent(this, AtualizaLocalizacaoActivity.class);
         startActivity(secondActivity);
    }

    public void startCorridaLivre(View view) {

        Intent secondActivity = new Intent(this, corridaLivreActivity.class);
        startActivity(secondActivity);
    }


}


