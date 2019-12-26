package com.zumo.entity.offer;

import java.util.Random;

public class OfferGenerator {
    protected Offer generateOffer() {
        Offer o = new Offer();
        Random r = new Random();
        o.setTravel(Travel.values()[r.nextInt(Travel.values().length)]);
        o.setLocation(Location.values()[r.nextInt(Location.values().length)]);
        o.setTransport(Transport.values()[r.nextInt(Transport.values().length)]);
        o.setResidence(Residence.values()[r.nextInt(Residence.values().length)]);
        o.setFood(Food.values()[r.nextInt(Food.values().length)]);
        o.setDays(3 + r.nextInt(21));
        o.setPrice();

        return o;

    }
}
