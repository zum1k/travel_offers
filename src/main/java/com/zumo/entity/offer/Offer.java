package com.zumo.entity.offer;


public class Offer {

    private Travel travel;
    private Location location;
    private Transport transport;
    private Residence residence;
    private Food food;
    private Integer days;
    private double price;

    public Travel getTravel() {
        return travel;
    }
    public Residence getResidence() { return residence; }
    public Location getLocation() {
        return location;
    }
    public Transport getTransport() {
        return transport;
    }
    public Food getFood() {        return food;    }
    public Integer getDays() {
        return days;
    }
    public double getPrice() { return price; }

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

    public void setPrice(){
        this.price = 2 * getLocation().getDistance() * getTransport().getCostPerKilometers() +
                days * getFood().getCostPerDay()*getLocation().getLocalKoefficient() +
        days*getResidence().getCostPerDay()*getLocation().getLocalKoefficient();
    }
    @Override
    public String toString() {
        return "Offer{" +
                "Travel=" + travel +
                ", Location=" + location +
                ", Transport=" + transport +
                ", Residence=" + residence +
                ", Food=" + food +
                ", Days=" + days +
                ", Price=" +price+
                '}';
    }
}
