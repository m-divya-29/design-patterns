package observer;

public class StocksPlay {
    public static void main(String[] args) {

        StockGrabberSubject stockGrabberSubject =
                new StockGrabberSubject();
        StockObserver observer1 =
                new StockObserver(stockGrabberSubject);
        stockGrabberSubject.setAaplPrice(100);
        stockGrabberSubject.setGoogPrice(200);
        stockGrabberSubject.setIbmPrice(90);

        StockObserver observer2 =
                new StockObserver(stockGrabberSubject);

        stockGrabberSubject.setAaplPrice(101);
        stockGrabberSubject.setGoogPrice(201);
        stockGrabberSubject.setIbmPrice(91);

        stockGrabberSubject.unregister(observer2);


    }
}
