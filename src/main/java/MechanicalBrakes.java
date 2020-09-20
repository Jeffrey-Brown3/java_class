/**
 * this fulfills the enum for an mechanical type of brakes. this style of brakes are applied by tension of a metal cable on a lever on the bikes handlebars.
 * @author Jeff Brown
 **/
public class MechanicalBrakes implements Brakes{
    private BrakeType brakeType;

    /**
     * constructor for mechanical brakes
     **/
    public MechanicalBrakes() {
        this.brakeType = BrakeType.Mechanical;
    }
    /**
     * @return returns this brake type
     **/
    public BrakeType getBrakeType() {
        return this.brakeType;
    }
}
