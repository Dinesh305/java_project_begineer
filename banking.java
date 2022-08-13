public class banking {
    private int minimum_balance = 25000;
     int getMinimumbalance()
    {
        return minimum_balance;
    }
     void setMinimumbalance(int value)
    {
    if (value> 20000)
    {
        this.minimum_balance = value;
    }

    }
}
