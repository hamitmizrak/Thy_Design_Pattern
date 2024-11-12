package com.hamitmizrak.thy_design_pattern._1_creation_a1_singleton;

// Log işlemlerinde bir uygulamanın merkezi bir log yönetimine ihtiyaç duyarsak
// Uygulamada aynı log yöneim nesnesini kullanmak istiyorsak
public class LazySingletonLogger {

    // Instance
    private static LazySingletonLogger instance;

    // Private Constructor
    private LazySingletonLogger() {}

    // Eğer nesne daha önceden oluşturulmamışsa aynı nesneyi kullan yoksa eskisini kullana
    public static LazySingletonLogger getInstance(){
        if(instance == null){
            instance = new LazySingletonLogger();
        }
        return instance;
    }

    // Mesajı dönder
    public void log(String message){
        System.out.println("Log: "+message);
    }
}
