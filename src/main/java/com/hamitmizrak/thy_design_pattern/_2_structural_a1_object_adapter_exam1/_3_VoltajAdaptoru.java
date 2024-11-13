package com.hamitmizrak.thy_design_pattern._2_structural_a1_object_adapter_exam1;

// 3- Adaptör Sınıfını (Object Adapter)
public class _3_VoltajAdaptoru implements _1_IElektrikCihaz {

    // Field
    private _2_AbdPrizi abdPrizi;

    // parametreli constructor
    public _3_VoltajAdaptoru(_2_AbdPrizi abdPrizi) {
        this.abdPrizi = abdPrizi;
    }

    @Override
    public void calistir() {
        int voltaj = abdPrizi.voltajSagla();
        System.out.println("Adaptör kullanılarak cihaz " + voltaj + " volt ile çalıştırılıyor.");
    } // end Override

} // end _3_VoltajAdaptoru
