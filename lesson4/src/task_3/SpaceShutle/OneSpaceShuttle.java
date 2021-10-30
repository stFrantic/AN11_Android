package task_3.SpaceShutle;

public class OneSpaceShuttle implements IStart {
    private boolean isOk;

    @Override
    public boolean check() {
        if ((int) (Math.random() * 10) >= 3) {
            System.out.println("[on chines]\nAll systems are ok");
            isOk = true;
            return true;
        } else {
            System.out.println("[on chines]\nSomething wrong. Check ErrorLog.txt");
            isOk = false;
            return false;
        }
    }

    @Override
    public void engineStart() {
        if (isOk) {
            System.out.println("[on chines]\nShuttle engines starts. All systems are ok");
        }
    }

    @Override
    public void start() {
        if (isOk) {
            System.out.println("[on chines]\nStart");
        }
    }

    @Override
    public void tryFix() {
        if (((int) (Math.random() * 10) >= 5) && !isOk) {
            System.out.println("[on chines]\nFixed all problems");
            isOk = true;
        } else if (isOk) {
            System.out.println("[on chines]\nAll systems are ok, no need to fix them ");
        } else {
            System.out.println("[on chines]\nRepair failed");
        }
    }

    @Override
    public boolean isOk() {
        return isOk;
    }
}
