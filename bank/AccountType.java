package bank;

public enum AccountType {
    OSOBISTE("Osobiste"),
    OSZCZEDNOSCIOWE("Oszednosciowe");

    private final String displayName;

    AccountType(String displayName) {
        this.displayName = displayName;
    }


    public String toString() {
        return displayName;
    }
}
