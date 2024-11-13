package com.hamitmizrak.thy_design_pattern._2_structural_a1_object_adapter_exam2;

public class _4_Adapter_MainTest {

    public static void main(String[] args) {
        _2_CsvOkuyucusu csvOkuyucusu = new _2_CsvOkuyucusu();
        _1_JsonVeriOkuyucusu jsonVeriOkuyucusu= new _3_CsvToJsonAdaptor(csvOkuyucusu);
        jsonVeriOkuyucusu.jsonOku("veriler.csv");
    }
}
