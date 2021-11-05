package Pruebas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

    Hola hola = new Hola("enero");

        System.out.println(hola);

    }

}

class Hola{
    String mes;
    public Hola(String mes){
        this.mes = mes;
    }
}
