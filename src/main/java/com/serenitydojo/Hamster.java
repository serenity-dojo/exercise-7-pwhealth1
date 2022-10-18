package com.serenitydojo;

public class Hamster extends Pet{
    
    private String favoriteToy;
    public Hamster(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }
    
    @Override
    String play() {
        return "runs in wheel";
    }
}
