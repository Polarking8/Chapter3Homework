package org.hillcrest.chapter3.microwave;

public class Microwave {
    private double runningTime; // running time of the microwave
    private int powerLevel; // power level of the microwave

    public Microwave(){
        powerLevel = 1;
    }

    /**
     * resets the running time back to zero
     */
    public void reset(){
            runningTime = 0;
        }

    /**
     * adds thirty seconds to the running time
     */
    public void addThirtySeconds(){
            runningTime += 30;
        }

    /**
     * Changes the power level from two to one and one to two
     */
    public void changePowerLevel(){
        if (powerLevel == 1){
            powerLevel = 2;
        }
        else powerLevel = 1;
    }

    /**
     * prints the microwave start sequence, with the running time and power level
     */
    public void startMicrowave(){
        System.out.println("The microwave will now run for " + runningTime + " seconds at power level " + powerLevel);
    }

}
