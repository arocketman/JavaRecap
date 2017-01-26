package com.github.arocketman.corejava;

/**
 * Created by Andreuccio on 26/01/2017.
 */
public class ReferencesAndValues {

    /**
     * Java is pass reference by value. That means that the reference to the "Dog" object will be passed by value from the calling method.
     * The setname of such object will be reflected on the outside of the method.
     * This happens because both outside and inside the method the references are pointing to the same object in memory.
     */
    public static void passByValue(Dog doggo){
        doggo.setName("Buddy");
    }

}
