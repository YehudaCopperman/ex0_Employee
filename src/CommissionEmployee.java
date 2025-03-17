// CommissionEmployee class
public class CommissionEmployee extends Employee {
    private float grossSales; // Sales made by the employee
    private int commission; // Commission percentage

    // Constructor with all fields
    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommission(commission);
    }

    // Default constructor
    public CommissionEmployee() {
        super(); // Calls the default constructor of Employee
        this.grossSales = 0;
        this.commission = 0;
    }

    // Getters and Setters with validation checks
    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        if (commission < 0 || commission > 100) {
            throw new IllegalArgumentException("Commission must be between 0 and 100");
        }
        this.commission = commission;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", gross sales=" + grossSales + ", commission=" + commission;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj instanceof CommissionEmployee other) {
            return this.grossSales == other.grossSales && this.commission == other.commission;
        }
        return false;
    }

    // Implement earnings method
    @Override
    public double earnings() {
        return (commission / 100.0) * grossSales;
    }
}


