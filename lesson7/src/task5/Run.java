package task5;

public class Run {
    public static String results(Patient patient, Test test){
        if(test.isIll()){
            return "Dear " + patient.getName() + ", your test result is positive. You must be isolated for 7 days.";
        }else return "Dear " + patient.getName() + ", your test result is negative. You have "+test.antibodies()+" antibodies.";
    }

    public static void main(String[] args) {
        Patient patient = new Patient("John Doe",true,true,false);
        Test test = new Test(patient);
        System.out.println(results(patient,test));
    }
}
