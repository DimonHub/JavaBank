import java.util.Scanner;

class Client {
    private String firstName;
    private String lastName;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

class Account {
    private String accountType;
    private Client owner;

    public Account(String accountType, Client owner) {
        this.accountType = accountType;
        this.owner = owner;
    }

    public String getAccountType() {
        return accountType;
    }

    public Client getOwner() {
        return owner;
    }

    public String toString() {
        return "Typ konta: " + accountType + ", wlasciciel: " + owner.toString();
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie danych od użytkownika
        System.out.print("Imie Klienta: ");
        String firstName = scanner.nextLine();
        System.out.print("Nazwisko Klienta: ");
        String lastName = scanner.nextLine();
        System.out.println("Wybierz typ konta:");
        System.out.println("1 - Osobiste");
        System.out.println("2 - Oszczędnościowe");
        int choice = scanner.nextInt();
        String accountType;

        switch (choice) {
            case 1:
                accountType = "Osobiste";
                break;
            case 2:
                accountType = "Oszczednosciowe";
                break;
            default:
                System.out.println("Niepoprawny wybór, konto zostanie ustawione na 'Osobiste'.");
                accountType = "Osobiste";
        }

        // Tworzenie obiektów
        Client client = new Client(firstName, lastName);
        Account account = new Account(accountType, client);

        // Wyświetlanie informacji
        System.out.println(client.getFirstName() + " " + client.getLastName() + " zalozyl " + account.toString());

        // Zamknięcie skanera
        scanner.close();
    }
}