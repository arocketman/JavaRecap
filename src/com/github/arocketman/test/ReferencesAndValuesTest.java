package com.github.arocketman.test;

import com.github.arocketman.corejava.ReferencesAndValues;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Andreuccio on 26/01/2017.
 */
public class ReferencesAndValuesTest {

    @Test
    public void passByValueTest(){
        ReferencesAndValues.Dog doggo = new ReferencesAndValues.Dog("Poe");
        ReferencesAndValues.passByValue(doggo);
        assertEquals("Buddy",doggo.getName());
    }

}
