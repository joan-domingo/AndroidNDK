package cat.xojan.androidndk;

public class Car {

    private final String brand;
    private final int numDoors;

    public Car(String brand, int numDoors) {
        this.brand = brand;
        this.numDoors = numDoors;
    }


    public String getBrand() {
        return brand;
    }

    public int getNumDoors() {
        return numDoors;
    }
}
