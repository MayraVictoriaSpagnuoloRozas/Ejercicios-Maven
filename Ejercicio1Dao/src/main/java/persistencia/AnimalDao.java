package persistencia;

import entidades.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalDao extends Dao {
    public List<Animal> getAnimals() throws Exception {
        try {
            String sql = "SELECT * FROM registros;";

            queryDatabase(sql);

            List<Animal> animales = new ArrayList<>();
            Animal animal;

            while (resultSet.next()) {
                animal = new Animal();
                animal.setAnimalId (resultSet.getInt(1));
                animal.setNombre(resultSet.getString(2));
                animal.setRaza(resultSet.getString(3));
                animal.setAños(resultSet.getInt(4));

                animales.add(animal);
            }

            return animales;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener animales");
        } finally {
            disconnectDatabase();
        }
    }
}
