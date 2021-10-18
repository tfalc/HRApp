public class Department {

    private static final Employee[] employees = new Employee[10];
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
        Employee[] actualEmployee = new Employee[lastAddedEmployeeIndex + 1];
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

        //return lastAddedEmployeeIndex+1;
    }

    public Employee findEmployeeById(int empID) {
        for( Employee emp : employees){
            if(emp != null) {
                if (emp.getId() == empID) {
                    return emp;
                }
            }
        }
        return null;
    }

    public Double getTotalSalary() {
        double total = 0.0;
        for (int i = 0; i < lastAddedEmployeeIndex; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public Double averageSalary() {
        double average = 0.0;
        if(lastAddedEmployeeIndex > -1){
            return getTotalSalary() / (lastAddedEmployeeIndex+1);
        }
        return average;
    }

    @Override
    public String toString(){
        return name;
    }
}
