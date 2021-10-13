public class Department {

    private final Employee[] employees = new Employee[10];
    private String name;
    private int lastAddedEmployeeIndex = -1;

    private Employee employee;

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = employee;
        }
    }

    public Employee[] getEmployees() {
        Employee[] actualEmployee = new Employee[lastAddedEmployeeIndex+1];
        for (int i = 0; i < actualEmployee.length; i++) {
            actualEmployee[i] = employees[i];
        }
        return actualEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int numberEmployees(Employee[] employees) {
        return employees.length;
    }

    public Employee[] findEmployeeById(Employee[] employees) {
        return getEmployees(employee.getId());
    }

    public Double totalSalary() {
        double total = 0.0;
        for (int i = 0; i < employees.length; i++) {
            total += employee.getSalary();
        }
        return total;
    }

    public Double averageSalary() {
        double average = 0.0, count = 0.0;
        try {
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (ArithmeticException e) {
            System.out.println("Cant' divide " + average + " by " + count);
        }
        return average;
    }
}
