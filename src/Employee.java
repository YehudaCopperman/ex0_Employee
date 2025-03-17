/**
 * Represents an abstract Employee with basic details such as name and ID.
 * This class provides common attributes and behaviors for all employees.
 */
public abstract class Employee {

    /** The first name of the employee. */
    private String FirstName;

    /** The last name of the employee. */
    private String LastName;

    /** The unique ID of the employee. */
    private int Id;

    /**
     * Constructs an Employee with specified details.
     *
     * @param FirstName The first name of the employee.
     * @param LastName The last name of the employee.
     * @param Id The unique identifier for the employee.
     */
    public Employee(String FirstName, String LastName, int Id) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Id = Id;
    }

    /**
     * Constructs an Employee with default values.
     * Default name: "Plony Almony", Default ID: 0.
     */
    public Employee() {
        this.FirstName = "Plony";
        this.LastName = "Almony";
        this.Id = 0;
    }

    /**
     * Gets the first name of the employee.
     *
     * @return The first name of the employee.
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Sets the first name of the employee.
     *
     * @param firstName The new first name of the employee.
     */
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    /**
     * Gets the last name of the employee.
     *
     * @return The last name of the employee.
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lastName The new last name of the employee.
     */
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    /**
     * Gets the unique ID of the employee.
     *
     * @return The ID of the employee.
     */
    public int getId() {
        return Id;
    }

    /**
     * Sets the unique ID of the employee.
     *
     * @param id The new ID of the employee.
     */
    public void setId(int id) {
        this.Id = id;
    }

    /**
     * Returns a string representation of the employee.
     *
     * @return A string describing the employee.
     */
    @Override
    public String toString() {
        return "Employee{" + "first name is " + FirstName + '\'' +
                ", last name is " + LastName + '\'' +
                ", id is " + Id +
                '}';
    }

    /**
     * Compares this employee with another object for equality.
     *
     * @param obj The object to compare with.
     * @return {@code true} if the objects are equal, otherwise {@code false}.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Id == employee.Id &&
                FirstName.equals(employee.FirstName) &&
                LastName.equals(employee.LastName);
    }

    /**
     * Calculates the earnings of the employee.
     * This method must be implemented by subclasses.
     *
     * @return The earnings of the employee.
     */
    public abstract double earnings();
}

