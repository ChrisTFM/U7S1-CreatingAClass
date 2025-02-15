package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Cat;
import partB.animals.Mammal;
import org.junit.jupiter.api.Assertions.*;
import partB.food.Food;

import java.util.Date;

public class CatTest {
    Cat newCat = new Cat("Nan", null, 1);

    public void setName(String name) {
        newCat.setName(name);
        Assertions.assertEquals(newCat.getName(), name);
    }
    public void setBirthDate(Date birthDate) {
        newCat.setBirthDate(birthDate);
        Assertions.assertEquals(newCat.getBirthDate(), birthDate);
    }
    public void testSpeak(String speak){
        Assertions.assertEquals(newCat.speak(), speak);
    }
    public void testID(int id){
        Assertions.assertEquals(newCat.getId(), id);
    }
    public void testEat(Food food){
        int previousMeals = newCat.getNumberOfMealsEaten();
        newCat.eat(food);
        Assertions.assertEquals(newCat.getNumberOfMealsEaten(), previousMeals + 1);
    }
    public void testInheritance(){
        Assertions.assertTrue(newCat instanceof Animal, "Cat should be an instance of Animal");
        Assertions.assertTrue(newCat instanceof Mammal, "Cat should be an instance of Mammal");
    }
}
