package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            PersonaAdulta persona1= new PersonaAdulta("Jano", 15);
            persona1.imprimir();
            persona1.fijarEdad(15);

            PersonaAdulta persona2 = new PersonaAdulta("Libertad", 5);
            persona2.imprimir();
            persona2.fijarEdad(5);

            PersonaAdulta persona3 = new PersonaAdulta("Mayra", 39);
            persona3.imprimir();
            persona3.fijarEdad(39);
        }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    } finally {
            System.out.println("Fin del proceso del programa");
        }
}
}