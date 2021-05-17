package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {


    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName,maxCapacity,aType, someUsedCapacity);
    }
    @Override
    public void readData(){
        System.out.println("A DVD spins at a rate of 570-1600 RPM");
    }
    @Override
    public void spinDisc(){
        System.out.println("Troop wuuuv");
    }
}
