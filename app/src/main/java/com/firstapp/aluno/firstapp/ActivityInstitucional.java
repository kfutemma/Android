package com.firstapp.aluno.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityInstitucional extends AppCompatActivity {
    private ImageView botaoVoltarInstitucional;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institucional);

        botaoVoltarInstitucional = findViewById(R.id.imageViewVoltarInstitucional);

        botaoVoltarInstitucional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityInstitucional.this, MainActivity.class));
            }
        });
    }
}
