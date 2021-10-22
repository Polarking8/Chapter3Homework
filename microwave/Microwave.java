package org.hillcrest.chapter3.microwave;

public class Microwave {
        private double runningTime; // running time of the microwave
        private int powerLevel = 1; // power level of the microwave
        public Microwave(){
        }
        public void reset(){
            runningTime = 0;
        }
        public void addThirtySeconds(){
            runningTime += 30;
        }
        // power level becomes one from two, and two from one. Any other number defaults to one.
        public void changePowerLevel(){
            if (powerLevel == 1){
                powerLevel = 2;
            }
            else if (powerLevel == 2){
                powerLevel = 1;
            }
            else powerLevel = 1;
        }
        public double getRunningTime(){
            return runningTime;
        }
        public double getPowerLevel(){
            return powerLevel;
        }
}
