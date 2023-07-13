import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dob;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dob = dateOfBirth;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Deposit
    public void deposit(double amount) {
            balance += amount;
    }

    // Withdrawal
    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    // Pay Interest
    public void payInterest(double intrest) {
        if (intrest >= 0) {
            double interest = balance * (intrest / 100);
            balance += interest;
        }
    }
}
