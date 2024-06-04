/* Nama     : Sherli Arninda
 * NIM      : 24060122130092
 * Tanggal  : 4 Juni 2024
 */
public class Helicopter extends Airplane{
    private double maxLoad;
        
    public Helicopter(double maxLoad){
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

    @Override
    public void takeOff(){

    }

    @Override
    public void land(){

    }

    @Override
    public void fly(){
        
    }
}
