package ro.itschool.sessions.session12.parkingapp;

import ro.itschool.sessions.session12.CarUtils;

import java.time.LocalDateTime;

public class MediumCar extends CarUtils implements Fee {

    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {
        System.out.println("Medium car pay medium fee.");
    }

    public boolean hasSubscription() {
        return false;
    }
}