import java.util.ArrayList;
import java.util.List;

public class BaseTask {
    protected String name;
    protected String details;
    protected int taskId;
    protected StatusEnum status;

    protected List<String> tasks;

    public BaseTask(String name, String details, int taskId) {
        this.name = name;
        this.details = details;
        this.taskId = taskId;
        status = StatusEnum.NEW;
    }

    public void createTask(String taskName, String taskDetails) {
        tasks = new ArrayList<String>();
        tasks.add(taskName);
        tasks.add(taskDetails);
    }
}
