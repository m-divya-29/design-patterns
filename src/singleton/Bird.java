package singleton;

public class Bird extends Animal {
    Bird(){
        setSound("Tweet");
        flyType = new CanFly();
    }
}
