package com.KamathInc;

public class Maruti extends Car {

    private int roadService;

    public Maruti(int roadService) {
        super("Maruti", "2doors", 5, 2, 6, false);
        this.roadService = roadService;
    }
    public void accelarate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
        }
        else if(newVelocity >0 && newVelocity <= 10){
            changeGear(1);
        }
        else if(newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        }
        else if (newVelocity > 20 && newVelocity <=30)
        {
            changeGear(3);
        }
        else{
            changeGear(4);
        }

        if(newVelocity >0){
            changeVelocity(newVelocity , getCurrentDirection());
        }
    }
}
