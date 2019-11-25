package sml.edu.tesoem.tics.p2proyectospinner_saulmarquezlara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AgregarColores extends AppCompatActivity {

    EditText ingcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_colores);
        ingcolor = (EditText) findViewById(R.id.ingcolor);
    }
    public void ingresa(View v) {
        String ingres = ingcolor.getText().toString();


        if (ingcolor.length()<1) {
            Toast.makeText(this, "Escriba algo", Toast.LENGTH_LONG).show();
        } else {
            vg.ingresa(ingcolor.getText().toString());
            ingcolor.setText("");
            Toast.makeText(getApplicationContext(), "Se registro con exito  " + ingres, Toast.LENGTH_LONG).show();


        }
    }
    public void Mostrarscreen(View view) {
        Intent Mostrarscreen = new Intent(this, ListaDeColores.class);
        startActivity(Mostrarscreen);

    }

    public void menuprincipal(View view) {
        Intent menuprincipal = new Intent(this, MainActivity.class);
        startActivity(menuprincipal);

    }
}
