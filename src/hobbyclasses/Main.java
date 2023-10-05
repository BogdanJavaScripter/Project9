package hobbyclasses;

import hobbyclasses.Swimmer;

public class Main {
    public static void main(String[] args) {
        Swimmer swimmer1 = new Swimmer("OLEG", 19, "Freestyle", 1000);
        Swimmer swimmer2 = new Swimmer("STEPAN", 16, "Backstroke", 800);
        Swimmer swimmer3 = new Swimmer("SHTERNRITER", 999, "Butterfly", 12000);

        // Output full descriptions of the swimmers
        swimmer1.printDescription();
        swimmer2.printDescription();
        swimmer3.printDescription();
    }
}
