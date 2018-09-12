package com.firstapp.aluno.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityContato extends AppCompatActivity {
    private ImageView botaoVoltarContato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        botaoVoltarContato = findViewById(R.id.imageViewVoltarContato);

        botaoVoltarContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityContato.this, MainActivity.class));
            }
        });
    }
}
