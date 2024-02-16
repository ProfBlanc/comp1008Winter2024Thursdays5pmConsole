package wk6;

public class Car {
    private String color = "black";
    private int doors = 2;
    private double speed = 0;

    enum TransmissionType {MANUAL, AUTO, CVT}

    private TransmissionType transmission = TransmissionType.AUTO;

    public Car(){}

    public Car(String color, int doors, double speed, TransmissionType transmission) {
//        this.color = color;
//        this.doors = doors;
//        this.speed = speed;
//        this.transmission = transmission;
        setDoors(doors);
        setSpeed(speed);
        setColor(color);
        setTransmission(transmission);
    }
    public Car(String color, int doors, double speed, String transmission) {
//        this.color = color;
//        this.doors = doors;
//        this.speed = speed;
//        this.transmission = transmission;
        setDoors(doors);
        setSpeed(speed);
        setColor(color);
        setTransmission(transmission);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(
                color.toLowerCase().equals("black")  ||
                        color.toLowerCase().equals("blue")  ||
                        color.toLowerCase().equals("white")
        ){
            this.color = color;

        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors == 2 || doors == 4 || doors == 5)
            this.doors = doors;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed>= 0 && speed <= 400)
            this.speed = speed;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }
    public void setTransmission(String transmission){

        this.transmission = switch (transmission.toLowerCase()){
            case "manual" -> TransmissionType.MANUAL;
            case "cvt" -> TransmissionType.CVT;
            default -> TransmissionType.AUTO;
        };
    }
}
