error id: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/Main.java:com/medalyze/reports/ReportProduct#
file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/Main.java
empty definition using pc, found symbol in pc: com/medalyze/reports/ReportProduct#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 456
uri: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/Main.java
text:
```scala
package com.medalyze;

import java.time.LocalDate;
import java.time.LocalTime;

import com.medalyze.billing.BillingFactory;
import com.medalyze.billing.InsuranceBillingFactory;
import com.medalyze.billing.SelfPayBillingFactory;
import com.medalyze.reports.BillingReportCreator;
import com.medalyze.reports.MedicalReportCreator;
import com.medalyze.reports.PrescriptionReportCreator;
import com.medalyze.reports.ReportCreator;
import com.medalyze.reports.Re@@portProduct;

/**
 * Main class to test core creational design patterns:
 * - Singleton: Logger, DatabaseConnection
 * - Factory Method: ReportCreator
 * - Abstract Factory: DashboardFactory, BillingFactory
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Starting Medalyze System Test ===\n");

        // =======================
        // Test Singleton Patterns
        // =======================
        System.out.println("** Logger Singleton Test **");
        Logger logger0 = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        System.out.println("Same logger instance? " + (logger0 == logger1) + "\n");

        System.out.println("** DatabaseConnection Singleton Test **");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Same database instance? " + (db1 == db2) + "\n");

        // =========================
        // Test Factory Method Pattern
        // =========================
        System.out.println("** Factory Method Test **");
        ReportCreator creator;

        creator = new MedicalReportCreator();
        creator.generateReport();

        creator = new BillingReportCreator();
        creator.generateReport();

        creator = new PrescriptionReportCreator();
        creator.generateReport();
        System.out.println();

        // =========================
        // Test Abstract Factory Pattern: Dashboards
        // =========================
        System.out.println("** Dashboard Abstract Factory Test: Admin Dashboard **");
        DashboardFactory adminFactory = new AdminDashboardFactory();

        ReportProduct adminReport = adminFactory.createReport();
        AppointmentProduct adminAppointment = adminFactory.createAppointment();

        adminReport.generateReport();
        adminAppointment.manageAppointment();
        System.out.println();

        System.out.println("** Dashboard Abstract Factory Test: Doctor Dashboard **");
        DashboardFactory doctorFactory = new DoctorDashboardFactory();

        ReportProduct doctorReport = doctorFactory.createReport();
        AppointmentProduct doctorAppointment = doctorFactory.createAppointment();

        doctorReport.generateReport();
        doctorAppointment.manageAppointment();
        System.out.println();

        // =========================
        // Test Abstract Factory Pattern: Billing
        // =========================
        System.out.println("** Billing Abstract Factory Test: Insurance Billing **");
        BillingFactory insuranceFactory = new InsuranceBillingFactory();

        BillingRecord insuranceBilling = insuranceFactory.createBillingRecord();
        Prescription insurancePrescription = insuranceFactory.createPrescription();

        insuranceBilling.processBilling();
        insurancePrescription.handlePrescription();
        System.out.println();

        System.out.println("** Billing Abstract Factory Test: Self-Pay Billing **");
        BillingFactory selfPayFactory = new SelfPayBillingFactory();

        BillingRecord selfPayBilling = selfPayFactory.createBillingRecord();
        Prescription selfPayPrescription = selfPayFactory.createPrescription();

        selfPayBilling.processBilling();
        selfPayPrescription.handlePrescription();
        System.out.println();

        System.out.println("=== Medalyze System Test Completed Successfully ===");
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: com/medalyze/reports/ReportProduct#