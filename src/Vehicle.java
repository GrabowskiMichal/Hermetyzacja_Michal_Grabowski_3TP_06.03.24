import java.util.HashMap;

public class Vehicle {
    private String brand;
    private String model;
    private int productionYear;
    private HashMap<String, Integer> pos;
    private int fuel;

    public Vehicle(String brand, String model, int productionYear, HashMap<String, Integer> pos, int fuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.pos = pos;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public HashMap<String, Integer> getPos() {
        return pos;
    }

    public void setPos(HashMap<String, Integer> pos) {
        this.pos = pos;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // additional methods

    public void useTurnRight() {
        turnRight();
    }

    public void useTurnLeft() {
        turnLeft();
    }

    public void useGoForward() {
        goForward();
    }

    public void useReverse() {
        reverse();
    }

    private void turnRight() {
        pos.put("x", pos.get("x") + 10);
    }
    private void turnLeft() {
        pos.put("x", pos.get("x") - 10);
    }
    private void goForward() {
        pos.put("y", pos.get("y") + 10);
    }
    private void reverse() {
       pos.put("y", pos.get("y") - 10);
    }
}
