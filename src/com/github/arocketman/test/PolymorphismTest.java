package com.github.arocketman.test;

import com.github.arocketman.corejava.Polymorphism;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andreuccio on 26/01/2017.
 */
public class PolymorphismTest {

    @Test
    public void getDescriptionTest(){
        //The variables belong to the class Person
        Polymorphism.Person p1 , p2;
        //The istances are of different objects but both inherit from the Person's class . (Upcasting)
        p1 = new Polymorphism().new Employee("An","Employee",1000);
        p2 = new Polymorphism().new Customer("A","Customer","Simple");
        //We call the same method on both persons, but at runtime the method belonging to the instanciated class will be executed.
        assertEquals("Name: An , Surname : Employee , salary : 1000",p1.getDescription());
        assertEquals("Name: A , Surname : Customer , salary : Simple",p2.getDescription());
    }

}
