package sml.edu.tesoem.tics.p2proyectospinner_saulmarquezlara;

import java.util.ArrayList;

public class vg {
    public static ArrayList<String> colores = new ArrayList<String>();


    public  static  void ingresa(String coloritos){
        colores.add(coloritos);
    }

    public static ArrayList<String> loscollors(){
        return colores;
    }
}
