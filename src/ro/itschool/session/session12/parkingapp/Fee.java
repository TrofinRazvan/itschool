package ro.itschool.session.session12.parkingapp;

import java.time.LocalDateTime;


    interface Fee {
        void basePayment(LocalDateTime timeIn, LocalDateTime tineOut);
        boolean hasSubscription();
    }

