package com.serenitydojo.model;

import static com.serenitydojo.model.AnimalType.*;

public class Feeder {
    public String feeds(AnimalType animal, boolean isPremium) {
        switch(animal){
            case CAT:
                return (isPremium) ? "Salmon" : "Tuna";
            case DOG:
                return (isPremium)? "Deluxe Dog Food": "Dog Food";
            case HAMSTER:
                return(isPremium)? "Lettuce":"Cabbage";
            default:
                return "Unknown animal unknown what to feed them";
        }
    }
}
