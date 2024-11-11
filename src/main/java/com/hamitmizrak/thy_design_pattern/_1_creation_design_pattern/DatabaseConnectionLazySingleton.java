package com.hamitmizrak.thy_design_pattern._1_creation_design_pattern;

import java.sql.Connection;
import java.sql.DriverManager;

// Veri tabanı bağlantısını sistem  kaynakları çok yoğun bir şekilde kullanıdğı için
// her seferinde yeni bir bağlantı instance(new) oluşturmadan tek bir bağlantı olmasını sağlayacağız.
public class DatabaseConnectionLazySingleton {

    // Database Connection
    private Connection connection;

    // Instance
    private static DatabaseConnectionLazySingleton instance;

    // Parametresiz Constructor()
    private DatabaseConnectionLazySingleton(){
        // Veritabanı bağlantısını
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "user","root");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // Lazy Singleton Design Pattern
    //Eğer instance yoksa oluştur(new)
    public static DatabaseConnectionLazySingleton getInstance(){
        if(instance == null){
            instance = new DatabaseConnectionLazySingleton();
        }
        return instance;
    }

    // Connection Get
    public Connection getConnection(){
        return this.connection;
    }

}
