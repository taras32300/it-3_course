package state;
/*
Паттерн State. Учебное задание, выполняемое студентом, может находить-
ся в состояниях: выдано, выполнено, сдано на проверку, проверено, пере-
сдано на проверку, не выполнено. Определить логику изменения состояний
и разработать модель системы.
 */

public class Main {
    public static void main(String[] args) {
        Grant grant = new Grant();

        grant.printStatus();
        grant.nextState();
        grant.printStatus();
        grant.status = "approve";
        grant.nextState();
        grant.printStatus();
        grant.previousState();
        grant.printStatus();
        grant.previousState();
        grant.printStatus();
        grant.previousState();
    }
}