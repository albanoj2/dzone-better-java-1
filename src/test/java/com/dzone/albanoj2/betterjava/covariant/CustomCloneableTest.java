package com.dzone.albanoj2.betterjava.covariant;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomCloneableTest {

    @Test
    public void givenValidModel_whenGetModel_thenCorrectModelReturned() {
        
        String model = "Corvette";
        
        Vehicle originalVehicle = new Vehicle(model);
        Vehicle clonedVehicle = originalVehicle.customClone();
        
        assertThat(clonedVehicle.getModel(), is(model));
    }
}
