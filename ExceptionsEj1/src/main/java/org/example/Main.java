package org.example;

public class Main {
    public static void main(String[] args) throws Exception {

        Operaciones operacion1= new Operaciones(3,1);
        operacion1.Suma();
        operacion1.Resta();
        operacion1.Multiplicacion();
        operacion1.Division();

        try {

            operacion1.Division();

        }catch (Exception ex){
            System.out.println(ex);

        }


    }
}