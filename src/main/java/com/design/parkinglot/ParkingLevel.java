package parkinglot;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParkingLevel {
    private int levelNum;
    private List<ParkingSlot> slotList;

    public ParkingLevel(int levelNum) {
        this.levelNum = levelNum;
        this.slotList = IntStream.range(0,10).mapToObj(i -> {
            ParkingSlot slot = new ParkingSlot(i);
            slot.setParkingLevel(this);
            return slot;
        }).collect(Collectors.toList());
    }

    public void parkVehicle(Vehicle vehicle){
        int index = availableIndex(vehicle.getVehicleType().getSlotSize());
        if (index!=-1){
            for (int i=index;i<index+vehicle.getVehicleType().getSlotSize();i++){
                slotList.get(i).setVehicle(vehicle);
            }
            System.out.println("Vehicle:"+vehicle.getNumberPlate()+", Parked on slot:("+index+","+(index+vehicle.getVehicleType().getSlotSize()-1)+")");
        }else {
            System.out.println("No space available at level:"+levelNum+" for vehicle:"+vehicle.getNumberPlate());
        }
    }

    public int availableIndex(int size){
        int counter = 0;

        for (ParkingSlot slot:slotList){
            if (!slot.isOccupied()){
                if ((++counter)==size){
                    return slot.getSlotNumber()-size+1;
                }
            }else {
                counter = 0;
            }
        }
        return  -1;
    }

    @Override
    public String toString() {
        return "ParkingLevel{" +
                "levelNum=" + levelNum +
                ", slotList=" + Arrays.toString(slotList.toArray()) +
                '}';
    }
}
