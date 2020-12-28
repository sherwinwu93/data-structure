package syntax3.ex03;

import java.util.Objects;

public class Car {
    private boolean isCompact;
    private boolean isHandicapped;
    private int size;
    private int BN;

    /**
     * creates a car with given size and permissions.
     */
    public Car(boolean isCompact, boolean isHandicapped, int size, int BN) {
        this.isCompact = isCompact;
        this.isHandicapped = isHandicapped;
        this.size = size;
        this.BN = BN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return BN == car.BN;
    }

    /**
     * Returns whether or not a car can fit in a compact space.
     */
    public boolean isCompact() {
        return this.isCompact;
    }

    /**
     * Returns whether or not a car may park in a handicapped space.
     */
    public boolean isHandicapped() {
        return this.isHandicapped;
    }

    /**
     * Returns type of the car
     */
    public String type() {
        if (isCompact) {
            return "compact";
        }
        if (isHandicapped) {
            return "handicapped";
        }
        return "regular";
    }

    /**
     * Returns the size of car.
     */
    public int size() {
        return size;
    }

    /**
     * Attempts to park this car in spot, returning true if successful.
     */
    public boolean findSpotAndPark(ParkingLot lot) {
        return false;
    }

}
