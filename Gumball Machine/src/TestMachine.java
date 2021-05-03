public class TestMachine {
    public static void main(String[] args)
    {
        GumballMachine gumballMachine = new GumballMachine();
        Person person = new Person (24);

        System.out.println("---------------------------------");
        System.out.println("Welcome to Jose's Gumball Machine!");
        System.out.println("---------------------------------");
        System.out.println("1 Gumball = 2 coins");
        System.out.println("----------------------");

        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
        person.insertCoin(gumballMachine, 2);
    }
}
