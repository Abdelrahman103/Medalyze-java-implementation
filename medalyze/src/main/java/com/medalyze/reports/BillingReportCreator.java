package com.medalyze.reports;

public class BillingReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new BillingReport();
    }
}