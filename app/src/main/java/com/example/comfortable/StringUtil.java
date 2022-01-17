package com.example.comfortable;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;

import java.util.Arrays;
import java.util.List;

// field 에 값을 넣어주는 클래스
public final class StringUtil {

    private static final String RESULT_SEPARATOR = "\n";

    static String stringify(FindCurrentPlaceResponse response) {
        StringBuilder builder = new StringBuilder();
            for (PlaceLikelihood placeLikelihood : response.getPlaceLikelihoods()) {
                builder
                        .append(RESULT_SEPARATOR)
                        .append(stringify(placeLikelihood.getPlace()));
            }
        return builder.toString();
    }

    static List<String> all(FindCurrentPlaceResponse response) {
        StringBuilder builder = new StringBuilder();
        for (PlaceLikelihood placeLikelihood : response.getPlaceLikelihoods()) {
            builder
                    .append(RESULT_SEPARATOR)
                    .append(stringify(placeLikelihood.getPlace()));
        }

        String all_str = builder.toString();

        List<String> store_list = Arrays.asList(all_str.split("\n"));

        return store_list;

    }

    static String one(FindCurrentPlaceResponse response) {
        StringBuilder builder = new StringBuilder();
        for (PlaceLikelihood placeLikelihood : response.getPlaceLikelihoods()) {
            builder.append(RESULT_SEPARATOR).append(stringify(placeLikelihood.getPlace()));
        }

        String all_str = builder.toString();

        List<String> store_list = Arrays.asList(all_str.split("\n"));

        return store_list.toString();
    }

    static String stringify(Place place) {
        return place.getName();
    }
}