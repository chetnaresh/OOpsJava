package ZooManagement;

abstract class Animal {
    private String name;
    private int health;
    private boolean isSleeping;

    public Animal(String name, int health) {
        this.name = name;
        this.health = health;
        this.isSleeping = false;
    }


    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating.");
        health = Math.min(health + 10, 100);
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
        isSleeping = true;
        health = Math.min(health + 20, 100);
    }

    public void wakeUp() {
        if (isSleeping) {
            System.out.println(name + " wakes up.");
            isSleeping = false;
        } else {
            System.out.println(name + " is already awake.");
        }
    }

    public void displayStatus() {
        System.out.println("Animal: " + name);
        System.out.println("Health: " + health + "%");
        System.out.println("Sleeping: " + (isSleeping ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}
