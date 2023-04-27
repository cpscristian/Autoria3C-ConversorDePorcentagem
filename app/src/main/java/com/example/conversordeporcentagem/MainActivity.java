package com.example.conversordeporcentagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numeroPorCento, numero;
    TextView resultado;
    Button botaoConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        numeroPorCento = findViewById(R.id.numeroPorCento);
        numero = findViewById(R.id.numero);
        resultado = findViewById(R.id.resultado);
        botaoConverter = findViewById(R.id.botaoConverter);
    }
    public void botaoConverter(View V) {
        double porCento = Double.parseDouble(numeroPorCento.getText().toString());
        double num = Double.parseDouble(numero.getText().toString());
        double calculo = porCento * (num / 100);
        
        resultado.setText(calculo + "");
    }
}