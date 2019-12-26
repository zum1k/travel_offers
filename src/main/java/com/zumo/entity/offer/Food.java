package com.zumo.entity.offer;

public enum Food {
    BREAKFAST(5),
    ALLINCLUSIVE(25),
    SWEDENTABLE(15),
    THREETIMESFOOD(15);
    private int costPerDay;

    Food(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public int getCostPerDay() {
        return costPerDay;
    }
}
