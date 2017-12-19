package com.example.codeclan.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Weasel on 18/12/2017.
 */

public class Words {
    private String sentence;
    private String[] words;
    private HashMap<String, Integer> instances;

    public Words(String sentence) {
        this.sentence = sentence;
        this.words = sentence.split(" ");
        this.instances = new HashMap<>();
    }

    public Integer wordCount(){
        return words.length;
    }

    public HashMap getInstances() {
        for(String word: words){
            if (!instances.containsKey(word)){
                instances.put(word, 1);
            }
            else {
                instances.put(word, instances.get(word) +1);
            }
            }
        return instances;
    }

    public List<String> instancesList(){
        List<String> targetList = new ArrayList<>(getInstances().keySet());
        return targetList;
    }
}
