/**
 * this fulfills the enum for an air type of fork.this style of fork absorbs shock with compressed air
 * @author Jeff Brown
 **/
public class AirFork implements Fork{
    private ForkType forkType;

    /**
     * constructor for air fork
     **/
    public AirFork() {
        this.forkType = ForkType.Air;
    }
    /**
     * @return returns this fork type
     **/
    public ForkType getForkType() {
        return this.forkType;
    }
}
