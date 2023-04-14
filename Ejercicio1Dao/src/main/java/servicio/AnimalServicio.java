package servicio;

import entidades.Animal;
import persistencia.AnimalDao;

import java.util.List;

public class AnimalServicio {
    private final AnimalDao animalDao;

    public AnimalServicio() {
        animalDao = new AnimalDao();
    }


    public void printAnimals() throws Exception {
        try {
            List<Animal> animals = animalDao.getAnimals();
                if (animals.isEmpty()){
                    throw  new Exception("No existen registros");
                }else {
                System.out.println("LIST ANIMALS");
                System.out.printf("%-10s%-15s%-15s%-20s\n","ID","NOMBRE","RAZA",
                        "AÑOS");
                for (Animal animal : animals) {
                    System.out.printf("%-10s%-15s%-15s%-20s\n",
                            animal.getNombre(), animal.getRaza(), animal.getAños(),animal.getAnimalId());
                }
                }

        } catch (Exception e) {
            throw e;
        }
    }
}


