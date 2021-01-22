public class GameMaster {
    private boolean powerOn;

    private DeltaTime time;
    public double deltaTime;

    //Master Constructor
    public GameMaster() {
        powerOn = true;

        //Game Initialization
        TimeInitialization();
        Start();

        while(powerOn){
            //Update Time
            deltaTime = time.deltaTime();
            System.out.println("Delta Time = "+deltaTime);

            //Game Loop
            Update();

            //Sleep
            SleepFor(1000);
        }
    }

    //Game Initialization
    public void Start(){

    }
    //Game Loop
    public void Update(){

    }


    public void ShutdownGame(){
        powerOn = false;
    }
    private void TimeInitialization(){
        //Initialize Time Object
        time = new DeltaTime();
        time.startClock();
    }
    private void SleepFor(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
