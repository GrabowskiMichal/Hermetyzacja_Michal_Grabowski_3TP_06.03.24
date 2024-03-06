import java.util.HashMap;

public class Truck extends Vehicle{
    private double payloadCapacity;
    private boolean bed;
    private String engineType;
    private String carType;
    private boolean trailerAttached;

    public Truck(String brand, String model, int productionYear, HashMap<String, Integer> pos, int fuel, double payloadCapacity, boolean bed, String engineType, String carType, boolean trailerAttached) {
        super(brand, model, productionYear, pos, fuel);
        this.payloadCapacity = payloadCapacity;
        this.bed = bed;
        this.engineType = engineType;
        this.carType = carType;
        this.trailerAttached = trailerAttached;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }

// additional methods

    public void useSleep() {
        sleep();
    }

    public void useAttachTrailer() {
        attachTrailer();
    }

    public void useChangePayloadCapacity() {
        changePayloadCapacity();
    }

    private void sleep() {
        if (!this.isBed()) {
            System.out.println("You cannot sleep :(");
        } else {
            System.out.println("You are sleeping now :), goodnight");
        }
    }
    private void attachTrailer() {
        this.setTrailerAttached(!this.isTrailerAttached());
    }
    private void changePayloadCapacity() {
        if (this.getCarType().equals("6x4")) {
            this.setPayloadCapacity(25);
        } else if (this.getCarType().equals("8x4")){
            this.setPayloadCapacity(40);
        } else {
            this.setPayloadCapacity(25);
        }
    }
}
