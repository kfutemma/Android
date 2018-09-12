package com.firstapp.aluno.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView botaoCursos;
    private ImageView botaoInstitucional;
    private ImageView botaoLocalizacao;
    private ImageView botaoContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoCursos = findViewById(R.id.imageViewCursos);
        botaoInstitucional = findViewById(R.id.imageViewInstitucional);
        botaoLocalizacao = findViewById(R.id.imageViewLocalizacao);
        botaoContato = findViewById(R.id.imageViewContato);

        botaoCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, ActivityCursos.class));
            }
        });

        botaoInstitucional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityInstitucional.class));
            }
        });

        botaoLocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityLocalizacao.class));
            }
        });

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityContato.class));
            }
        });
    }
}
