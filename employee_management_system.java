package corejava_assignment;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Employee(int id, String name, int age, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Age: " + age +
               ", Designation: " + designation + ", Salary: $" + salary;
    }
}

class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public Employee searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void updateEmployee(int id, double newSalary) {
        Employee employee = searchEmployee(id);
        if (employee != null) {
            employee.setSalary(newSalary);
            System.out.println("Employee details updated successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployee(int id) {
        Employee employee = searchEmployee(id);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found.");
        }
    }
}

public class employee_management_system {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			EmployeeManagementSystem empManagementSystem = new EmployeeManagementSystem();

			boolean exit = false;
			while (!exit) {
			    System.out.println("\n1. Add Employee");
			    System.out.println("2. Display All Employees");
			    System.out.println("3. Search for Employee");
			    System.out.println("4. Update Employee Detail");
			    System.out.println("5. Delete Employee");
			    System.out.println("6. Exit");
			    System.out.print("Enter your choice: ");
			    int choice = scanner.nextInt();

			    switch (choice) {
			        case 1:
			            System.out.print("Enter Employee ID: ");
			            int id = scanner.nextInt();
			            scanner.nextLine(); // Consume the newline character
			            System.out.print("Enter Employee Name: ");
			            String name = scanner.nextLine();
			            System.out.print("Enter Employee Age: ");
			            int age = scanner.nextInt();
			            scanner.nextLine(); // Consume the newline character
			            System.out.print("Enter Employee Designation: ");
			            String designation = scanner.nextLine();
			            System.out.print("Enter Employee Salary: ");
			            double salary = scanner.nextDouble();
			            Employee newEmployee = new Employee(id, name, age, designation, salary);
			            empManagementSystem.addEmployee(newEmployee);
			            break;
			        case 2:
			            empManagementSystem.displayEmployees();
			            break;
			        case 3:
			            System.out.print("Enter Employee ID to search: ");
			            int searchId = scanner.nextInt();
			            Employee foundEmployee = empManagementSystem.searchEmployee(searchId);
			            if (foundEmployee != null) {
			                System.out.println("Employee found: " + foundEmployee);
			            } else {
			                System.out.println("Employee not found.");
			            }
			            break;
			        case 4:
			            System.out.print("Enter Employee ID to update: ");
			            int updateId = scanner.nextInt();
			            System.out.print("Enter new salary: ");
			            double newSalary = scanner.nextDouble();
			            empManagementSystem.updateEmployee(updateId, newSalary);
			            break;
			        case 5:
			            System.out.print("Enter Employee ID to delete: ");
			            int deleteId = scanner.nextInt();
			            empManagementSystem.deleteEmployee(deleteId);
			            break;
			        case 6:
			            exit = true;
			            System.out.println("Exiting...");
			            break;
			        default:
			            System.out.println("Invalid choice. Please try again.");
			    }
			}
		}
    }
}

