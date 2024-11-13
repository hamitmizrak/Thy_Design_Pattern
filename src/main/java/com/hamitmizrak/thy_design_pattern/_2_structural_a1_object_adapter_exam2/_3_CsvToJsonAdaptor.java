package com.hamitmizrak.thy_design_pattern._2_structural_a1_object_adapter_exam2;

// 3- Adaptör Sınıfını (Object Adapter)
class _3_CsvToJsonAdaptor implements _1_JsonVeriOkuyucusu {

    // Field
    private _2_CsvOkuyucusu csvOkuyucusu;

    // Parametreli constructor
    public _3_CsvToJsonAdaptor(_2_CsvOkuyucusu csvOkuyucusu) {
        this.csvOkuyucusu = csvOkuyucusu;
    }

    @Override
    public void jsonOku(String jsonVeri) {
        // CSV verisini okusun JSON formatına dönüştürsün
        String csvVerisi = csvOkuyucusu.csvOku(jsonVeri);
        String[] satir= csvVerisi.split("\n");
        StringBuilder json=new StringBuilder("[");
        for (int i = 1; i < satir.length; i++) {
            String[] sutunlar= satir[i].split(",");
            json.append("{\"name\":\"").append(sutunlar[0]).append("\", \"city\":").append(sutunlar[1]).append("}");
            if (i<satir.length-1) {
                json.append(",");
            } //end if
        } //end for

        json.append("]");
        System.out.println("Jspn formatındaki verimiz: "+json.toString());
    } //end jsonOku

} //end _3_CsvToJsonAdaptor
