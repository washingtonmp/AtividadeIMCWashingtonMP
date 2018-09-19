package com.example.exercicioimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtPeso, edtAltura;
    private Button btnCalcular;
    private float imc, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPeso= findViewById(R.id.edtPesoId);
        edtAltura= findViewById(R.id.edtAlturaId);
        btnCalcular= findViewById(R.id.btnCalcularId);
    }

    public void calcularIMC(View view){


        if(!edtPeso.getText().toString().isEmpty()){
            if(!edtAltura.getText().toString().isEmpty()){

                peso= Float.parseFloat(edtPeso.getText().toString());
                altura= Float.parseFloat(edtAltura.getText().toString());

                imc= peso/(altura*altura);



               if(imc<17.00){

                    Toast.makeText(getApplicationContext(), "Muito abaixo do peso", Toast.LENGTH_LONG).show();

                }else if((imc>=17.00)&&(imc<18.49)){

                    Toast.makeText(getApplicationContext(), "Abaixo do peso", Toast.LENGTH_LONG).show();

                }else if((imc>=18.50)&&(imc<24.99)){

                    Toast.makeText(getApplicationContext(), "Peso normal", Toast.LENGTH_LONG).show();

                }else if((imc>=25.00)&&(imc<29.99)){

                    Toast.makeText(getApplicationContext(), "Acima do peso", Toast.LENGTH_LONG).show();

                }else if((imc>=30.00)&&(imc<34.99)){

                    Toast.makeText(getApplicationContext(), "Obesidade I", Toast.LENGTH_LONG).show();

                }else if((imc>=35.00)&&(imc<39.99)){

                    Toast.makeText(getApplicationContext(), "Obesidade II (Severa)", Toast.LENGTH_LONG).show();

                }else if(imc>40.00){

                    Toast.makeText(getApplicationContext(), "Obesidade III (Mórbida)", Toast.LENGTH_LONG).show();

                }




            }else {
                Toast.makeText(getApplicationContext(), "Campo de preenchimento obrigatório", Toast.LENGTH_LONG).show();
                edtAltura.requestFocus();
            }

        }else{
            Toast.makeText(getApplicationContext(), "Campo de preenchimento obrigatório", Toast.LENGTH_LONG).show();
            edtPeso.requestFocus();
        }
    }
}
