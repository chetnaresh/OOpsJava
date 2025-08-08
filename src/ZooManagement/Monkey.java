package ZooManagement;
class Monkey extends Animal {
    public Monkey(String name, int health) {
        super(name, health);
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey chatters: Ooh-ooh-aah-aah!");
    }
}
