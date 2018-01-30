package com.design.parkinglot;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private VehicleType vehicleType;
    private String numberPlate;
    private List<ParkingSlot> slot;

    public Vehicle(VehicleType vehicleType, String numberPlate) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.slot = new ArrayList<>(vehicleType.getSlotSize());
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public List<ParkingSlot> getSlot() {
        return slot;
    }

    public void setSlot(List<ParkingSlot> slot) {
        this.slot = slot;
    }

    public void unpark(){
        System.out.println("Unparking Vehicle:"+numberPlate);
        for (ParkingSlot s:slot){
            s.setVehicle(null);
        }
        this.setSlot(null);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType=" + vehicleType +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }
}
