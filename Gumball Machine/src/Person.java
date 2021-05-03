public class Person
{
    private int coins;

    public Person(int coins)
    {
        this.coins = coins;
    }
    public void insertCoin(Coinable coinable, int c)
    {
        System.out.println(c + " Coins inserted");
        coins = coins-2;
        if (!coinable.insertCoin())
        {
            coins++;
            System.out.println("Coin refunded");
        }
        System.out.println("Coin count : " + coins);
        System.out.println("---------------------");
    }

}