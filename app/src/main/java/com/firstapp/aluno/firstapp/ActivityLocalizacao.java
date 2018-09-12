package com.firstapp.aluno.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityLocalizacao extends AppCompatActivity {
    private ImageView botaoVoltarLocalizacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);

        botaoVoltarLocalizacao = findViewById(R.id.imageViewVoltarLocalizacao);

        botaoVoltarLocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityLocalizacao.this, MainActivity.class));
            }
        });
    }
}
