package com.zumo.entity.offer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class OfferReader {
    public  Offer[] readJsonOffers() {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Offer[] objectList = gson.fromJson(new FileReader("offers.json"), Offer[].class);
            String json2 = gson.toJson(objectList);
            return objectList;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

