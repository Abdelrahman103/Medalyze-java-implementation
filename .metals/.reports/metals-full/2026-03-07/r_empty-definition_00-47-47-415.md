error id: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/abstractfactory/dashboard/AdminDashboardFactory.java:_empty_/DashboardFactory#
file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/abstractfactory/dashboard/AdminDashboardFactory.java
empty definition using pc, found symbol in pc: _empty_/DashboardFactory#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 265
uri: file://<HOME>/projects/Medalyze-java-implementation/Deliverable%20%231/medalyze/src/main/java/com/medalyze/abstractfactory/dashboard/AdminDashboardFactory.java
text:
```scala
package com.medalyze.abstractfactory.dashboard;

import com.medalyze.AppointmentProduct;
import com.medalyze.ReportProduct;
import com.medalyze.dashboard.AdminAppointment;
import com.medalyze.dashboard.AdminReport;

public class AdminDashboardFactory implements Das@@hboardFactory {

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

empty definition using pc, found symbol in pc: _empty_/DashboardFactory#