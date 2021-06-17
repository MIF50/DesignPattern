package com.MIF50.behavioural.template;

public class Demo {

    public static void main(String[] args) {
        var task = new TransferMoneyTask(new AuditTrail());
        task.execute();
    }
}
