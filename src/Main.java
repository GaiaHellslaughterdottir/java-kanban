import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static TaskManager taskManager;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        taskManager = new TaskManager();

        while (true) {
            printMenu();

            String commandStr = scanner.nextLine();
            CommandEnum command = CommandEnum.getCommandByCode(commandStr);

            switch (command) {
                case GET_LIST:
                    System.out.println("Список задач");
                    break;
                case ADD_TASK:
                    addNewTask();
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Такой команды не существует, введите другую команду");
            }
        }


    }

    private static void printMenu() {
        System.out.println("Выберите команду:");
        System.out.println("1 - Получить список всех задач");
        System.out.println("2 - Удалить все задачи");
        System.out.println("3 - Получить задачу по ИД");
        System.out.println("4 - Создать задачу");
        System.out.println("5 - Отредактировать задачу");
        System.out.println("6 - Удалить задачу по ИД");
        System.out.println("7 - Получить список всех подзадач определённого эпика");
    }

    private static void addNewTask() {
        System.out.println("Введите название задачи");
        String taskName = scanner.nextLine();
        System.out.println("Введите описание задачи");
        String taskDetails = scanner.nextLine();
        System.out.println("Введите тип задачи");
        String taskTypeStr = scanner.nextLine();
        TaskTypeEnum taskType = TaskTypeEnum.valueOf(taskTypeStr);

        taskManager.createTask(taskName, taskDetails, taskType);

    }
}
