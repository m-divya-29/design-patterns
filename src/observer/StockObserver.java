package observer;

public class StockObserver implements IObserver{
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private static int observerCounter = 0;
    private int observerID;
    private ISubject stockGrabber;
    StockObserver(ISubject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerCounter;
        System.out.println("New observer: "+(observerID));
        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printAllPrices();
    }
    private void printAllPrices(){
        System.out.println(observerID+"\nIBM: "+ibmPrice+"\nApple: "+aaplPrice
                    +"\nGoogle: "+googPrice);
    }
}
