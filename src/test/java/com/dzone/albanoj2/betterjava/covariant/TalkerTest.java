package com.dzone.albanoj2.betterjava.covariant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class TalkerTest {

    @Test
    public void givenAnimalIsDog_whenTalk_thenDogBarks() {
        
        Dog dog = new Dog();
        
        String noise = Talker.talk(dog);
        
        assertThat(noise, is(dog.makeNoise()));
    }

    @Test
    public void givenAnimalIsCat_whenTalk_thenCatMeows() {
        
        Cat cat = new Cat();
        
        String noise = Talker.talk(cat);
        
        assertThat(noise, is(cat.makeNoise()));
    }
}
