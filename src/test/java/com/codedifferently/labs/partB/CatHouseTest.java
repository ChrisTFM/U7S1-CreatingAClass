package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Cat;
import partB.storage.CatHouse;
import partB.storage.AnimalWarehouse;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions.*;

public class CatHouseTest {
    private static AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();

    public static void add(Cat cat) {
        int perviousNum = getNumberOfCats();
        catHouse.add(cat);
        Assertions.assertEquals(catHouse.getNumberOfAnimals(), perviousNum + 1);
    }

    public static void remove(Integer id) {
        int perviousNum = getNumberOfCats();
        catHouse.removeAnimalById(id);
        Assertions.assertEquals(catHouse.getNumberOfAnimals(), perviousNum - 1);
    }

    public static void remove(Cat cat) {
        int perviousNum = getNumberOfCats();
        catHouse.removeAnimal(cat);
        Assertions.assertEquals(catHouse.getNumberOfAnimals(), perviousNum - 1);
    }
    public static Cat getCatById(Integer id) {
        Assertions.assertTrue(catHouse.getAnimalById(id) != null);
        return catHouse.getAnimalById(id);
    }

    public static Integer getNumberOfCats() {
        return catHouse.getNumberOfAnimals();
    }

    public static void clear() {
        catHouse.clear();
    }
}
