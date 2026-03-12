package com.medalyze.model;

import com.medalyze.flyweight.Specialization;

public class Doctor {

    private String doctorID;
    private Specialization specialization;;

    public Doctor(String doctorID, Specialization specialization) {
        this.doctorID = doctorID;
        this.specialization = specialization;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
}