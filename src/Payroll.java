// Payroll class with main method
public class Payroll {
    public static void main(String[] args) {
        // Create an array to hold 3 employees
        Employee[] employees = new Employee[3];

        // Initialize employees
        employees[0] = new HourlyEmployee("John", "Doe", 1, 40, 20);
        employees[1] = new CommissionEmployee("Jane", "Smith", 2, 10000, 10);
        employees[2] = new BasePlusCommissionEmployee("Alex", "Brown", 3, 15000, 5, 500);

        // Print employee details and earnings
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Earnings: " + employee.earnings());

            // If the employee is BasePlusCommissionEmployee, add a 10% bonus to their earnings
            if (employee instanceof BasePlusCommissionEmployee basePlusEmployee) {
                double bonus = basePlusEmployee.earnings() * 0.10; // 10% bonus
                System.out.println("Bonus: " + bonus);
            }
            System.out.println();
        }
    }
}
