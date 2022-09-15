package singleton;

public class Dog extends Animal{
    Dog(){
        setSound("Bark");
        flyType = new CantFly();
    }
}
