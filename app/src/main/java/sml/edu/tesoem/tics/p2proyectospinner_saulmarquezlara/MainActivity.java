package sml.edu.tesoem.tics.p2proyectospinner_saulmarquezlara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addcolor(View view) {
        Intent addcolor = new Intent(this, AgregarColores.class);
        startActivity(addcolor);

    }
}
