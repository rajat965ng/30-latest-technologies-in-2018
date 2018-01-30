package com.design.parkinglot;

public class ParkingApp {

    public static void main(String[] args) {

        Vehicle bike = new Bike("1111");
        Vehicle car = new Car("2222");
        Vehicle truck = new Truck("3333");

        Vehicle truckMore = new Truck("4444");


        ParkingLevel level = new ParkingLevel(1);
        level.parkVehicle(car);
        level.parkVehicle(bike);
        level.parkVehicle(truck);

        System.out.println(level);
        level.parkVehicle(truckMore);
        System.out.println(level);

        truck.unpark();

        System.out.println(level);

        level.parkVehicle(truckMore);
        System.out.println(level);

        car.unpark();

        System.out.println(level);
        bike.unpark();

        System.out.println(level);

    }
}
