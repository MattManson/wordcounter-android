package com.example.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Weasel on 18/12/2017.
 */

public class CounterTest {

    Words words;


    @Before
    public void before(){
        words = new Words("this is a phrase with some words");
    }

    @Test
    public void canGetNumberWords(){
        assertEquals(7, words.wordCount());
    }

    @Test
    public void canGetInstances(){
        HashMap variable = words.getInstances();
        assertEquals(variable, words.getInstances());
    }





}
