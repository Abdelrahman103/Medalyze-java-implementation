error id: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/DoctorDashboardFactory.java:com/medalyze/interfaces/ReportProduct#
file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/DoctorDashboardFactory.java
empty definition using pc, found symbol in pc: com/medalyze/interfaces/ReportProduct#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 112
uri: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/DoctorDashboardFactory.java
text:
```scala
package com.medalyze;

import com.medalyze.interfaces.AppointmentProduct;
import com.medalyze.interfaces.ReportP@@roduct;
import com.medalyze.reports.DoctorReport;

public class DoctorDashboardFactory implements DashboardFactory {

    @Override
    public ReportProduct createReport() {
        return new DoctorReport();
    }

    @Override
    public AppointmentProduct createAppointment() {
        return new DoctorAppointment();
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: com/medalyze/interfaces/ReportProduct#