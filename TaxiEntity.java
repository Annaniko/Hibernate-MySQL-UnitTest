package ru;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class TaxiEntity {
    private int taxiId;
    private int zakazId;
    private String car;

    @Id
    @Column(name = "Taxi_id", nullable = false)
    public int getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
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
    @Column(name = "car", nullable = true, length = 255)
    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxiEntity that = (TaxiEntity) o;
        return taxiId == that.taxiId && zakazId == that.zakazId && Objects.equals(car, that.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxiId, zakazId, car);
    }
}
