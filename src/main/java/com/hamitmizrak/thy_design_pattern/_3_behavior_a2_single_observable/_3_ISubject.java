package com.hamitmizrak.thy_design_pattern._3_behavior_a2_single_observable;

// Subject Interface
interface _3_ISubject {
    // Abone OL
    void subscribe(_1_IObserver iObserver);

    // Abone ÇIKAR
    void unsubscribe(_1_IObserver iObserver);

    // Message (Bildirim)
    void notifyObservers(String message);
} //end interface ISubject