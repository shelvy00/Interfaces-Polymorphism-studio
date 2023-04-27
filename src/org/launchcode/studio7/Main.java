package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        /*
          Notes:
          CD
          200-500 rpm
          stores audio data
          700MB data
          can be played in CD player OR DVD player

          DVD
          570-1600 rpm
          universal storage
          17GB data
          can be played only in a DVD player

          title - abstract
          author - abstract
          discType - interface - constant HashMap, use type to access
          speed - interface - constant HashMap, use type to access

          files - ArrayList<file> - name, size - abstract

          spinDisc() - interface
          readData() - interface
          runFile() - interface
          writeData() - interface
         */

        // TODO: Declare and initialize a CD and a DVD object.
        CD confessions = new CD("Confession","Usher","CD","R&B","CO");
        File superstar = new File("superstar", 50, "audio");
        File throwback = new File("throwback", 60, "audio");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        confessions.spinDisc();
        confessions.readData();
        confessions.writeData(superstar);
        confessions.writeData(throwback);
        confessions.readData();
    }
}
