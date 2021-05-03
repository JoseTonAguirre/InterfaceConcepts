public class ArcadeMachine implements Coinable, Dispensable
{
    int coins;

    public ArcadeMachine()
    {
        this.coins = 0;
    }

    @Override
    public void dispense()
    {
        // TODO Auto-generated method stub
        System.out.println("Ready to play!");
        System.out.println("LOADING...");
        System.out.println("GAME OVER. Try again?");
        System.out.println("-------------" + "\n");
        coins++;
    }

    @Override
    public void reload(int count)
    {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean insertCoin()
    {
        // TODO Auto-generated method stub
        System.out.println("-------------");
        System.out.println("Coin Inserted");
        System.out.println("-------------");
        this.dispense();
        return false;
    }
}
