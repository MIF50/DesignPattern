package com.MIF50.mediator.obererver;

public class ArticlesDialogBox  {

    private final ListBox articlesListBox = new ListBox();
    private final TextBox titleTextBox = new TextBox();
    private final Button saveButton = new Button();

    public ArticlesDialogBox(){
        articlesListBox.addEventHandlers(this::articlesSelected);
        titleTextBox.addEventHandlers(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnable());
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }

    private void articlesSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnable(true);
    }
}
