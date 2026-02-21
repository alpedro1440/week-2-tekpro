package id.ac.polban.employee.service;

import id.ac.polban.employee.model.*;
import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    private final Map<Integer, Employee> employees = new HashMap<>();

    // Dependency: EmployeeService bergantung pada class Employee sebagai parameter
    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }
    
    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void raiseSalary(int id, double percent) {
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent/100));
        }
    }
    
    public void printEmployeeDetails(int id) {
        Employee emp = employees.get(id);
        if (emp != null) {
            System.out.println("ID: " + emp.getId() + " | Name: " + emp.getName() + 
                               " | Dept: " + emp.getDepartment().getName() + 
                               " | Type: " + emp.getType().getType() + 
                               " | Salary: Rp" + emp.getSalary());
        } else {
            System.out.println("Pegawai dengan ID " + id + " tidak ditemukan.");
        }
    }
}