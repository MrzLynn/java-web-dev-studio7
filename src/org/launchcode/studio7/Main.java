package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("CD Example", 100,"CD-Music",30);
        DVD dvd = new DVD("DVD Example",1000,"DVD-Drama",800);
        Vinyl vinyl = new Vinyl("Vinyl Example",30,"Vinyl -Pop",20);

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
