package ZooManagement;

class Lion extends Animal {
    public Lion(String name, int health) {
        super(name, health);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars: Roarrr!");
    }
}
