package syntax3.ex03;

import syntax1.ArrayMap;
import syntax1.Map61B;

import java.util.List;

public class ParkingLot {
    private int[] handicapedDistances;
    private int[] compactDistances;
    private int[] regularDistances;

    private Map61B<Spot, Car> spotCarMap;

    /**
     * Creates a parking lot containing handicappedDistances.length handicapped spaces,
     * each with a distance corresponding to an element of handicappedDistances. Also initializes
     * the appropriate compact and regular spaces.
     */
    public ParkingLot(int[] handicappedDistances, int[] compactDistances, int[] regularDistances) {
        this.handicapedDistances = handicappedDistances;
        this.compactDistances = compactDistances;
        this.regularDistances = regularDistances;
        spotCarMap = new ArrayMap<>();
    }

    /**
     * Attempts to find a spot and park the given car. Returns false if no spots are available.
     */
    public boolean findSpotAndPark(Car toPark) {
        String type = toPark.type();
        int size = toPark.size();
        Spot waitToPark = new Spot(type, size);
        Car car = spotCarMap.get(waitToPark);
        if (car == null) {
            spotCarMap.put(waitToPark, toPark);
            return true;
        } else {
            Spot regularSpot = new Spot("regular", size);
            Car regular = spotCarMap.get(regularSpot);
            if (regular == null) {
                spotCarMap.put(regularSpot, toPark);
                return false;
            }
        }
        return false;
    }

    /**
     * Records when a spot has been vacated, and makes the spot available for parking again.
     */
    public void removeCarFromSpot(Car toRemove) {
        List<Spot> keys = spotCarMap.keys();
        for (Spot spot : keys) {
            Car car = spotCarMap.get(spot);
            if (car.equals(toRemove)) {
                spotCarMap.put(spot, null);
            }
        }
    }

    /**
     * Prioritization of closeness in parking space selection can be handled using serveral
     * priority queues (one for each kind of parking space). Occupied spaces (which are dequeued
     * when they are assigned) can be tracked with a Map<Car, Spot>.
     */

    private class Spot {
        /**
         * The Spot class can be declared private and encapsulated by the ParkingLot class.
         * Though it is private, and therefore not a part of our parking lot API,
         * its methods are described here to give you an idea of how a Spot class might
         * be implemented.
         */
        public String type;
        public int proximity;

        /**
         * creates a spot of a given type and proximity
         */
        private Spot(String type, int proximity) {
            this.type = type;
            this.proximity = proximity;
        }
    }
}
