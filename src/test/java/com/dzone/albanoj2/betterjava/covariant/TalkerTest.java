package com.dzone.albanoj2.betterjava.covariant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TalkerTest {
    
    private Talker talker;
    
    @BeforeEach
    public void setUp() {
        talker = new Talker();
    }

    @Test
    public void givenAnimalIsDog_whenTalk_thenDogBarks() {
        
        Dog dog = new Dog();
        
        String noise = talker.talk(dog);
        
        assertThat(noise, is(dog.makeNoise()));
    }

    @Test
    public void givenAnimalIsCat_whenTalk_thenCatMeows() {
        
        Cat cat = new Cat();
        
        String noise = talker.talk(cat);
        
        assertThat(noise, is(cat.makeNoise()));
    }
}
