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

        assertEquals(dog1,dog2);
        assertNotEquals(dog1,dog3);
        assertNotEquals(dog2,dog3);
    }

    @Test public void hashcodeTest(){
        EqualsAndHashcode.Dog dog1= new EqualsAndHashcode().new Dog("Buddy",2,"male");
        EqualsAndHashcode.Dog dog2= new EqualsAndHashcode().new Dog("Buddy",2,"male");
        EqualsAndHashcode.Dog dog3= new EqualsAndHashcode().new Dog("Flynn",2,"male");

        assertEquals(dog1.hashCode(),dog2.hashCode());
        assertNotEquals(dog1.hashCode(),dog3.hashCode());
        assertNotEquals(dog2.hashCode(),dog3.hashCode());
    }

}
