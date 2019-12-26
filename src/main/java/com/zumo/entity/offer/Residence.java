package com.zumo.entity.offer;

public enum Residence {
    HOTEL(30),
    HOSTEL(10),
    APPARTMENTS(25);
    private int costPerDay;
    Residence(int costPerDay) { this.costPerDay = costPerDay; }
    public int getCostPerDay(){ return  costPerDay; }
}
