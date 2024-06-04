/* Nama     : Sherli Arninda
 * NIM      : 24060122130092
 * Tanggal  : 4 Juni 2024
 */
public abstract class Vehicle {
    public abstract double calcFuelEfficency();
    public abstract double calcTripDistance();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
