package ru;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class ZakazEntityTest {
    @Test
    public void testSetZakazId() {
        ZakazEntity zakazEntity = new ZakazEntity();
        zakazEntity.setZakazId(123);
        assertEquals(123, zakazEntity.getZakazId());
    }

    @Test
    public void testSetComments() {
        ZakazEntity zakazEntity = new ZakazEntity();
        zakazEntity.setComments("Comments");
        assertEquals("Comments", zakazEntity.getComments());
    }

    @Test
    public void testEquals() {
        assertFalse((new ZakazEntity()).equals("42"));
        assertFalse((new ZakazEntity()).equals(null));
    }

    @Test
    public void testHashCode() {
        assertEquals(961, (new ZakazEntity()).hashCode());
    }

    @Test
    public void testSetTaxiByZakazPId() {
        ZakazEntity zakazEntity = new ZakazEntity();
        TaxiEntity taxiEntity = new TaxiEntity();
        zakazEntity.setTaxiByZakazPId(taxiEntity);
        assertSame(taxiEntity, zakazEntity.getTaxiByZakazPId());
    }

    @Test
    public void testSetPassengerByZakazTId() {
        ZakazEntity zakazEntity = new ZakazEntity();
        PassengerEntity passengerEntity = new PassengerEntity();
        zakazEntity.setPassengerByZakazTId(passengerEntity);
        assertSame(passengerEntity, zakazEntity.getPassengerByZakazTId());
    }
}

