package sml.edu.tesoem.tics.p2proyectospinner_saulmarquezlara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaDeColores extends AppCompatActivity {

    ArrayList<vg> coloresList;
    Button menu;
    Spinner spinner;
    ArrayAdapter<String> colorin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_colores);

        menu = (Button) findViewById(R.id.menu);
        spinner = findViewById(R.id.spinner);
        colorin = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, vg.loscollors());
        coloresList = new ArrayList<vg>();

        spinner.setAdapter(colorin);

    }



    public void menu(View view) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
    public void addcolor(View view) {
        Intent addcolor = new Intent(this, AgregarColores.class);
        startActivity(addcolor);

    }
}
