package com.zumo.entity.offer;

public enum Transport {
    BUS(0.025),
    JET(0.1),
    TRAIN(0.05),
    AUTOMOBILE(0.06);
    private double costPerKilometers;

   Transport(double costPerKilometers) {
        this.costPerKilometers = costPerKilometers;
    }

   public double getCostPerKilometers() {
        return costPerKilometers;
    }

}
