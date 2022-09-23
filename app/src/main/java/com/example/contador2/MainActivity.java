package com.example.contador2;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.contador2.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador = 0;


    }

    public void incrementaContador(View vista){

        contador++;
        mostrarResultados();

    }

    public void restaContador(View vista){

        contador--;
        mostrarResultados();

    }

    public void reseteaContador(View vista){


        contador = 0;
        mostrarResultados();

    }

    public void mostrarResultados(){

        TextView textoResultado = (TextView) findViewById(R.id.contadorPulsaciones);
        textoResultado.setText("Contador: " + contador);

    }
}