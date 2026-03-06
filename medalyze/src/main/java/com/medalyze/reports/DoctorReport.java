package com.medalyze.reports;

import com.medalyze.ReportProduct;

public class DoctorReport implements ReportProduct {

    @Override
    public void generateReport() {
        System.out.println("Generating Doctor Medical Report...");
    }
}