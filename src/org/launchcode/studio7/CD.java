package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName,maxCapacity,aType, someUsedCapacity);
    }
    @Override
    public void readData(){
        System.out.println("A CD spins at a rate between 250-500 RPM!");
    }
    @Override
    public void spinDisc(){
        System.out.println("Imma leave the door open");
    }
}
