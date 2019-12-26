package com.zumo.entity.offer;

        import java.util.List;

public class OfferShower {
    public void showOffer(List<Offer> offers) {

        for (Offer o : offers) {
            System.out.println(o.toString());
        }
    }
}
