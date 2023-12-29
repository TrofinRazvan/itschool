package ro.itschool.sessions.session12.parkingapp;

import ro.itschool.sessions.session12.CarUtils;

import java.time.LocalDateTime;

public class LargeCar extends CarUtils implements Fee {

    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {
        System.out.println("Large car pay maximum fee.");
    }

    public boolean hasSubscription() {
        return false;
    }
}