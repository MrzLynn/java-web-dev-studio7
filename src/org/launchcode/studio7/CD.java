package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName,maxCapacity,aType, someUsedCapacity);
    }
    @Override
    public void readData(){
        System.out.println("CD is reading data!");
    }
    @Override
    public void spinDisc(){
        System.out.println("The rate at which it spins is 50!");
    }
}
