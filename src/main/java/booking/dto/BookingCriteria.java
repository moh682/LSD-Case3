package booking.dto;

import booking.entity.Place;

import java.time.LocalDateTime;

public class BookingCriteria {


    private Place pickUpPlace;

    private Place deliveryPlace;

    private LocalDateTime pickUpTime;

    private LocalDateTime deliveryTime;

    public BookingCriteria(Place pickUpPlace, Place deliveryPlace, LocalDateTime pickUpTime, LocalDateTime deliveryTime) {
        this.pickUpPlace = pickUpPlace;
        this.deliveryPlace = deliveryPlace;
        this.pickUpTime = pickUpTime;
        this.deliveryTime = deliveryTime;
    }

    public Place getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(Place pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public Place getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(Place deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public LocalDateTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalDateTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}
