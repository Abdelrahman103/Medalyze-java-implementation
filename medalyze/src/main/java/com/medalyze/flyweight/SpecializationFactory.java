package com.medalyze.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SpecializationFactory {

    private static Map<String, Specialization> specializations = new HashMap<>();

    public static Specialization getSpecialization(String name) {

        Specialization specialization = specializations.get(name);

        if (specialization == null) {
            specialization = new Specialization(name);
            specializations.put(name, specialization);
        }

        return specialization;
    }
}