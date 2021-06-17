package com.MIF50.behavioural.strategy.exercise.encypt;

public class AesEncryption implements Encryption {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
