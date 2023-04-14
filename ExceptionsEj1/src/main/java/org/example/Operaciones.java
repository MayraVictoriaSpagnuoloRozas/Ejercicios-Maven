package org.example;

public class Operaciones {

    private int valor1;
    private int valor2;



    public Operaciones(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;

    }


    public void Suma (){
        int Suma= valor1 + valor2;
        System.out.println("El resultado de la suma es: " + Suma);
    }

    public void Resta (){
        int Resta= valor1 - valor2;
        System.out.println("El resultado de la resta es: " + Resta);
    }
    public void Multiplicacion (){
        int Multiplicacion= valor1 * valor2;
        System.out.println("El resultado de la multiplicación es: " + Multiplicacion);
    }
    public void Division () throws Exception{
        if (valor2==0)
            throw new Exception("El valor debe ser mayor a 0");
        int Division= valor1 / valor2;
        System.out.println("El resultado de la división es: " + Division);

    }
}
