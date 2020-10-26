package com.example.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//public class MainActivity extends AppCompatActivity {
//Modifico la línea para que la clase herede directamente de Activity, no veo bien cuál es la diferencia en hacer esto
public class MainActivity extends Activity {

    public int contador;


    //Método que se incia al arrancar la aplicación (Un único onCreate por aplicación?)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
    }

    public void incrementaContador(View vista){

        contador++;

        mostrarResultado();
    }

    public void restaContador(View vista){

        contador--;

        mostrarResultado();
    }

    public void reseteaContador(View vista){

        contador = 0;

        mostrarResultado();
    }

    public void mostrarResultado(){

        //Creo una variable de la clase TextView donde almacenar el elemento Button dónde quiero cargar un texto resultado

        TextView textoResultado = (TextView)findViewById(R.id.contadorTexto);

        textoResultado.setText("" + contador);
    }
}