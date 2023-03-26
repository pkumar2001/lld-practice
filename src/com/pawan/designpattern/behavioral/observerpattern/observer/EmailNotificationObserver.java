package com.pawan.designpattern.behavioral.observerpattern.observer;

import com.pawan.designpattern.behavioral.observerpattern.observable.StockObservable;

public class EmailNotificationObserver implements NotificationAlertObserver{
    String email;

    StockObservable stockObservable;

    public EmailNotificationObserver(StockObservable stockObservable, String email){
        this.stockObservable = stockObservable;
        this.email = email;
    }
    @Override
    public void update() {
        sendEmail("Hurry up....product is in stock");
    }

    void sendEmail(String message){
        System.out.println("mail sent to :"+ email+ " with message: "+ message);
    }
}
