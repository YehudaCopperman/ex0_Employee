// BasePlusCommissionEmployee class
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary; // Base salary of the employee

    // Constructor with all fields
    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        setBaseSalary(baseSalary);
    }

    // Default constructor
    public BasePlusCommissionEmployee() {
        super(); // Calls the default constructor of CommissionEmployee
        this.baseSalary = 0;
    }

    // Getter and Setter with validation checks
    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", base salary=" + baseSalary;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj instanceof BasePlusCommissionEmployee) {
            BasePlusCommissionEmployee other = (BasePlusCommissionEmployee) obj;
            return this.baseSalary == other.baseSalary;
        }
        return false;
    }

    // Implement earnings method
    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}

