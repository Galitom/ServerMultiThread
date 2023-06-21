package org.example;

import junit.framework.TestCase;

public class CarTest extends TestCase {

    public void testGetId() {
        Car c = new Car(1,"Ferrari",123456.5,12);
        assertEquals(1,c.getId());
    }

    public void testSetId() {
        Car c = new Car(1,"Ferrari",123456.5,12);
        c.setId(12);
        assertEquals(12,c.getId());
    }
}