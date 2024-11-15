package com.hamitmizrak.thy_design_pattern._3_behavior_a2_single_observable;

import java.util.ArrayList;
import java.util.List;

// NotificationService
public class _4_NotificationService implements _3_ISubject {

    // List
    private List<_1_IObserver> observerDataList = new ArrayList<>();

    // ABONE OL
    @Override
    public void subscribe(_1_IObserver iObserver) {
        observerDataList.add(iObserver);
        System.out.println("Abone olundu: " + ((_2_UserObserver) iObserver).getUserName());
    }

    // ABONE ÇIKAR
    @Override
    public void unsubscribe(_1_IObserver iObserver) {
        observerDataList.remove(iObserver);
        System.out.println("Abonelikten çıkarıldı: " + ((_2_UserObserver) iObserver).getUserName());
    }

    // NOTITFY
    @Override
    public void notifyObservers(String message) {
        for (_1_IObserver iObserver : observerDataList) {
            iObserver.update(message);
        }
    }

    // NOTIFICATION PUSH
    public void sendNotification(String message) {
        System.out.println("Yeni Bildirim: " + message);
        notifyObservers(message);
    }
} //end class NotificationService
