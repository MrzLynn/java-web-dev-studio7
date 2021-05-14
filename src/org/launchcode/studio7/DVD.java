package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {


    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName,maxCapacity,aType, someUsedCapacity);
    }
    @Override
    public void readData(){
        System.out.println("DVD is also reading data!");
    }
    @Override
    public void spinDisc(){
        System.out.println("The rate at which it spins is 600!");
    }
}
