/**
 * this type of drivetrain has no gears
 * @author Jeff Brown
 **/
public class SingleSpeedDrivetrain implements Drivetrain{
    private int gearCount = 0;
    private int toothCount;

    /**
     * constructor single speed drivetrain
     * @param toothCountIn input for the amount of teeth on the rear cassette
     **/
    public SingleSpeedDrivetrain(int toothCountIn) {
        this.toothCount = toothCountIn;
    }
    /**
     * @return returns this gear count
     **/
    public int getGearCount() {
        return this.gearCount;
    }
    /**
     * @return returns this tooth count
     **/
    public int getToothCount() {
        return this.toothCount;
    }
}
