package com.hamitmizrak.thy_design_pattern._3_behavior_a1_memento;

public class _2_TextEditor {

    // Field
    private String text;

    // Method
    // Memento nesnesini oluştur ve mevcut durumu kaydettim
    public _1_TextMemento save(){
        return new _1_TextMemento(text);
    }

    // Memento nesnesinden eski durumuna geri yüklemek(dönmek)
    public void restore(_1_TextMemento memento){
        this.text = memento.getText();
    }

    // GETTER AND SETTER
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
