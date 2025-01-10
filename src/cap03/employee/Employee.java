package cap03.employee;

public class Employee {
    private String name;
    private String lastName;
    private double salary;

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualSalary(){
        return salary * 12;
    }

    public double getSalary() {
        return salary;
    }

    public void applyRaise(double percentage){
        salary += salary * (percentage / 100);
    }

    public void setSalary(double salary) {
        if (salary > 0.0){
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Name: " + name +
                ", LastName: " + lastName +
                ", Salary: " + salary;
    }
}
