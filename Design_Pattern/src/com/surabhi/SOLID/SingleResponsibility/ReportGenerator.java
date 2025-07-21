package com.surabhi.SOLID.SingleResponsibility;

public class ReportGenerator {
    public String generateReport(Employee employee){
        return "Report for"+employee.getName();
    }
}
