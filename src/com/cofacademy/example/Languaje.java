package com.cofacademy.example;

public interface Languaje  {
    void sayHi();

    default void sayBye(){
        System.out.println("Say");
    }
}
