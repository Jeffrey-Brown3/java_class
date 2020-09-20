/**
 * a class to create a bike object, using attributes: drivetrain, fork, and brakes
 * @author Jeff Brown
 **/
public class Bike {

    private Drivetrain drivetrain;
    private Fork fork;
    private Brakes brakes;

    /**
     * constructor for a bike object
     *
     * @param brakesIn the type of brakes equipped on the bike, takes Brakes interface based object
     * @param drivetrainIn the type of drivetrain equipped on the bike, takes Drivetrain interface based object
     * @param forkIn the type of fork equipped on the bike, takes Fork interface based object
     */
    public Bike(Drivetrain drivetrainIn, Fork forkIn, Brakes brakesIn) {
        this.drivetrain = drivetrainIn;
        this.fork = forkIn;
        this.brakes = brakesIn;
    }
    /**
     * @return returns this brake type
     **/
    public Brakes getBrakes() {
        return brakes;
    }
    /**
     * @return returns this drivetrain type
     **/
    public Drivetrain getDrivetrain() {
        return drivetrain;
    }
    /**
     * @return returns this fork type
     **/
    public Fork getFork() {
        return fork;
    }
}
