package id.ac.polban.employee.main;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== APLIKASI DATA PEGAWAI ===");
        
        Department deptIT = new Department("IT Department");
        Department deptHR = new Department("HR Department");
        EmploymentType typeFullTime = new EmploymentType("Full-Time");
        EmploymentType typeContract = new EmploymentType("Contract");

        Employee emp1 = new Employee(101, "Budi", deptIT, typeFullTime, 8000000);
        Employee emp2 = new Employee(102, "Siti", deptHR, typeContract, 5000000);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("\n[Data Awal Pegawai]");
        service.printEmployeeDetails(101);
        service.printEmployeeDetails(102);

        System.out.println("\n[Proses Kenaikan Gaji 10% untuk Budi]");
        service.raiseSalary(101, 10);
        service.printEmployeeDetails(101);

        System.out.println("\n[Informasi Static]");
        System.out.println("Total pegawai yang terdaftar di sistem: " + Employee.getTotalEmployees());
    }
}