//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public abstract class Employee
{
    private String FirstName;
    private String LastName;
    private int Id;

    // Constructor with parameters
    public Employee(String FirstName, String LastName, int Id) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Id = Id;
    }

    // Default constructor
    public Employee() {
        this.FirstName = "Plony";
        this.LastName = "Almony";
        this.Id = 0;
    }

    // Getter & Setters
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName){
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName){
        this.LastName = lastName;
    }

    public int getId(){
        return Id;
    }

    public void setId(int id){
        this.Id = id;
    }

    // Override toString method
    @Override
    public String toString(){
        return "Employee{" + "first name is " + FirstName + '\'' +
                ", last name is " + LastName + '\'' +
                ", id is " + Id +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object obj){
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

    // Abstract method for earnings
    public abstract double earnings();
}


