package com.codedifferently.labs.partB;
import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Dog;
import partB.storage.AnimalWarehouse;

import java.util.Date;

public class DogHouseTest {
    private static AnimalWarehouse<Dog> dogHouse = new AnimalWarehouse<>();

    public static void add(Dog dog) {
        int perviousNum = getNumberOfDogs();
        dogHouse.add(dog);
        Assertions.assertEquals(dogHouse.getNumberOfAnimals(), perviousNum + 1);
    }

    public static void remove(Integer id) {
        int perviousNum = getNumberOfDogs();
        dogHouse.removeAnimalById(id);
        Assertions.assertEquals(dogHouse.getNumberOfAnimals(), perviousNum - 1);
    }

    public static void remove(Dog dog) {
        int perviousNum = getNumberOfDogs();
        dogHouse.removeAnimal(dog);
        Assertions.assertEquals(dogHouse.getNumberOfAnimals(), perviousNum - 1);
    }

    public static Dog getDogById(Integer id) {
        Assertions.assertTrue(dogHouse.getAnimalById(id) != null);
        return dogHouse.getAnimalById(id);
    }

    public static Integer getNumberOfDogs() {
        return dogHouse.getNumberOfAnimals();
    }

    public static void clear() {
        dogHouse.clear();
    }
}
