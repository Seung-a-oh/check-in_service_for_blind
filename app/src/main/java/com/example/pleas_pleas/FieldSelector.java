package com.example.pleas_pleas;

import com.google.android.libraries.places.api.model.Place.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class FieldSelector {

    private final Map<Field, State> fieldStates;

    static List<Field> allExcept(Field... placeFieldsToOmit) {
        List<Field> placeFields = new ArrayList<>(Arrays.asList(Field.values()));

        //지우면 작동 X
        placeFields.removeAll(Arrays.asList(placeFieldsToOmit));
        return placeFields;
    }

    public FieldSelector(
            List<Field> validFields) {
        fieldStates = new HashMap<>();

        //가게 리스트 보여주는 코드
        for (Field field : validFields) {
            fieldStates.put(field, new State(field));
        }
    }

    public List<Field> getAllFields() {
        return new ArrayList<>(fieldStates.keySet());
    }

    public List<Field> getSelectedFields() {
        List<Field> selectedList = new ArrayList<>();
        return selectedList;
    }

    public static final class State {
        public final Field field;
        public State(Field field) {
            this.field = field;
        }
    }
}