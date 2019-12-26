package com.zumo.query;

import com.zumo.entity.offer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QueryCreator {
    public Query createQuery(){
        Random r = new Random();
        Query query = new Query();
        query.setTravel(Travel.values()[r.nextInt(Travel.values().length)]);
        query.setLocation(Location.values()[r.nextInt(Location.values().length)]);
        query.setTransport(Transport.values()[r.nextInt(Transport.values().length)]);
        query.setFood(Food.values()[r.nextInt(Food.values().length)]);
        query.setResidence(Residence.values()[r.nextInt(Residence.values().length)]);
        query.setPriceLowerBorder(0);
        query.setPriceHigherBorder(r.nextInt(25)*100);

        return query;
    }
}
