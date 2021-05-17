package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String typeOfDisc;
    private int usedCapacity;
    private int aRemainingCapacity;


    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity, int remainingCapacity) {
        name = aName;
        storageCapacity = maxCapacity;
        typeOfDisc = aType;
        usedCapacity = someUsedCapacity;
        aRemainingCapacity = remainingCapacity;
    }

    public BaseDisc(String aName, int maxCapacity, String aType, int someUsedCapacity) {
    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - usedCapacity;
    }

    public String diskInfo() {
        String output = String.format("\nDisk name: %s\nMax capacity:%d" +
                "\nSpace used: %d" +
                "\nAvailable space: %d\n", name, storageCapacity, usedCapacity, aRemainingCapacity);
        return output;
    }

    public String writeData(int dataSize) {
        if (dataSize > aRemainingCapacity) {
            return "Not enough disk enough";
        }
        usedCapacity += dataSize;
        aRemainingCapacity -= dataSize;

        return "data written to disc. Remaining space = " + aRemainingCapacity;
    }

}

