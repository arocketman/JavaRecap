package com.github.arocketman.test;

import com.github.arocketman.corejava.EqualsAndHashcode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Andreuccio on 27/01/2017.
 */
public class EqualsAndHashcodeTest {

    @Test
    public void equalsTest(){
        EqualsAndHashcode.Dog dog1= new EqualsAndHashcode().new Dog("Buddy",2,"male");
        EqualsAndHashcode.Dog dog2= new EqualsAndHashcode().new Dog("Buddy",2,"male");
        EqualsAndHashcode.Dog dog3= new EqualsAndHashcode().new Dog("Flynn",2,"male");

        //First two dogs are equal. Third one is different from both the first and the second.
        assertEquals(dog1,dog2);
        assertNotEquals(dog1,dog3);
        assertNotEquals(dog2,dog3);
    }

    @Test public void hashcodeTest(){
        EqualsAndHashcode.Dog dog1= new EqualsAndHashcode().new Dog("Buddy",2,"male");
        EqualsAndHashcode.Dog dog2= new EqualsAndHashcode().new Dog("Buddy",2,"male");
        EqualsAndHashcode.Dog dog3= new EqualsAndHashcode().new Dog("Flynn",2,"male");

        //Equal objects must return the same hashcode.
        assertEquals(dog1.hashCode(),dog2.hashCode());

        //This test could actually fail! Different objects can produce the same hashcode. In the example this doesn't happen
        //But it doesn't mean it couldn't have!
        assertNotEquals(dog1.hashCode(),dog3.hashCode());
        assertNotEquals(dog2.hashCode(),dog3.hashCode());
    }

}
