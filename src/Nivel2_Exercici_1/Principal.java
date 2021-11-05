package Nivel2_Exercici_1;
/*
Creu una classe amb dos mètodes, 'f()' i 'g()'. *
En 'g()', generi una excepció d'un nou tipus.
En 'f()' invoqui a 'g()', capturi la seva excepció i, en la clàusula catch, generi una excepció diferent (d'un segon tipus, també nou).
Comprovi el codi en 'main()'.
 */
public class Principal {
    public static void main(String[] args)throws ExcepPersonalizada{
        g();
    }


    public static void f()throws ExcepPersonalizada{
        try {
            g();
        }catch (Exception e){
            e.getMessage();
            System.out.println("Esto es otra excepción personalizada");
        }
    }

    public static void g()throws ExcepPersonalizada{
        throw new ExcepPersonalizada("Esto es una excepción personalizada");

    }
}

class ExcepPersonalizada extends Exception{
    public ExcepPersonalizada(String mensaje){
        super(mensaje);
    }
}