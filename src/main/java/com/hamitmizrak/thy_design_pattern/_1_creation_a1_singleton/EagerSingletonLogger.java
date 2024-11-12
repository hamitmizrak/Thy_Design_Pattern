package com.hamitmizrak.thy_design_pattern._1_creation_a1_singleton;

// Log işlemlerinde bir uygulamanın merkezi bir log yönetimine ihtiyaç duyarsak
// Uygulamada aynı log yöneim nesnesini kullanmak istiyorsak
public class EagerSingletonLogger {

    // Instance
    private static final EagerSingletonLogger instance= new EagerSingletonLogger();

    // Private Constructor
    private EagerSingletonLogger() {}

    // Eğer nesne daha önceden oluşturulmamışsa aynı nesneyi kullan yoksa eskisini kullana
    public static EagerSingletonLogger getInstance(){
        return instance;
    }

    // Mesajı dönder
    public void log(String message){
        System.out.println("Log: "+message);
    }
}
