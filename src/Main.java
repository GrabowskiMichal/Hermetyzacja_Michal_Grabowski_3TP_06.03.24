import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> initialPos = new HashMap<>();
        initialPos.put("x", 0);
        initialPos.put("y", 0);

        Car carOne = new Car("BMW", "M5", 2022, initialPos, 20, false, "gasoline", 3, "Sedan");
        Car carTwo = new Car("Mercedes", "C63 AMG W204", 2012, initialPos, 40, true, "gasoline", 5, "Sedan");
        Car carThree = new Car("Skoda", "Octavia", 2022, initialPos, 32, true, "diesel", 3, "Combi");

        Truck truckOne = new Truck("MACK", "S500", 2006, initialPos, 512, 23.23,true, "V8", "4x2", true);
        Truck truckTwo = new Truck("MACK", "S700", 2012, initialPos, 684, 3.829,false, "R6", "6x2", false);
        Truck truckThree = new Truck("MACK", "S800", 2018, initialPos, 1098, 43.78,true, "V12", "8x2", false);

        carOne.useLockDoors();
        carOne.useRefuel();
        System.out.println(carOne.useCheckMaxGear());

        truckOne.useSleep();
        truckOne.useAttachTrailer();
        truckOne.useChangePayloadCapacity();
    }
}