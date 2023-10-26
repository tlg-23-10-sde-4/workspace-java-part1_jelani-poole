/*
 * Business class to model the workings of a television.
 */
class Television {

    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // attributes or properties - aka "fields" or "instance variables" in Java.
    private String brand;   // default value for when client doesn't specify
    private int volume;     // ditto here
    private DisplayType display = DisplayType.LED;

    private boolean isMuted;
    private int oldVolume;

    // constructor
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();                     // delegate to no-arg ctor for the increment
        setBrand(brand);            // delegate to setter for any validation
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand,volume);
        setDisplay(display);

    }

    // functions or operations aka "business methods" in Java - what do Television objects do?
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    // accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
                this.brand = "Samsung";
                break;
            case "Sony":
                this.brand = "Sony";
                break;
            case "LG":
                this.brand = "LG";
                break;
            case "Toshiba":
                this.brand = "Toshiba";
                break;
            default:
                System.out.println("This brand is not supported");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            System.out.println("Volume set to " + volume);
        } else {
            System.out.println("Error, volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true; //fake implementation
    }



    // toSting()
    public String toString() {
        return "Television: " +
                " brand= " + getBrand() + ", " +
                " volume= " + getVolume() + " display= " + getDisplay();
    }

//    public void mute() {
//        oldVolume = this.getVolume(); // Set the oldVolume to the current volume
//        isMuted = !isMuted(); // Alternative: isMuted = isMuted() ? false  : true;
//        volume = isMuted ? MIN_VOLUME : oldVolume; // If isMuted = true ? volume = MIN_VOLUME : Else, volume = savedVolume
//
//        // If isMuted is true, Print the first response, else print the second response
//        System.out.println(isMuted ? "TV is muted and the volume is " + this.getVolume() : "TV is unmuted and the volume is " + this.getVolume());
//    }
}