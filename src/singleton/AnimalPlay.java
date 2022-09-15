package singleton;

public class AnimalPlay {
    public static void main(String[] args) {
        Animal tommy = new Dog();
        Animal tweety = new Bird();
        System.out.println(tommy.tryToFly());
        System.out.println(tweety.tryToFly());
    }
}
