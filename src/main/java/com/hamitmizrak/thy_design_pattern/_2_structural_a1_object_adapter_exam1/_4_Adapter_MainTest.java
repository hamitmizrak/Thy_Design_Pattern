package com.hamitmizrak.thy_design_pattern._2_structural_a1_object_adapter_exam1;

public class _4_Adapter_MainTest {

    public static void main(String[] args) {
        _2_AbdPrizi abdPrizi = new _2_AbdPrizi();
        _1_IElektrikCihaz iElektrikCihaz= new _3_VoltajAdaptoru(abdPrizi);

        // Adapter üzerinden çalışan cihaz
        iElektrikCihaz.calistir();
    }
}
