package com.github.arocketman.test;

import com.github.arocketman.corejava.Generics;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andreuccio on 31/01/2017.
 */
public class GenericsTest {
    @Test
    public void printObjectsTest() {
        Integer [] numbersArray = {1,2,3,4,5};
        String [] stringArray = {"a","b","c","d","e"};

        assertEquals("12345", Generics.printObjects(numbersArray));
        assertEquals("abcde", Generics.printObjects(stringArray));
    }

    @Test
    public void withoutGeneric(){
        Generics generics = new Generics();
        //The get method on the non generified array is returning an Object type. We need to cast it to String.
        //This can be considered not as safe as the generic way since the compiler is not able to issue an error if we cast it to
        //Something else.
        String value = (String)generics.getWithoutGen().get(0);

        assertEquals("hello",value);

        //At compile time, we are able to cast this to Integer, but it will throw an Exception.
        try {
            Integer wrongCast = (Integer) generics.getWithoutGen().get(1);

            //Unreachable code:
            System.out.println(wrongCast);
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void withGeneric(){
        Generics generics = new Generics();
        //No cast needed, the compiler knows it will return a String object.
        String value = generics.getWithGen().get(0);

        assertEquals("hello",value);

        //The compiler returns an "Incompatible types" error if we try to write the following piece of code:
        //Integer wrongCast = generics.getWithGen().get(0);
    }

    @Test
    public void plusOneTest() {
        Integer integ = 1;
        Double doub = 1.0;
        Float flo = 1f;
        // We are free to call the method plusOne on every type that extends Number.
        assertEquals(2.0,Generics.plusOne(integ),0.001);
        assertEquals(2.0,Generics.plusOne(doub),0.001);
        assertEquals(2.0,Generics.plusOne(flo),0.001);

        //We are unable to do the following since String doesn't extend Number:
        //Generics.plusOne("hi");
    }

}