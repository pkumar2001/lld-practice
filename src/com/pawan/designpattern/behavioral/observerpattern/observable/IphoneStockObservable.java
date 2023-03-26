package com.pawan.designpattern.behavioral.observerpattern.observable;

import com.pawan.designpattern.behavioral.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver notificationAlertObserver: notificationAlertObservers){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStocksAdded) {
        this.stockCount+=newStocksAdded;
        this.notifyObservers();
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
