import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * a class to create a bike object, using attributes: drivetrain, fork, and brakes
 * @author Jeff Brown
 **/
public class BikeTest {

    SingleSpeedDrivetrain drivetrain;
    AirFork fork;
    MechanicalBrakes brakes;
    Bike myBike;

    @Before
    public void setup(){
        this.drivetrain = new SingleSpeedDrivetrain(42);
        this.fork = new AirFork();
        this.brakes = new MechanicalBrakes();
        this.myBike = new Bike(drivetrain, fork, brakes);
    }

    @Test
    public void testBikeConstruction(){
        assertNotNull("bike was created with null values", myBike);
    }

    @Test
    public void getBrakes() {
        assertEquals("brakes do not match", this.brakes, myBike.getBrakes());
    }
    //changed
    @Test
    public void getDrivetrain() {
        assertEquals("drivetrain does not match", this.drivetrain, myBike.getDrivetrain());
    }

    @Test
    public void getFork() {
        assertEquals("fork does not match", this.fork, myBike.getFork());
    }

    @Test
    public void getForkNegative() {
        assertNotEquals("fork does not match", this.brakes, myBike.getFork());
    }

}
