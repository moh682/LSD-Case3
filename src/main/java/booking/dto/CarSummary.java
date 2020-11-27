package booking.dto;

import booking.entity.Car;
import booking.entity.Place;

public class CarSummary {
    private Car car;
    private Place place;

    public CarSummary(){}

    public CarSummary(Car car, Place place) {
        this.car = car;
        this.place = place;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
