public class GumballMachine implements Coinable, Dispensable
{
    int gums = 0;

    public GumballMachine() {
        this.gums= 11;
    }

    @Override
    public boolean insertCoin()
    {
        // TODO Auto-generated method stub
        if (this.gums > 0)
        {
            this.dispense();
            return true;
        }
        System.out.println("Return Coin");
        return false;
    }

    @Override
    public void dispense ()
    {
        // TODO Auto-generated method stub
        this.gums--;
        System.out.println("1 Gum Dispensed");

    }

    @Override
    public void reload(int count)
    {
        // TODO Auto-generated method stub
        this.gums += count;
    }


}
