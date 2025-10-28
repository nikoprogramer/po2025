package animals;

public class Dog extends Animal {
    public Dog() {
        this.legs = 4;
    }
    public String getDescription()
    {
        return "Jestem Dogiem";
    }
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
