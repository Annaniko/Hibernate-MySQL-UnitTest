package ru;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TaxiEntityTest {
    @Test
    public void testSetTaxiId() {
        TaxiEntity taxiEntity = new TaxiEntity();
        taxiEntity.setTaxiId(123);
        assertEquals(123, taxiEntity.getTaxiId());
    }

    @Test
    public void testSetZakazId() {
        TaxiEntity taxiEntity = new TaxiEntity();
        taxiEntity.setZakazId(123);
        assertEquals(123, taxiEntity.getZakazId());
    }

    @Test
    public void testSetCar() {
        TaxiEntity taxiEntity = new TaxiEntity();
        taxiEntity.setCar("Car");
        assertEquals("Car", taxiEntity.getCar());
    }

    @Test
    public void testEquals() {
        assertFalse((new TaxiEntity()).equals("42"));
        assertFalse((new TaxiEntity()).equals(null));
    }

    @Test
    public void testHashCode() {
        assertEquals(29791, (new TaxiEntity()).hashCode());
    }
}

