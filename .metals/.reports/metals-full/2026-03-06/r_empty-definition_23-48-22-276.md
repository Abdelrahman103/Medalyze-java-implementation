error id: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/AdminDashboardFactory.java:com/medalyze/interfaces/AppointmentProduct#
file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/AdminDashboardFactory.java
empty definition using pc, found symbol in pc: com/medalyze/interfaces/AppointmentProduct#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 54
uri: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/AdminDashboardFactory.java
text:
```scala
package com.medalyze;

import com.medalyze.interfaces.@@AppointmentProduct;

public class AdminDashboardFactory implements DashboardFactory {

    @Override
    public ReportProduct createReport() {
        return new AdminReport();
    }

    @Override
    public AppointmentProduct createAppointment() {
        return new AdminAppointment();
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: com/medalyze/interfaces/AppointmentProduct#