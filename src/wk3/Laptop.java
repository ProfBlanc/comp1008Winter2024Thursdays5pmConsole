package wk3;

public class Laptop {

    int[] displaySize;

    double batteryPercentage;

    boolean powerOn;

    enum ColorsAvailable {BLACK, GREY, SILVER}  // list of constants

    ColorsAvailable color = ColorsAvailable.BLACK;
    int ram;

    String turnOn(){
        return powerOn ? "Already is on" : "Turning on";
    }
    boolean canRunProgram(int usedRam){

        return usedRam <= ram;
    }

    public Laptop(){}  // default, no-args constructor

    public Laptop(int ram){
        this.ram = ram;
    }
    public Laptop(double batteryPercentage, int ram){
        this.batteryPercentage = batteryPercentage;
        this.ram = ram;
    }

    //atl+insert
    //right-click => Generate...

    public Laptop(double batteryPercentage, boolean powerOn, ColorsAvailable color, int ram, int[] displaySize) {
        this.displaySize = displaySize;
        this.batteryPercentage = batteryPercentage;
        this.powerOn = powerOn;
        this.color = color;
        this.ram = ram;
    }
}
