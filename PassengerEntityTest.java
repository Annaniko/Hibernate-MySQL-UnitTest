package ru;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class PassengerEntityTest {
    @Test
    public void testSetPassengerId() {
        PassengerEntity passengerEntity = new PassengerEntity();
        passengerEntity.setPassengerId(123);
        assertEquals(123, passengerEntity.getPassengerId());
    }

    @Test
    public void testSetZakazId() {
        PassengerEntity passengerEntity = new PassengerEntity();
        passengerEntity.setZakazId(123);
        assertEquals(123, passengerEntity.getZakazId());
    }

    @Test
    public void testSetPassengerName() {
        PassengerEntity passengerEntity = new PassengerEntity();
        passengerEntity.setPassengerName("Passenger Name");
        assertEquals("Passenger Name", passengerEntity.getPassengerName());
    }

    @Test
    public void testEquals() {
        assertFalse((new PassengerEntity()).equals("42"));
        assertFalse((new PassengerEntity()).equals(null));
    }

    @Test
    public void testHashCode() {
        assertEquals(29791, (new PassengerEntity()).hashCode());
    }
}

