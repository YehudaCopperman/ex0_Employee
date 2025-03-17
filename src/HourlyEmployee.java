public class HourlyEmployee extends Employee {
    private int hours; // Weekly working hours
    private float wage; // Hourly wage

    // Constructor with all fields
    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    // Default constructor
    public HourlyEmployee() {
        super(); // Calls the default constructor of Employee
        this.hours = 0;
        this.wage = 0;
    }

    // Getters
    public int getHours() {
        return hours;
    }

    public float getWage() {
        return wage;
    }

    // Setters with validation checks
    public void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Number of hours cannot be negative");
        }
        this.hours = hours;
    }

    public void setWage(float wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Hourly wage cannot be negative");
        }
        this.wage = wage;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", hours=" + hours + ", wage=" + wage;
    }

    // Override the equals method
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // Compares the Employee part
        if (obj instanceof HourlyEmployee) {
            HourlyEmployee other = (HourlyEmployee) obj;
            return this.hours == other.hours && this.wage == other.wage;
        }
        return false;
    }

    // Implementing the earnings method
    @Override
    public double earnings() {
        return hours * wage;
    }
}

