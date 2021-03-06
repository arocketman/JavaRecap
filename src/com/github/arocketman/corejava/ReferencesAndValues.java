package com.github.arocketman.corejava;

/**
 * This example aims to show how a Dog Object is passed to a function and how this is handled.
 * To fully understand this you must check the attached test.
 * @see com.github.arocketman.test.ReferencesAndValuesTest
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

    public static class Dog{
        String name;

        public Dog(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
