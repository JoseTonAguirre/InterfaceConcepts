public class TestMachine
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("---------------------------------");
        System.out.println("Welcome to Jose's Arcade Machine!");
        System.out.println("---------------------------------" + "\n");
        ArcadeMachine arcadeMachine = new ArcadeMachine();
        Person person = new Person(5);

        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);
        person.insertCoin(arcadeMachine);
    }
}
