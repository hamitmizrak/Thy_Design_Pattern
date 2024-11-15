package com.hamitmizrak.thy_design_pattern._3_behavior_a2_single_observable;


// ConcreateObserver Class (User: Kullanıcı)
public class _2_UserObserver implements _1_IObserver {

    // Field
    private String userName;

    // Parametreli Constructor
    public _2_UserObserver(String userName) {
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
