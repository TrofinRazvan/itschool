package ro.itschool.session.session12.parkingapp;

import ro.itschool.session.session12.CarUtils;

import java.time.LocalDateTime;

public class SmallCar extends CarUtils implements Fee {

    public void basePayment(LocalDateTime timeIn, LocalDateTime timeOut) {
        double noOfHours = 10;
        double smallCarFee = FeeUtils.SMALL_CAR_FEE;
        System.out.println("Small car pay minimun fee.");
    }

    public boolean hasSubscription() {
        return false;
    }
}
