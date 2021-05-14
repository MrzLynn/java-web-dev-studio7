package org.launchcode.studio7;

public class Vinyl extends BaseDisc {


    public Vinyl(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName,maxCapacity,aType, someUsedCapacity);
    }
    public void printInfo() {
        System.out.println("This Vinyl is the jam!");
    }
}
