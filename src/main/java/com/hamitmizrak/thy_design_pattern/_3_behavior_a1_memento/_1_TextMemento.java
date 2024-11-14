package com.hamitmizrak.thy_design_pattern._3_behavior_a1_memento;

public class _1_TextMemento {

    // Field
    private final String text;

    // Parametreli Constructor
    public _1_TextMemento(String text) {
        this.text = text;
    }

    // Sadece GETTER
    public String getText() {
        return text;
    }
}
