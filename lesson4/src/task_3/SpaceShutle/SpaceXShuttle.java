package task_3.SpaceShutle;

public class SpaceXShuttle implements IStart {
    private boolean isOk;

    public boolean isOk() {
        return isOk;
    }

    @Override
    public boolean check() {
        if ((int) (Math.random() * 10) >= 2) {
            System.out.println("All systems are ok");
            isOk = true;
            return true;
        } else {
            System.out.println("Something wrong. Check ErrorLog.txt");
            isOk = false;
            return false;
        }
    }

    @Override
    public void engineStart() {
        if (isOk) {
            System.out.println("Shuttle engines starts. All systems are ok");
        }
    }

    @Override
    public void start() {
        if (isOk) {
            System.out.println("Start");
        }
    }

    @Override
    public void tryFix() {
        if (((int) (Math.random() * 10) >= 3) && !isOk) {
            System.out.println("Fixed all problems");
            isOk = true;
        } else if (isOk) {
            System.out.println("All systems are ok, no need to fix them ");
        } else {
            System.out.println("Repair failed");
        }
    }
}
