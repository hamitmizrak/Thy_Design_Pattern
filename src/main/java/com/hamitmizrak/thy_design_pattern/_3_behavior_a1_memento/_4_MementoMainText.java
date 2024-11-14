package com.hamitmizrak.thy_design_pattern._3_behavior_a1_memento;

public class _4_MementoMainText {

    public static void main(String[] args) {
        _2_TextEditor editor = new _2_TextEditor();
        _3_TextEditorHistory history = new _3_TextEditorHistory();

        // 1.Durum
        editor.setText("Java Öğreniyorum");
        history.save(editor.save());

        // 2.Durum
        editor.setText("Python Öğreniyorum");
        history.save(editor.save());

        // 3.Durum
        editor.setText("Şu andaki Durum C# Öğreniyorum");
        System.out.println("Metin: "+editor.getText());

        // Geri Alma işlemi (1 adım önceki Durum)
        editor.restore(history.undo());
        System.out.println("1 adım Geri Alındı: "+editor.getText());

        // Geri Alma işlemi (2 adım önceki Durumu)
        editor.restore(history.undo());
        System.out.println("2 adım Geri Alındı: "+editor.getText());


    }
}
