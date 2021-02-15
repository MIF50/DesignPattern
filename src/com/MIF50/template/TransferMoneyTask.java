package com.MIF50.template;

public class TransferMoneyTask extends Task {

    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer money ");
    }
}
