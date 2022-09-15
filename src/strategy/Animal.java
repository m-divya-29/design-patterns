package strategy;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String sound;
    private double speed;
    public Flys flyType;
    Animal(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String tryToFly(){
        return flyType.fly();
    }
    public void setFlyType(Flys newFlyType){
        flyType = newFlyType;
    }
}
