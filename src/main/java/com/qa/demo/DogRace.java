package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DogRace {

    private static List<String> convertToEnglish(List<Integer> listOfPlaces) {

        List<String> listOfPlacesEnglish = new ArrayList<>();
        for (Integer num : listOfPlaces) {

            String place;

            if (num % 10 == 1 && num != 11) place = num + "st";
            else if (num % 10 == 2 && num != 12) place = num + "nd";
            else if (num % 10 == 3 && num != 13) place = num + "rd";
            else place = num + "th";

            listOfPlacesEnglish.add(place);
        }
        return listOfPlacesEnglish;
    }

    public static List<String> obtainRanking(int place) {

        List<Integer> listOfPlaces = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        listOfPlaces = new LinkedList<>(listOfPlaces);

        if (place > 0 && place < 101)
            listOfPlaces.remove(place - 1);

        return convertToEnglish(listOfPlaces);
    }

}
