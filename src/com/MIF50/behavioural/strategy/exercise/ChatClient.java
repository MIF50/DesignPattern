package com.MIF50.behavioural.strategy.exercise;

import com.MIF50.behavioural.strategy.exercise.encypt.Encryption;

public class ChatClient {

    private final Encryption encryptionAlgorithm;

    public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
