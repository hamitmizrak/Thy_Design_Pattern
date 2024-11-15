package com.hamitmizrak.thy_design_pattern._3_behavior_a2_all_observable;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface _1_IObserver {
    void update(String message);
} // end interface IObserver

// ConcreateObserver Class (User: Kullanıcı)
class UserObserver implements _1_IObserver {

    // Field
    private String userName;

    // Parametreli Cosntructor
    public UserObserver(String userName) {
        this.userName = userName;
    }

    // @Override => Observer Interface
    @Override
    public void update(String message) {
        System.out.println("Push Notification: " + userName + " : " + message);
    }

    // GETTER AND SETTER
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}  //end class UserObserver

///////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////

// Subject Interface
interface ISubject {
    void subscribe(_1_IObserver iObserver); // Abone OL

    void unsubscribe(_1_IObserver iObserver); // Abone ÇIKAR

    void notifyObservers(String message); // Message
} //end interface ISubject


// NotificationService
class NotificationService implements ISubject {

    // List
    private List<_1_IObserver> observerDataList = new ArrayList<>();

    // ABONE OL
    @Override
    public void subscribe(_1_IObserver iObserver) {
        observerDataList.add(iObserver);
        System.out.println("Abone olundu: " + ((UserObserver) iObserver).getUserName());
    }

    // ABONE ÇIKAR
    @Override
    public void unsubscribe(_1_IObserver iObserver) {
        observerDataList.remove(iObserver);
        System.out.println("Abonelikten çıkarıldı: " + ((UserObserver) iObserver).getUserName());
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

///////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
// PSVM
public class ObserverPatternExampleMainTest {

    // PSVM
    public static void main(String[] args) {

        // Notifacation Service Ekle
        NotificationService notificationService = new NotificationService();

        // Kullanıcılar Ekle
        _1_IObserver user1 = new UserObserver("user1");
        _1_IObserver user2 = new UserObserver("user2");
        _1_IObserver user3 = new UserObserver("user3");

        // ++ 2 tane Kullanıcı Abone Oldu.
        notificationService.subscribe(user1);
        notificationService.subscribe(user2);
        System.out.println();

        // Bildirim Gönder (1)
        notificationService.sendNotification("Yeni haber -1 ");
        System.out.println();

        // -- 2 Kullanıcıdan 1 Tanesi Ablonelikten Çıktı
        notificationService.unsubscribe(user2);
        System.out.println();

        // Bildirim Gönder (2-3)
        notificationService.sendNotification("Yeni haber -2 ");
        notificationService.sendNotification("Yeni haber -3 ");
        System.out.println();

        // ++ Yeni Bir Üye Kayıt Oldu
        notificationService.subscribe(user3);
        System.out.println();

        // Bildirim Gönder (4-5)
        notificationService.sendNotification("Yeni haber -4 ");
        notificationService.sendNotification("Yeni haber -5 ");

    } //end PSVM
} // end ObserverPatternExampleMainTest
