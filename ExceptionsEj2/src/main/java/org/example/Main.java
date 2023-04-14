package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente1= new Cliente("Julieta", 3000, 5000,6000);
        cliente1.Depositar(500);
        cliente1.Extraer(600);
        cliente1.Imprimir("Luis",600);

        try {
            cliente1.Extraer(500);
        }catch (Exception ex){
            System.out.println(ex.getMessage());

        }

    }
}