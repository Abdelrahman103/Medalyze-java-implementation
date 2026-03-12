package com.medalyze;

import com.medalyze.flyweight.Specialization;
import com.medalyze.flyweight.SpecializationFactory;

public class FlyweightTest {

    public static void main(String[] args) {

        Specialization s1 =
            SpecializationFactory.getSpecialization("Cardiology");

        Specialization s2 =
            SpecializationFactory.getSpecialization("Cardiology");

        System.out.println(s1 == s2);
    }
}