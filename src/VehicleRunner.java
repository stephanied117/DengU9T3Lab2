public class VehicleRunner {
    public static void main(String[] args) {
        Car myCar = new Car("MK4567", 10.0, 3, true);
        System.out.println(myCar.calculateTollPrice());

        Car myCar2 = new Car("FJ8731", 10.0, 6, true);
        System.out.println(myCar2.calculateTollPrice());

        // the way toll price is calculated for a Vehicle
        // shouldn't have changed
        Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
        System.out.println(myVehicle.calculateTollPrice());

        Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
        System.out.println(myTruck.calculateTollPrice());

        Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
        System.out.println(myTruck2.calculateTollPrice());

        // the way toll price is calculated for a Vehicle
        // shouldn't have changed
        Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
        System.out.println(myVehicle2.calculateTollPrice());

        Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
        System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

        // now let's drop off the 5 riders, charging 3.50 per rider
        boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
        System.out.println(success); // should be true
        System.out.println(myTaxi3.getPassengers()); // should now be 1
        System.out.println(myTaxi3.getFareCollected()); // should be 17.50

        Car myFaveCar = new Car("MK4567", 10.0, 3, true);
        Taxi myTaxiCab = new Taxi("TX1234", 10.0, 6, true, 0.0);
        myFaveCar.printCar();
        System.out.println();
        myTaxiCab.printTaxi();

    }
}
