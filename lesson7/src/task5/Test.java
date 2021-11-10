package task5;

public class Test {
    Patient p;
    Test(Patient p){
        this.p = p;
    }
    boolean isIll() {
        if (p.isHadBeenIll()) {
            if (p.isWearingMask()) {
                if (p.isWorksRemotely() && p.getVaccinated() != null) p.setChanceOfIlling(0.1);
                else if (p.isWorksRemotely()) p.setChanceOfIlling(0.25);
                else p.setChanceOfIlling(0.45);
            } else {
                if (p.isWorksRemotely() && p.getVaccinated() != null) p.setChanceOfIlling(0.25);
                else if (p.isWorksRemotely()) p.setChanceOfIlling(0.30);
                else p.setChanceOfIlling(0.6);
            }
        } else {
            if (p.isWearingMask()) {
                if (p.isWorksRemotely() && p.getVaccinated() != null) p.setChanceOfIlling(0.20);
                else if (p.isWorksRemotely()) p.setChanceOfIlling(0.4);
                else p.setChanceOfIlling(0.55);
            } else {
                if (p.isWorksRemotely() && p.getVaccinated() != null) p.setChanceOfIlling(0.35);
                else if (p.isWorksRemotely()) p.setChanceOfIlling(0.55);
                else p.setChanceOfIlling(0.8);
            }
        }
        boolean check = ((int) (p.getChanceOfIlling() * (Math.random() * 10))) > 5;
        if (check){
            p.setHadBeenIll(true);
            return true;
        }else return false;
    }
    int antibodies(){
        if(p.isHadBeenIll()){
            if (p.getVaccinated() != null) return 100;
            else return 50;
        }else {
            if (p.getVaccinated() != null) return 60;
            else return 0;
        }
    }
}
