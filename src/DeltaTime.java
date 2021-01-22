public class DeltaTime {
    private long initialTime;
    private long finalTime;

    //Default Constructor
    DeltaTime(){
        initialTime = System.nanoTime();
        finalTime = initialTime;
    }

    public void startClock(){
        initialTime = System.nanoTime();
    }
    public double deltaTime(){
        finalTime = System.nanoTime();

        //Calculate Delta Time in Nano Seconds
        long nanoDelta = finalTime - initialTime;

        //Set Initial Time to last deltaTime() call
        initialTime = finalTime;

        //Covert From Nano Seconds To Seconds
        return (nanoDelta / 1000000000.00);
    }
}
