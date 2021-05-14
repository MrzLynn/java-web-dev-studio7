package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String typeOfDisc;
    private int someUsedCapacity;


    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        name = aName;
        storageCapacity = maxCapacity;
        typeOfDisc = aType;
        this.someUsedCapacity = someUsedCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}