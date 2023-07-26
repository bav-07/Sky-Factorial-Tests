package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DogRaceTest {

    @Test
    void listOmitsPlace5th() {
        Assertions.assertFalse(DogRace.obtainRanking(5).contains("5th"));
    }

    @Test
    void listKeepsPlace5th() {
        Assertions.assertTrue(DogRace.obtainRanking(10).contains("5th"));
    }

    @Test
    void listSizeIs99() {
        Assertions.assertEquals(99, DogRace.obtainRanking(50).size());
        Assertions.assertEquals(99, DogRace.obtainRanking(25).size());
        Assertions.assertEquals(99, DogRace.obtainRanking(75).size());
    }

    @Test
    void goToOmittedPlace() {
        Assertions.assertEquals("24th", DogRace.obtainRanking(23).get(22));
        Assertions.assertEquals("48th", DogRace.obtainRanking(47).get(46));
        Assertions.assertEquals("73rd", DogRace.obtainRanking(72).get(71));
    }

    @Test
    void goToDirectlyBeforeOmittedPlace() {
        Assertions.assertEquals("84th", DogRace.obtainRanking(85).get(83));
        Assertions.assertEquals("22nd", DogRace.obtainRanking(23).get(21));
        Assertions.assertEquals("61st", DogRace.obtainRanking(62).get(60));
    }

    @Test
    void noPlaceOmittedForInput0Or100() {
        Assertions.assertEquals(100, DogRace.obtainRanking(0).size());
        Assertions.assertEquals(100, DogRace.obtainRanking(101).size());
    }

    @Test
    void correctSuffixForPlaces() {
        Assertions.assertEquals("1st", DogRace.obtainRanking(100).get(0));
        Assertions.assertEquals("2nd", DogRace.obtainRanking(100).get(1));
        Assertions.assertEquals("3rd", DogRace.obtainRanking(100).get(2));
        Assertions.assertEquals("11th", DogRace.obtainRanking(100).get(10));
        Assertions.assertEquals("12th", DogRace.obtainRanking(100).get(11));
        Assertions.assertEquals("13th", DogRace.obtainRanking(100).get(12));
    }


}
