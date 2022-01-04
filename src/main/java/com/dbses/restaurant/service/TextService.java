/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dbses.restaurant.service;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author stef
 */
public class TextService {
    private final ArrayList<String> texts;
    
    public TextService(){
        texts = new ArrayList<String>();
        texts.add("I love being pressed!");
        texts.add("Press me again!");
        texts.add("I ran out of text ideas...");
    }
    
    public String randomText(){
        int randomInt = new Random().nextInt(texts.size());
        return texts.get(randomInt);
    }
    
    public void addOption(final String option){
        texts.add(option);
    }
    
}