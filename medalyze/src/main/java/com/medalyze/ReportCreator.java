package com.medalyze.reports;

public abstract class ReportCreator {

    public abstract Report createReport();

    public void generateReport() {
        Report report = createReport();
        report.generate();
    }
}