package com.zumo.jsoncreator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zumo.entity.offer.Offer;
import com.zumo.query.Query;

import java.util.List;

public class JsonCreator {
    public String createJson(List<Offer> offerList){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return  gson.toJson(offerList);
    }
    public String createJson(Query o){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return  gson.toJson(o);
    }
}
