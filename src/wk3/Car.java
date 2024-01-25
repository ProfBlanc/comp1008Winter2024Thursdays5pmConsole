package wk3;

import java.util.Random;

public class Car {

    String color;
    int maxSpeed = 200;
    boolean engineRunning;
    int currentSpeed;
    int numberOfPistons;

    double weight;

    //move, turn on, makeTurn

    int move(){
        //turn the speed;
        Random random = new Random();
        int increaseSpeedBy = random.nextInt(1, 41);
        currentSpeed += increaseSpeedBy;

        return increaseSpeedBy;
    }

    void move(int increaseSpeedBy){

        if(currentSpeed + increaseSpeedBy <= maxSpeed)
            currentSpeed += increaseSpeedBy;

    }


}
