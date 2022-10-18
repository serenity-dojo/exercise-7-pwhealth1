package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(AnimalType.CAT, false);

        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(AnimalType.HAMSTER, false);

        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(AnimalType.DOG, false);

        Assert.assertEquals("Dog Food", food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(AnimalType.CAT, true);

        Assert.assertEquals("Salmon", food);

    }
    @Test
    public void shouldFeedPremiumDeluxeDogFood() {
        Feeder feeder = new Feeder();
        
        String food = feeder.feeds(AnimalType.DOG, true);
        
        Assert.assertEquals("Deluxe Dog Food", food);
        
    }
    @Test
    public void shouldFeedPremiumHamsterPremiumFood() {
        Feeder feeder = new Feeder();
        
        String food = feeder.feeds(AnimalType.HAMSTER, true);
        
        Assert.assertEquals("Lettuce", food);
        
    }
    @Test
    public void shouldFeedPremiumFishPremiumFood() {
        Feeder feeder = new Feeder();
        
        String food = feeder.feeds(AnimalType.FISH, true);
        
        Assert.assertEquals("Unknown animal unknown what to feed them", food);
        
    }
}
