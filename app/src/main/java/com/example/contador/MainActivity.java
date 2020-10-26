package com.example.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

//public class MainActivity extends AppCompatActivity {
//Modifico la línea para que la clase herede directamente de Activity, no veo bien cuál es la diferencia en hacer esto
public class MainActivity extends Activity {

    public int contador;

    TextView textoResultado;


    //Método que se incia al arrancar la aplicación (Un único onCreate por aplicación?)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoResultado = (TextView)findViewById(R.id.contadorTexto);

        contador = 0;
    }

    public void incrementaContador(View vista){

        contador++;

        textoResultado.setText("" + contador);

    }

    public void restaContador(View vista){

        contador--;

        if(contador < 0){
            CheckBox negativos = (CheckBox)findViewById(R.id.negativos);

            if(!negativos.isChecked())
                contador = 0;
        }

        textoResultado.setText("" + contador);

    }

    public void reseteaContador(View vista){

        EditText numero_reset = (EditText)findViewById(R.id.n_reseteo);

        contador = Integer.parseInt(numero_reset.getText().toString());

        numero_reset.setText("");
        textoResultado.setText("" + contador);
    }
}