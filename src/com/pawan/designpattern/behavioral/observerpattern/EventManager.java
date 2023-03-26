package com.pawan.designpattern.behavioral.observerpattern;

import com.pawan.designpattern.behavioral.observerpattern.observable.IphoneStockObservable;
import com.pawan.designpattern.behavioral.observerpattern.observable.StockObservable;
import com.pawan.designpattern.behavioral.observerpattern.observer.EmailNotificationObserver;
import com.pawan.designpattern.behavioral.observerpattern.observer.NotificationAlertObserver;
import com.pawan.designpattern.behavioral.observerpattern.observer.SmsNotificationAlertObserver;

public class EventManager {
    public static void main(String[] args){
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver notificationAlertObserver1 = new EmailNotificationObserver(iphoneStockObservable, "pavannagar71@gmail.com");
        NotificationAlertObserver notificationAlertObserver2 = new SmsNotificationAlertObserver(iphoneStockObservable, "7023291681");

        iphoneStockObservable.add(notificationAlertObserver1);
        iphoneStockObservable.add(notificationAlertObserver2);

        iphoneStockObservable.setStockCount(5);;
    }
}
