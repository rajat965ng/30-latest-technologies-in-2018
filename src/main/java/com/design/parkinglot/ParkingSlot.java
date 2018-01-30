package parkinglot;

public class ParkingSlot {

    private int slotNumber;
    private Vehicle vehicle;
    private ParkingLevel parkingLevel;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingLevel getParkingLevel() {
        return parkingLevel;
    }

    public void setParkingLevel(ParkingLevel parkingLevel) {
        this.parkingLevel = parkingLevel;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        if (isOccupied()){
            this.vehicle.getSlot().add(this);
        }
    }

    public boolean isOccupied() {
        return this.vehicle instanceof Vehicle;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotNumber=" + slotNumber +
                ", vehicle=" + vehicle +
                '}';
    }
}
