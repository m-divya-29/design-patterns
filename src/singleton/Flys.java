package singleton;

public interface Flys {
    String fly();
}

class CanFly implements Flys{
    public String fly(){
        return "Can fly";
    }
}

class CantFly implements Flys{
    public String fly(){
        return "Cannot fly";
    }
}