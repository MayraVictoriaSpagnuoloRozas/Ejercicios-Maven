package org.example;

public class Cliente {

    private String nombre;
    private int monto;

    public Cliente(String nombre, int monto, int saldo, int total) {
        this.nombre = nombre;
        this.monto = monto;
    }
    public Cliente(){

    }

    public void Depositar(int monto){
        int total=0;
        int saldo= total+monto;
        System.out.println(total);
    }

    public void Extraer (int monto) throws Exception{
        int saldo=0;
       int total= saldo-monto;
        if (saldo> monto)
            throw new Exception("No cuenta con saldo suficiente");
    }
    public void Imprimir (String nombre, int monto){
        System.out.println(nombre + monto);
    }

}
