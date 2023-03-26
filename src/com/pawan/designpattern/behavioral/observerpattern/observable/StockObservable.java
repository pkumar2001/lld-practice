package com.pawan.designpattern.behavioral.observerpattern.observable;

import com.pawan.designpattern.behavioral.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifyObservers();
    void setStockCount(int newStocksAdded);
    int getStockCount();
}
