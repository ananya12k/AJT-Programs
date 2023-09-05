package Adapter_Pattern;

/**
 * The Client is implemented against the target interface.
 * The client is the class that will use the adapter.
 * The client is expecting to use an object that implements the Duck interface.
 * The client is unaware of the Turkey interface.
 * The client is passed a reference to an object that implements the Duck
 * interface.
 * The client makes calls on the target interface.
 * The adapter translates those calls into calls on the adaptee using the
 * adaptee interface.
 * The client receives the results of the call and is unaware of the adapter's
 * presence.
 * The client can't tell whether it's dealing with a target or an adapter.
 * The adapter gets an interface, the adaptee, and adapts it to look like the
 * target interface.
 * The adapter implements the target interface.
 * The adaptee is the object that is being adapted.
 * The adaptee is the object that will be adapted by the adapter.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
