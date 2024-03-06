import java.util.HashMap;

public class Car extends Vehicle{
    private boolean doorLocked;
    private String fuelType;
    private int currentGear;
    private String carType;

    public Car(String brand, String model, int productionYear, HashMap<String, Integer> pos, int fuel, boolean doorLocked, String fuelType, int currentGear, String carType) {
        super(brand, model, productionYear, pos, fuel);
        this.doorLocked = doorLocked;
        this.fuelType = fuelType;
        this.currentGear = currentGear;
        this.carType = carType;
    }

    public boolean isDoorLocked() {
        return doorLocked;
    }

    public void setDoorLocked(boolean doorLocked) {
        this.doorLocked = doorLocked;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
    // additional methods

    public void useLockDoors() {
        lockDoors();
    }

    public void useRefuel() {
        refuel();
    }

    public int useCheckMaxGear() {
        return checkMaxGear();
    }

    private void lockDoors() {
        if (!this.isDoorLocked()) {
            this.setDoorLocked(true);
            System.out.println("Doors are now locked.");
        } else {
            this.setDoorLocked(false);
            System.out.println("Doors are now unlocked.");
        }
    }
    private void refuel() {
        if (this.getCarType().equals("sport")) {
            this.setFuel(100);
        } else if (this.getCarType().equals("microCar")){
            this.setFuel(25);
        } else {
            this.setFuel(50);
        }
    }
    private int checkMaxGear() {
        int maxGear;
        if (this.getCarType().equals("sport")) {
            maxGear = 8;
        } else if (this.getCarType().equals("microcar")) {
            maxGear = 4;
        } else {
            maxGear = 6;
        }
        return maxGear;
    }
}
