package com.hamitmizrak.thy_design_pattern._3_behavior_a2_single_observable;

public class _5_ObserverMainTest {

    // PSVM
    public static void main(String[] args) {

        // Notifacation Service Ekle
        _4_NotificationService  notificationService = new _4_NotificationService();

        // Kullanıcılar Ekle
        _1_IObserver user1 = new _2_UserObserver("user1");
        _1_IObserver user2 = new _2_UserObserver("user2");
        _1_IObserver user3 = new _2_UserObserver("user3");

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
}
