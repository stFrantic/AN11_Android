package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Patient {
    private boolean wearingMask;
    private boolean worksRemotely;
    private Vaccine vaccine;
    private boolean hadBeenIll;
    private double chanceOfIlling;

    Patient(boolean wear, boolean remote, boolean ill) {
        this.wearingMask = wear;
        this.worksRemotely = remote;
        this.hadBeenIll = ill;
        System.out.println("Vaccinated? Enter 1, if yes\n Enter 0, if not");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        boolean exit = false;
        while (!exit) {
            switch (c) {
                case 1:
                    System.out.print("Enter vaccine(Input number before vaccine title: " + Arrays.toString(Vaccine.values()));
                    vaccine = Vaccine.getByOrdinal(scanner.nextInt());
                    if (vaccine != null) {
                        exit = true;
                    }
                    break;
                case 0:
                    vaccine = null;
                    exit = true;
                    break;
                default: {
                    System.out.println("Incorrect number, try again");
                }
            }
        }

    }

    public double getChanceOfIlling() {
        return chanceOfIlling;
    }

    public boolean isWearingMask() {
        return wearingMask;
    }

    public void setWearingMask(boolean wearingMask) {
        this.wearingMask = wearingMask;
    }

    public boolean isWorksRemotely() {
        return worksRemotely;
    }

    public void setWorksRemotely(boolean worksRemotely) {
        this.worksRemotely = worksRemotely;
    }

    public String getVaccinated() {
        if (vaccine != null) {
            return vaccine.toString();
        } else return null;
    }

    public void setVaccinated(int index) {
        this.vaccine = Vaccine.getByOrdinal(index);
    }

    public boolean isHadBeenIll() {
        return hadBeenIll;
    }

    public void setHadBeenIll(boolean hadBeenIll) {
        this.hadBeenIll = hadBeenIll;
    }

    public void setChanceOfIlling(double chanceOfIlling) {
        this.chanceOfIlling = chanceOfIlling;
    }
}

