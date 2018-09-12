package com.firstapp.aluno.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityCursos extends AppCompatActivity {
    private ImageView botaoVoltarCursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        botaoVoltarCursos = findViewById(R.id.imageViewVoltarCursos);

        botaoVoltarCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityCursos.this, MainActivity.class));
            }
        });
    }
}
