package com.example.maddom73.myapplication.backend;

import com.example.MyJokes;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private MyJokes mjoke;

    public MyBean() {
        mjoke = new MyJokes();
    }

    public String getJoke() {
        return mjoke.getMyRandomJoke();
    }
}