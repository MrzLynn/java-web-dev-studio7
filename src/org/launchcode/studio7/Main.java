package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("CD Example", 700,"CD-Music",350);
        DVD dvd = new DVD("DVD Example",5000,"DVD-Drama",1450);
        Vinyl vinyl = new Vinyl("Vinyl Example",30,"Vinyl -Pop",20);

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(cd.diskInfo());

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
