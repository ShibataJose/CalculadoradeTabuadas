package com.example.calculadoradetabuadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);

    }

    public void botaoAplicar(View view) {

        if(verificaCampo()){

            String nome = editNome.getText().toString();

            Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

            intent.putExtra("nome", nome);

            startActivity(intent);

        }

    }

    public boolean verificaCampo(){

        boolean retorno;

        if(!TextUtils.isEmpty(editNome.getText().toString())){
            retorno = true;
        }else{
            editNome.setError("*");
            retorno = false;
        }

        return retorno;

    }

}
