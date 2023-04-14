package entidades;

public class Animal {
    private Integer animalId;
    private String nombre;
    private String raza;
    private int años;

    public Animal(){

    }

    public Animal(Integer animalId, String nombre, String raza, int años) {
        this.animalId = animalId;
        this.nombre = nombre;
        this.raza = raza;
        this.años = años;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    @Override
    public String toString() {
        return String.format("ANIMAL(nombre: %s, raza: %s, años: %s)",
        animalId, nombre, raza, años);
    }
}
