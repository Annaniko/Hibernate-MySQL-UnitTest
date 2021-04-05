package ru;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PassengerEntity {
    private int passengerId;
    private int zakazId;
    private String passengerName;

    public PassengerEntity() {

    }

    @Id
    @Column(name = "Passenger_id", nullable = false)
    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    @Basic
    @Column(name = "Zakaz_id", nullable = false)
    public int getZakazId() {
        return zakazId;
    }

    public void setZakazId(int zakazId) {
        this.zakazId = zakazId;
    }

    @Basic
    @Column(name = "passenger_name", nullable = true, length = 255)
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerEntity that = (PassengerEntity) o;
        return passengerId == that.passengerId && zakazId == that.zakazId && Objects.equals(passengerName, that.passengerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerId, zakazId, passengerName);
    }
}
