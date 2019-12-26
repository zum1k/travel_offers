package com.zumo.entity.offer;

public enum Location {

    EUROPE(1000,2.5),
    CAUCASUS(2500,1.2),
    TIBET(4500,1.5),
    BLACKSEA(1500,1),
    MIDDLESEA(2500,2),
    ALPINE(1500,2.7),
    ASIA(3500,1.8),
    BALCTIC(400,1.5),
    CHINA(5000,1.6),
    USA(12000,3);
    private int distance;
    private double localKoefficient;

    Location(int distance, double localKoefficient) {
        this.distance = distance;
        this.localKoefficient = localKoefficient;
    }

    public int getDistance() {
        return distance;
    }
    public double getLocalKoefficient(){
        return localKoefficient;
    }
}
