package task_3.SpaceShutle;

public class RoscosmosShuttle implements IStart {
    private boolean isOk;

    @Override
    public boolean check() {
        if ((int) (Math.random() * 10) >= 4) {
            System.out.println("Все системы в норме");
            isOk = true;
            return true;
        } else {
            System.out.println("Неизвестная ошибка. Обратитесь к главным инжинерам для проведения диагностики и устранения неполадок");
            isOk = false;
            return false;
        }
    }

    @Override
    public void engineStart() {
        if (isOk) {
            System.out.println("Двигатели запущены. Все системы работают в штатном режиме");
        }
    }

    @Override
    public void start() {
        if (isOk) {
            System.out.println("Старт!");
        }
    }

    @Override
    public void tryFix() {
        if (((int) (Math.random() * 10) >= 6) && !isOk) {
            System.out.println("Проблемы были найдены и устранены");
            isOk = true;
        } else if (isOk) {
            System.out.println("Проблемы отсутсвуют");
        } else {
            System.out.println("Проблемы не исправимы. Замените соответсвующие детали");
        }
    }

    @Override
    public boolean isOk() {
        return isOk;
    }
}