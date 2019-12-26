package com.zumo.entity.offer;

import java.util.ArrayList;
import java.util.List;

public class OfferCreator {

    public List<Offer> createOffer(int num){
        List<Offer> offerList = new ArrayList<>();
        OfferGenerator offerGenerator = new OfferGenerator();

        for (int i = 0; i < num; i++) {
            offerList.add(offerGenerator.generateOffer());
        }
        return offerList;
    }

}
