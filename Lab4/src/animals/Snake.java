package animals;

public class Snake extends Animal {
    public Snake() {
        this.legs = 0;
    }
    public String getDescription() {
        return "Jestem Snejkiem";
    }
    public void makeSound() {
        System.out.println("sssSSSss");
    }
}
