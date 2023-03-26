package com.pawan.designpattern.behavioral.observerpattern.observer;

import com.pawan.designpattern.behavioral.observerpattern.observable.StockObservable;

public class SmsNotificationAlertObserver implements NotificationAlertObserver{

    String mobileNo;
    StockObservable stockObservable;

    public SmsNotificationAlertObserver(StockObservable stockObservable, String mobileNo){
        this.stockObservable = stockObservable;
        this.mobileNo = mobileNo;
    }
    @Override
    public void update() {
        sendSMS("Hurry up...product is in stock");
    }

    void sendSMS(String message){
        System.out.println("SMS sent to: "+mobileNo+" with message: "+message);
    }
}
