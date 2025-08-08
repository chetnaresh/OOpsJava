package ZooManagement;

class Elephant extends Animal {
    public Elephant(String name, int health) {
        super(name, health);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets: Prrrhh!");
    }
}
