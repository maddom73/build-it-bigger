package com.example;

import java.util.Random;

public class MyJokes {
    private String[] myJokes;
    private Random random;

    public MyJokes() {
        myJokes = new String[3];
        myJokes[0] = "An Englishman went into a hardware store and asked: \"Can I buy a sink?\"";
        myJokes[1] = "Q: Would you like one with a plug? A: Don't tell me they've gone electric.";
        myJokes[2] = "What do you call an Englishman with an IQ of 50? Colonel, sir.";
        random = new Random();
    }

    public String[] getMyJokes() {
        return myJokes;
    }

    public String getMyRandomJoke() {
        return myJokes[random.nextInt(myJokes.length)];
    }

}

