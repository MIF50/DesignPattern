package com.MIF50.mediator.exercise;


public class SignUpDialogBox {

    private final TextBox username = new TextBox();
    private final TextBox password = new TextBox();
    private final CheckBox checkBox = new CheckBox();
    private final Button login = new Button();

    public SignUpDialogBox() {
        username.addEventHandler(this::controlChanged);
        password.addEventHandler(this::controlChanged);
        checkBox.addEventHandler(this::controlChanged);
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + login.isEnabled());

        // The user enters their username, the button is still disabled
        username.setContent("username");
        System.out.println("After setting the username: " + login.isEnabled());

        // The user enters their password, the button is still disabled
        password.setContent("password");
        System.out.println("After setting the password: " + login.isEnabled());

        // The agrees to the terms, the button becomes enabled
        checkBox.setChecked(true);
        System.out.println("After agreeing to terms: " + login.isEnabled());

        // The user removes the password, the button becomes disabled
        password.setContent("");
        System.out.println("After removing the password: " + login.isEnabled());

        // The user enters the password again, the button becomes enabled
        password.setContent("password");
        System.out.println("After re-setting the password: " + login.isEnabled());

    }

    public void controlChanged() {
        login.setEnabled(isValidForm());
    }

    private boolean isValidForm() {
        var isEmptyUserName = username.getContent() == null || username.getContent().equals("");
        var isEmptyPassword = password.getContent() == null || password.getContent().equals("");
        return !isEmptyPassword && !isEmptyUserName && checkBox.isChecked();
    }
}
