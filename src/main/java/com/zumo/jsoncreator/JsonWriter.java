package com.zumo.jsoncreator;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    public void writeJson(String filename, String json){
        try (FileWriter writer = new FileWriter(filename+".json", false)) {
            writer.write(json);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
