package com.zumo.matcher;

import com.zumo.entity.offer.Offer;
import com.zumo.query.Query;

import java.util.ArrayList;
import java.util.List;

public class Matcher {
    public List<Offer> matchOffers(Offer[] offers, Query query){
        List<Offer> queryOffers = new ArrayList<Offer>();
        for (Offer o : offers) {
            boolean checkTravel = o.getTravel().equals(query.getTravel()) || query.getTravel() == null;
            boolean checkLocation = o.getLocation().equals(query.getLocation()) || query.getLocation() == null;
            boolean checkTransport = o.getTransport().equals(query.getTransport()) || query.getTransport() == null;
            boolean checkResidence = o.getResidence().equals(query.getResidence()) || query.getResidence() == null;
            boolean checkFood = o.getFood().equals(query.getFood()) || query.getFood() == null;
            boolean checkDays = o.getDays() == query.getDays() || query.getDays() == null;
            boolean checkPrice = (query.getPriceLowerBorder() < o.getPrice() & o.getPrice() < query.getPriceHigherBorder()) ||
                    query.getPriceHigherBorder() == 0;
            if (checkTravel & checkLocation & checkTransport & checkResidence & checkFood & checkDays & checkPrice) {
                queryOffers.add(o);
            }
        }
        return queryOffers;
    }
    public boolean checkEnum(Offer o, Query q) {
        return false;
    }
}
