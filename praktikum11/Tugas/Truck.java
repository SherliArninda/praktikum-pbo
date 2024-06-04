/* Nama     : Sherli Arninda
 * NIM      : 24060122130092
 * Tanggal  : 4 Juni 2024
 */
public class Truck extends Vehicle {
    private double maxLoad;
    
    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    @Override
    public double calcFuelEfficency() {
        return 0;
    }

    @Override
    public double calcTripDistance() {
        return 0;
    }
}