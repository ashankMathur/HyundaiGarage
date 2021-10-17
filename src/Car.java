public class Car {

    private String brand;
    private String model;
    private String engine;
    private int doors;
    private int power;

    public Car(String brand, String model, String engine, int doors, int power) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
        this.power = power;
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

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
