public enum CommandEnum {
    GET_LIST("1"),
    ADD_TASK("4"),
    EXIT("10"),
    UNKNOWN("-1"),
    ;

    private final String commandCode;

    CommandEnum(String commandCode) {
        this.commandCode = commandCode;
    }

    public static CommandEnum getCommandByCode(String commandCode) {
        for (CommandEnum command : CommandEnum.values()) {
            if (commandCode.equals(command.commandCode)) {
                return command;
            }
        }
        return UNKNOWN;
    }
}

//System.out.println("Выберите команду:");
//        System.out.println("1 - Получить список всех задач");
//        System.out.println("2 - Удалить все задачи");
//        System.out.println("3 - Получить задачу по ИД");
//        System.out.println("4 - Создать задачу");
//        System.out.println("5 - Отредактировать задачу");
//        System.out.println("6 - Удалить задачу по ИД");
//        System.out.println("7 - Получить список всех подзадач определённого эпика");
// выход 10