public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate,
                double tollFee,
                int passengers,
                boolean isElectric,
                double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric); // calls the Car constructor
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Total fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        // update passenger count by calling inherited setter method
        setPassengers(getPassengers() + numRiders);

        // update Taxi's fareCollected instance variable
        double fareCost = numRiders * farePerRider;
        fareCollected += fareCost;

        // apply 50% discount if passengers is now greater than or equal to 4
        // and the Taxi has not already received a discount
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);  // inherited method from Vehicle
            setDiscountApplied(true);  // setter method added to Car class
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        if (dropOffPassengers(getPassengers() - 1)) {
            fareCollected += (getPassengers() - 1) * farePerRider;
            return true;
        }
        return false;
    }
}
