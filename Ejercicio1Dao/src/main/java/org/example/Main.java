package org.example;

import servicio.AnimalServicio;

public class Main {
    public static void main(String[] args) {
        AnimalServicio animalServicio = new AnimalServicio();

        try {
            animalServicio.printAnimals();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    }
