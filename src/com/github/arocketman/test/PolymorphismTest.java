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

    @Test
    public void polymorphicArray(){
        //Declaring an array with a given length. This length cannot be changed.
        Polymorphism.Person [] arrayOfPersons = new Polymorphism.Person[10];
        //We fill the array with a random class between employee and customer.
        for(int i = 0; i < 10; i++){
            double r = Math.random();
            if(r < 0.5)
                arrayOfPersons[i] = new Polymorphism().new Employee("An","Employee",1000);
            else
                arrayOfPersons[i] = new Polymorphism().new Customer("A","Customer","Simple");
        }

        //We can call the getDescription() method and either the employee one or the customer one will be called.
        //This is possible because they're both inheriting from the Person class.
        for(Polymorphism.Person p : arrayOfPersons){
            System.out.println(p.getDescription());
            //Let's make sure that if the description is the one of an employee it's an Employee class.
            if(p.getDescription().equals("Name: An , Surname : Employee , salary : 1000"))
                assertEquals(Polymorphism.Employee.class,p.getClass());
            else
                assertEquals(Polymorphism.Customer.class,p.getClass());
        }
    }

}
