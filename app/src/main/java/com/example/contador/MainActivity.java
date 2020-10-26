package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

//public class MainActivity extends AppCompatActivity {
//Modifico la línea para que la clase herede directamente de Activity, no veo bien cuál es la diferencia en hacer esto
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}