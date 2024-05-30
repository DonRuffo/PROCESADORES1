package org.example;

import Procesadores.Procesadores_AMD;
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


        //Isaac por favor crear 2 intancias de AMD con valores
        Procesadores_AMD proc_7 = new Procesadores_AMD(5,"Socket101","Razer707",4,200,2.00,false );
        Procesadores_AMD proc_8 = new Procesadores_AMD(3,"Socket001","Razer700",6,250,200,true);

    }
}