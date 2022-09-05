package com.example.calculadoradetabuadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

public class SegundaActivity extends AppCompatActivity {

    TextView textNome, textResult;
    TextInputEditText editValor;
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textResult = findViewById(R.id.textResult);
        editValor = findViewById(R.id.valor);

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");

        textNome.setText("Olá, " + nome);
    }

    public void botaoAplicar(View view){

    if(verificaCampo()){

    numero = Integer.valueOf(editValor.getText().toString());
    StringBuffer buffer = new StringBuffer();

        for (int i = 0; i<11; i++){

            buffer.append(numero + " X " + i + " = " + numero*i+"\n");
            System.out.println(numero + " X " + i + " = " + numero*i);
    }
        textResult.setText(buffer);
        }

    }

    public boolean verificaCampo(){

        boolean retorno;

        if(!TextUtils.isEmpty(editValor.getText().toString())){
            retorno = true;
        }else{
            editValor.setError("*");
            retorno = false;
        }

        return retorno;

    }

}
