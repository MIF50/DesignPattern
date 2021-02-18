package com.MIF50.mediator;

public class ArticlesDialogBox extends DialogBox {

    private final ListBox articlesListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
//        articlesListBox.setSelection("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnable());
    }

    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox)
            articlesSelected();
        else if (control == titleTextBox)
            titleChanged();
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
