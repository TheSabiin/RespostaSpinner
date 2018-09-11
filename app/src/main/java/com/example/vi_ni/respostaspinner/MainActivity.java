package com.example.vi_ni.respostaspinner;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Spinner spnResposta;
    private TextView txtResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnResposta = findViewById(R.id.spnResposta);
        txtResposta = findViewById(R.id.txtResposta);
    }

    public void responder(View view){

        if(spnResposta.getSelectedItem().toString().equals("Maça")) {
            txtResposta.setText("Resposta Correta");
            txtResposta.setTextColor(Color.BLACK);

        }else {
            txtResposta.setText("Resposta errada");
            txtResposta.setTextColor(Color.RED);
        }
    }
}
