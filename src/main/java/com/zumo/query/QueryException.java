package com.zumo.query;
import java.util.Arrays;

public class QueryException extends Exception {
    private String queryfield;

    public String getString() {
        return queryfield;
    }
    public QueryException(String message, String queryfield){
        super(message);
        this.queryfield=queryfield;
    }


  }



