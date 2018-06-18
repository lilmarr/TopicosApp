package com.example.aluno.topicosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    private EditText editTextVa;
    private EditText editTextCot;
    private Button buttonCal;
    private TextView textViewResultado;
    private String finalizado;
    private Double valor;
    private Double cotação;
    private Double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        editTextVa = (EditText) findViewById(R.id.editTextVa);
        editTextCot = (EditText) findViewById(R.id.editTextCot);
        textViewResultado = (TextView) findViewById(R.id.textViewResultado);
        buttonCal = (Button) findViewById(R.id.buttonCal);


        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                valor = Double.parseDouble(editTextVa.getText().toString());
                cotação = Double.parseDouble(editTextCot.getText().toString());
                textViewResultado = (TextView) findViewById(R.id.textViewResultado);
                buttonCal = (Button) findViewById(R.id.buttonCal);


                buttonCal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        valor = Double.parseDouble(editTextVa.getText().toString());
                        cotação = Double.parseDouble(editTextCot.getText().toString());

                        resultado = (valor * cotação);

                        finalizado = Double.toString(resultado);

                        textViewResultado.setText(finalizado);


                    }


                });
            }

        });
    }
}
