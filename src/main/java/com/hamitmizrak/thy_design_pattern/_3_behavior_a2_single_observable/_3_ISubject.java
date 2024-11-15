package com.hamitmizrak.thy_design_pattern._3_behavior_a2_single_observable;

// Subject Interface
interface _3_ISubject {
    void subscribe(_1_IObserver iObserver); // Abone OL

    void unsubscribe(_1_IObserver iObserver); // Abone ÇIKAR

    void notifyObservers(String message); // Message
} //end interface ISubject