package com.hamitmizrak.thy_design_pattern._3_behavior_a1_memento;

import java.util.Stack;

public class _3_TextEditorHistory {

    // Field
    private Stack<_1_TextMemento> history = new Stack<>();

    // O andaki durumu kaydetmek
    public void save(_1_TextMemento textMemento){
        history.push(textMemento);
    }

    // Veriyi Geri Almak
    public _1_TextMemento undo(){
        if(!history.isEmpty()){
            return history.pop();
        } return null;
    } //end _1_TextMemento

} //end _3_TextEditorHistory
