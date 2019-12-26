package com.zumo.query;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class QueryReader {
    public Query readJsonQuery() {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Query objectQuery = gson.fromJson(new FileReader("querry.json"), Query.class);
            String json2 = gson.toJson(objectQuery);
            return objectQuery;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }
}
