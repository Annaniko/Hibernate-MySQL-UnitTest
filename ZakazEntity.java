package ru;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ZakazEntity {
    private int zakazId;
    private String comments;
    private TaxiEntity taxiByZakazPId;
    private PassengerEntity passengerByZakazTId;

    @Id
    @Column(name = "Zakaz_id", nullable = false)
    public int getZakazId() {
        return zakazId;
    }

    public void setZakazId(int zakazId) {
        this.zakazId = zakazId;
    }

    @Basic
    @Column(name = "comments", nullable = false, length = 255)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZakazEntity that = (ZakazEntity) o;
        return zakazId == that.zakazId && Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zakazId, comments);
    }

    @ManyToOne
    @JoinColumn(name = "ZakazP_id", referencedColumnName = "Taxi_id", nullable = false)
    public TaxiEntity getTaxiByZakazPId() {
        return taxiByZakazPId;
    }

    public void setTaxiByZakazPId(TaxiEntity taxiByZakazPId) {
        this.taxiByZakazPId = taxiByZakazPId;
    }

    @ManyToOne
    @JoinColumn(name = "ZakazT_id", referencedColumnName = "Passenger_id", nullable = false)
    public PassengerEntity getPassengerByZakazTId() {
        return passengerByZakazTId;
    }

    public void setPassengerByZakazTId(PassengerEntity passengerByZakazTId) {
        this.passengerByZakazTId = passengerByZakazTId;
    }
}
