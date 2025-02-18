package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Cat;
import partB.animals.Dog;
import partB.storage.CatHouse;
import partB.storage.DogHouse;

import java.util.Date;

public class AnimalFactoryTest {


    public static Dog createDog(String name, Date birthDate) {
        Dog newDog = new Dog(name, birthDate, 1);

        Assertions.assertEquals(newDog.getName(), name);
        Assertions.assertEquals(newDog.getBirthDate(), birthDate);

        return newDog;
    }

    public static Cat createCat(String name, Date birthDate) {
        Cat newCat = new Cat(name, birthDate, 1);

        Assertions.assertEquals(newCat.getName(), name);
        Assertions.assertEquals(newCat.getBirthDate(), birthDate);

        return newCat;
    }
}
