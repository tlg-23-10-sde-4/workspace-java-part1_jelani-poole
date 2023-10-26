package src.com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television.
 */
public class Television {

    // CLASS (static) VARIABLES - shared among all instances
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "Sony", "LG", "Toshiba" };

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
    private boolean isConnected;

    // constructor
    public Television() {
        instanceCount++;
    }

    public Television(String brand) throws InvalidBrandException {
        this();                     // delegate to no-arg ctor for the increment
        setBrand(brand);            // delegate to setter for any validation
    }

    public Television(String brand, int volume)
            throws IllegalArgumentException, InvalidBrandException {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display)
            throws IllegalArgumentException, InvalidBrandException {
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
        // TODO: Lab 6.1 pg 81 (optional)
    public void setBrand(String brand) throws InvalidBrandException {
        boolean valid = false;

        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            throw new InvalidBrandException(
                    String.format("Invalid brand: %s. Must be one of %s.\n",
                    brand, Arrays.toString(VALID_BRANDS)));
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (brand.equals(currentBrand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws IllegalArgumentException {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        } else {
            throw new IllegalArgumentException(
                    String.format("Invalid volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME));

 //           System.out.println("Invalid volume: volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
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



     //toSting()
    public String toString() {
//        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
//
//        return String.format("Television: brand=%s, volume=%s, display=&s",
//                getBrand(), volumeString, getDisplay());
        return "Television: " +
                " brand= " + getBrand() + ", " +
               " volume= " + getVolume() + " display= " + getDisplay();
    }

//   public void mute()
//   {     oldVolume = this.getVolume(); // Set the oldVolume to the current volume
//           isMuted = !isMuted(); // Alternative: isMuted = isMuted() ? false  : true;
//            volume = isMuted ? MIN_VOLUME : oldVolume; // If isMuted = true ? volume = MIN_VOLUME : Else, volume = savedVolume

//        // If isMuted is true, Print the first response, else print the second response
//        System.out.println(isMuted ? "TV is muted and the volume is " + this.getVolume() : "TV is unmuted and the volume is " + this.getVolume());
//    }
}