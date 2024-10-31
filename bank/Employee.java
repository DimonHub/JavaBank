package bank;

public class Employee {
    private static Employee instance;
    private final String firstName;
    private final String lastName;


    private Employee() {
        this.firstName = EmployeeConstants.FIRST_NAME;
        this.lastName = EmployeeConstants.LAST_NAME;
    }


    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }
        return instance;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}