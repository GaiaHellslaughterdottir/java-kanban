import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {

    private final Map<Integer, List<BaseTask>> tasks = new HashMap<>();

    private Integer taskId = 1;

    public BaseTask createTask(String taskName, String taskDetails, TaskTypeEnum type){
        BaseTask task = null;
        switch (type) {
            case TASK:
                task = new Task(taskName, taskDetails, taskId++);
                break;
            case EPIC:
                task = new Epic(taskName, taskDetails, taskId++);
                break;
            case SUB_TASK:
                task = new SubTask(taskName, taskDetails, taskId++);
                break;
        }
        return task;
    }

}
