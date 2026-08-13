public class Account
{
    private final String accountNumber;
    private String ownerName;
    private long balance;
    private boolean active;

    private static long accountCounter = 0;

    private static String generateAccountNumber()
    {
        accountCounter++;

        return "AC" + String.format("%04d", accountCounter);
    }

    public Account(String ownerName, long balance)
    {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = balance;
        this.active = true;
    }

    public Account(String ownerName)
    {
        this(ownerName, 0);
    }

    public void deposit(long amount)
    {
        balance = balance + amount;
    }

    public boolean withdraw(long amount)
    {
        if(balance >= amount)
        {
            balance = balance - amount;
            return true;
        }

        return false;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public long getBalance()
    {
        return balance;
    }

    public boolean isActive()
    {
        return active;
    }
}