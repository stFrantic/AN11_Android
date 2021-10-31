package task1;


public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(true,true,false);
        Test test = new Test(patient);
        System.out.println("Testing for SaRs-COV19 and antibodies: ");
        System.out.println("PCR - test result: " + test.isIll());
        System.out.println("IgG - test result: " + test.antibodies());
        }
    }

