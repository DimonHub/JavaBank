package bank;

public class Account {
    private AccountType accountType; // Zmiana typu na AccountType
    private Client owner;
    private Employee createdBy;

    public Account(AccountType accountType, Client owner, Employee createdBy) {
        this.accountType = accountType;
        this.owner = owner;
        this.createdBy = createdBy;
    }

    public String toString() {
        return "Typ konta: " + accountType + ", wlasciciel: " + owner + ", zalozone przez: " + createdBy;
    }
}
