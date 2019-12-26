package com.zumo.runner;

import com.google.gson.Gson;
import com.zumo.entity.offer.*;
import com.zumo.jsoncreator.JsonCreator;
import com.zumo.jsoncreator.JsonWriter;
import com.zumo.matcher.Matcher;
import com.zumo.query.Query;
import com.zumo.query.QueryCreator;
import com.zumo.query.QueryReader;
import com.zumo.query.QueryShower;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public Runner() {
        List<Offer> offers = new ArrayList<>();
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
    }

    public void run() {
        //create offers and write to json file
        JsonCreator jsonCreator = new JsonCreator();
        JsonWriter jsonWriter = new JsonWriter();
        OfferCreator offerCreator = new OfferCreator();
        List<Offer> offers = offerCreator.createOffer(1000);
        String gsonOffers = jsonCreator.createJson(offers);
        jsonWriter.writeJson("offers", gsonOffers);

        //check file query.json exist
        File file = new File("C:\\Users\\smugl\\IdeaProjects\\TravelOffers\\querry.json"); // create if not exists
        boolean exists = file.exists();
        if( !exists) {
            // create query and write to json file
            QueryCreator queryCreator = new QueryCreator();
            Query objectQuery = queryCreator.createQuery();
            String query = jsonCreator.createJson(objectQuery);
            jsonWriter.writeJson("querry", query);
        }


        // read offers and query from json files
        OfferReader offerReader = new OfferReader();
        QueryReader queryReader = new QueryReader();
        Offer[] jsonOffers =offerReader.readJsonOffers();
        Query jsonQuery = queryReader.readJsonQuery();

        // match offers and query and write result to json file
        Matcher matcher = new Matcher();
        List<Offer> resultOffers =  matcher.matchOffers(jsonOffers, jsonQuery);
        String result = jsonCreator.createJson(resultOffers);
        jsonWriter.writeJson("resultOffers", result);
        OfferShower offersShower = new OfferShower();
        offersShower.showOffer(resultOffers);
    }
}

