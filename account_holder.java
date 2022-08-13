public class account_holder {

    public static void main(String args[])
    {

        banking bb = new banking();
        int min=bb.getMinimumbalance();
        System.out.println(min);

        bb.setMinimumbalance(30000);
        min = bb.getMinimumbalance();
        System.out.println(min);
    }

}
