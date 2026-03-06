package com.medalyze;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient("P1", "Marwan", "0100000000");
        Doctor doctor = new Doctor("D1", "Cardiology");

        Appointment appointment = new Appointment(
                "A1",
                LocalDate.now(),
                LocalTime.now(),
                "Scheduled",
                patient,
                doctor
        );

        appointment.cancel();

        Report report = new Report("R1", "Billing");
        report.generate();

        System.out.println("System running successfully.");

        // Logger Singleton Test
        Logger logger0 = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        System.out.println("Same logger instance? " + (logger0 == logger2));
        
        // DatabaseConnection Singleton Test
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("Same DB instance? " + (db1 == db2));
        
        // Factory Test
        ReportCreator creator;

        creator = new MedicalReportCreator();
        creator.generateReport();

        creator = new BillingReportCreator();
        creator.generateReport();

        creator = new PrescriptionReportCreator();
        creator.generateReport();
        
        // Dashboard Abstract Factory Test
        DashboardFactory factory;

        factory = new AdminDashboardFactory();

        ReportProduct report = factory.createReport();
        AppointmentProduct appointment = factory.createAppointment();

        report.generateReport();
        appointment.manageAppointment();
        
        // Switch Role Easily
        factory = new DoctorDashboardFactory();
        
        // Insurance Billing Factory Test
        BillingFactory factory;

        // Insurance billing
        factory = new InsuranceBillingFactory();
        BillingRecord billing = factory.createBillingRecord();
        Prescription prescription = factory.createPrescription();

        billing.processBilling();
        prescription.handlePrescription();

        // Self-pay billing
        factory = new SelfPayBillingFactory();
        billing = factory.createBillingRecord();
        prescription = factory.createPrescription();

        billing.processBilling();
        prescription.handlePrescription();
    }
}