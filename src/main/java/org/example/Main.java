package org.example;

import Procesadores.Procesadores_AMD;
import Procesadores.Procesadores_Intel;
import Procesadores.Procesadores_moviles;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Integrante1
        Procesadores_AMD proc_1 = new Procesadores_AMD();
        Procesadores_AMD proc_2 = new Procesadores_AMD();
        //Integrante2
        Procesadores_moviles proc_3 = new Procesadores_moviles();
        Procesadores_moviles proc_4 = new Procesadores_moviles();

        //Dennis por favor crear 2 instancias de intel con valores

        Procesadores_Intel proc_5 = new Procesadores_Intel(true,7,"Socket FM2",);
        Procesadores_Intel proc_6 = new Procesadores_Intel();

        //Isaac por favor crear 2 intasncias de AMD con valores
        Procesadores_AMD proc_7 = new Procesadores_AMD(5,"Socket101","Razer707",4,200,2.00,false );
        Procesadores_AMD proc_8 = new Procesadores_AMD(3,"Socket001","Razer700",6,250,200,true);

        //Grupo1

        //Michelle Suarez instancias
        Procesadores_Intel proc_10 = new Procesadores_Intel(true,9,"Socket 478","Core generacion 9",4,2,2.43);
        Procesadores_Intel proc_11 = new Procesadores_Intel(true,9,"Socket 478","Core generacion 9",4,2,2.43);




        //Grupo2

        //Moran Mateo.
        Procesadores_Intel proc_7 = new Procesadores_Intel(true,7,"Socket LGA 1700","Intel i7 11700",8,65,2.5);
        Procesadores_moviles movil1 = new Procesadores_moviles(true, "Xiaomi Redmi Note 12",4,65,4.5);
        Procesadores_AMD proc_8 = new Procesadores_AMD(3,"AM4","Ryzen 3 3200G",4,45,3.5,false);




        //Grupo3
        //Isaac Quinapallo Integrante 2, Grupo3
        Procesadores_AMD proc_20 = new Procesadores_AMD(5,"Socket101","Razer707",4,300,5.00,false);
        Procesadores_AMD proc_21 = new Procesadores_AMD(5,"Socket401","Razer700",8,500,5.00,false);
        Procesadores_AMD proc_22 = new Procesadores_AMD(7,"Socket501","Razer701",12,100,5.00,true);

    }
}