package com.zumo.query;

import com.zumo.entity.offer.*;

public class Query {
    private Travel travel;
    private Location location;
    private Transport transport;
    private Residence residence;
    private Food food;
    private Integer days;
    private double priceLowerBorder;
    private double priceHigherBorder;


    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setPriceLowerBorder(double priceLowerBorder) {
        this.priceLowerBorder = priceLowerBorder;
    }

    public void setPriceHigherBorder(double priceHigherBorder) {
        this.priceHigherBorder = priceHigherBorder;
    }

    public Travel getTravel() {
        return travel;
    }

    public Location getLocation() {
        return location;
    }

    public Transport getTransport() {
        return transport;
    }

    public Residence getResidence() {
        return residence;
    }

    public Food getFood() {
        return food;
    }

    public Integer getDays() {
        return days;
    }

    public double getPriceLowerBorder() {
        return priceLowerBorder;
    }

    public double getPriceHigherBorder() {
        return priceHigherBorder;
    }
    @Override
    public String toString() {
        return "Offer{" +
                "Travel=" + travel +
                ", Location = " + location +
                ", Transport = " + transport +
                ", Residence = " + residence +
                ", Food = " + food +
                ", Days = " + days +
                ", LowerPrice = " +priceLowerBorder+
                ", HighPrice = "+priceHigherBorder+
                '}';
    }


}
