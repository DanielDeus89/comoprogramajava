package cap03.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Daniel","Deus",7300);
        Employee employee2 = new Employee("Ana","Silva",3220);

        // Exibindo salário anual antes do aumento
        System.out.printf("%s - Annual Salary: $%.2f%n", employee1, employee1.getAnnualSalary());
        System.out.printf("%s - Annual Salary: $%.2f%n", employee2, employee2.getAnnualSalary());

        // Aplicando aumento de 10%
        System.out.println("\nApplying 10% raise...");
        employee1.applyRaise(10);
        employee2.applyRaise(10);

        // Exibindo salário anual após o aumento
        System.out.printf("%s - Annual Salary: $%.2f%n", employee1, employee1.getAnnualSalary());
        System.out.printf("%s - Annual Salary: $%.2f%n", employee2, employee2.getAnnualSalary());

    }
}
