package org.hillcrest.chapter3.microwave;

public class MicrowaveTester {


    public static void main(String[] args) {
        Microwave microwave;
        microwave = new Microwave();
        microwave.addThirtySeconds();
        microwave.changePowerLevel();
        microwave.reset();
        microwave.addThirtySeconds();
        microwave.addThirtySeconds();
        System.out.println("The microwave will now run for "
                + microwave.getRunningTime()+ " seconds at power level" + microwave.getPowerLevel());
        }

}
