public class Department {

    private String name;
    private Employee[] employees;

    private Employee employee;

    public void addEmployee(Employee[] someEmployees){
        employees = someEmployees;
    }

    public Employee[] getEmployees(int id){
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int numberEmployees(Employee[] employees){
        return employees.length;
    }

    public Employee[] findEmployeeById(Employee[] employees){
        return getEmployees(employee.getId(employees));
    }

    public Double totalSalary(){
        double total = 0.0;
        for(int i = 0; i < employees.length; i++){
            total += employee.getSalary();
        }
        return total;
    }

    public Double averageSalary(){
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
