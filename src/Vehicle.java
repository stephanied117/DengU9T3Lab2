public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    private String speedRating;

    public Vehicle(String licensePlate, double tollFee, int passengers, String speedRating) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
        this.speedRating = speedRating;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public void setTollFee(double newValue) {
        tollFee = newValue;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int newValue) {
        passengers = newValue;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }
    public void printInfo() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
    }
}
