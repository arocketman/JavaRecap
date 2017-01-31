package com.github.arocketman.corejava;

import java.util.ArrayList;

/**
 * This class consists of a generic method example printObjects
 * and two ArrayLists. The first one, withoutGen is generic-less.
 * The second one, withGen uses Generic types and it's considered to be a safer, clearer way.
 * @see com.github.arocketman.test.GenericsTest
 */
public class Generics {

    private ArrayList withoutGen;
    private ArrayList<String> withGen;

    public Generics() {
        withoutGen = new ArrayList();
        withGen = new ArrayList<>();

        //Unchecked calls, the type of the array withoutGen is raw. The compiler is issuing a warning.
        withoutGen.add("hello");
        withoutGen.add("hi");
        withoutGen.add("world");

        //The compiler is not issuing any warning. We are adding a String object to an ArrayList of Strings.
        withGen.add("hello");
        withGen.add("hi");
        withGen.add("world");

    }

    /**
     * This is a generic method that loops through an array of type parameter T and
     * builds a String with the .toString representation of each element.
     * @param inputArray
     * @param <T> type parameter T
     * @return a merged String of all the .toString() of each element of the array.
     */
    public static <T> String printObjects(T [] inputArray){
        StringBuilder builder = new StringBuilder();
        for(T obj : inputArray)
            builder.append(obj.toString());
        return builder.toString();
    }

    /**
     * Generic method with bounded parameters.
     * @param number
     * @param <T>
     * @return
     */
    public static <T extends Number> double plusOne(T number){
        return number.doubleValue() + 1;
    }

    public ArrayList getWithoutGen() {
        return withoutGen;
    }

    public ArrayList<String> getWithGen() {
        return withGen;
    }
}
