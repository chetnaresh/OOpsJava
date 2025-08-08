package ZooManagement;

public class Zoo {
    public static void main(String[] args) {
        Animal a1 = new Lion("Simba", 80);
        Animal a2 = new Elephant("Dumbo", 90);
        Animal a3 = new Monkey("George", 70);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();

        System.out.println("\n--- Feeding and Sleeping ---");
        a1.eat();
        a2.sleep();
        a3.eat();
        a3.sleep();

        System.out.println("\n--- Status Report ---");
        a1.displayStatus();
        a2.displayStatus();
        a3.displayStatus();

        System.out.println("\n--- Waking Animals ---");
        a2.wakeUp();
        a3.wakeUp();
    }
}
