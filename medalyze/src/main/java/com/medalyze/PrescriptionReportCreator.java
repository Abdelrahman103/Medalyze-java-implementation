package com.medalyze.reports;

public class PrescriptionReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new PrescriptionReport();
    }
}