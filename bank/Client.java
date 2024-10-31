package bank;

public class Client {
    private String firstName;
    private String lastName;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}