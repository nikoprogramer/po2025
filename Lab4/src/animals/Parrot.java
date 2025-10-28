package animals;

public class Parrot extends Animal {
    public Parrot() {
        this.legs = 2;
    }
    public String getDescription() {
        return "Jestem papuga";
    }
    public void makeSound() {
        System.out.println("Musi sie udac");
    }
}
