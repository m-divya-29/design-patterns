package observer;

import java.util.ArrayList;

public class StockGrabberSubject implements ISubject {
    double ibmPrice;
    double aaplPrice;
    double googPrice;
    ArrayList<IObserver> observers;
    StockGrabberSubject(){
        observers = new ArrayList<>();
    }
    public void register(IObserver newObs) {
        observers.add(newObs);
    }

    public void unregister(IObserver delObs) {
        int index = observers.indexOf(delObs);
        System.out.println("Deleted " + (index + 1) + " observer");
        observers.remove(index);
    }
    //Updates all observers
    public void notifyObserver() {
        for(IObserver obs : observers){
            obs.update(ibmPrice, aaplPrice, googPrice);
        }
    }
// For any change to any of the stock update all the observers.
    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }

}
