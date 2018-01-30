package parkinglot;

public enum VehicleType {
    MOTORCYCLE(1),
    COMPACT(1),
    LARGE(5);

    private int slotSize;

    VehicleType(int slotSize) {
        this.slotSize = slotSize;
    }

    public int getSlotSize() {
        return slotSize;
    }

    @Override
    public String toString() {
        return "VehicleType{"+this.name() +
                ",slotSize=" + slotSize +
                '}';
    }
}
