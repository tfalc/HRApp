public class HRApp {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Thiago", 3500.0);
        Employee employee2 = new Employee(2, "Janaina", 2500.0);
        Employee employee3 = new Employee(3, "Luzia", 4500.0);
        Employee employee4 = new Employee(4, "Suelani", 2000.0);

        Department dep1 = new Department("Sala");

        dep1.addEmployee(employee1);
        dep1.addEmployee(employee2);
        dep1.addEmployee(employee3);
        dep1.addEmployee(employee4);

        Employee[] employees = dep1.getEmployees();

        for(Employee emp : employees){
            System.out.println("Employees " + emp);
        }

        System.out.println("Total salary: " + dep1.getTotalSalary());
        System.out.println("Average salary: " + dep1.averageSalary());
        System.out.println("Employee ID 3 is: " + dep1.findEmployeeById(3));
    }
}
