package com.MIF50.structural.decorator;

public class Demo {

    public static void main(String[] args) {

        storeCredit(new EncryptedCloudStream(new CompressCloudStream(new CloudStream())));
    }

    public static void storeCredit(Stream stream) {
        stream.write("1238-3427-1235-2323");
    }
}
