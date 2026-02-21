package id.ac.polban.employee.model;

public class Employee {
    private int id;
    private String name;
    // Aggregation: Employee memiliki Department dan EmploymentType
    private Department department;
    private EmploymentType type;
    private double salary;
    
    // Implementasi Static Field: Menyimpan total pegawai yang telah dibuat
    private static int totalEmployees = 0; 

    public Employee(int id, String name, Department department, EmploymentType type, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = salary;
        totalEmployees++; // Menambah jumlah total setiap kali object dibuat
    }

    // Implementasi Static Method: Mengambil nilai static field
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
    
    public EmploymentType getType() { return type; }
    public void setType(EmploymentType type) { this.type = type; }
    
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}