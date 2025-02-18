package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Dog;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

public class DogTest {
    Dog newDog = new Dog("Nan", null, 1);

    public void setName(String name) {
        newDog.setName(name);
        Assertions.assertEquals(newDog.getName(), name);
    }
    public void setBirthDate(Date birthDate) {
        newDog.setBirthDate(birthDate);
        Assertions.assertEquals(newDog.getBirthDate(), birthDate);
    }
    public void testSpeak(String speak){
        Assertions.assertEquals(newDog.speak(), speak);
    }
    public void testID(int id){
        Assertions.assertEquals(newDog.getId(), id);
    }
    public void testEat(Food food){
        int previousMeals = newDog.getNumberOfMealsEaten();
        newDog.eat(food);
        Assertions.assertEquals(newDog.getNumberOfMealsEaten(), previousMeals + 1);
    }
    public void testInheritance(){
        Assertions.assertTrue(newDog instanceof Animal, "Dog should be an instance of Animal");
        Assertions.assertTrue(newDog instanceof Mammal, "Dog should be an instance of Mammal");
    }
}
