public class Employer {
    private String name;
    private int tasksComplete;

    Employer(String name, int tasksComplete){
        this.name = name;
        this.tasksComplete = tasksComplete;
    }

    String getName(){
        return name;
    }

    int getTasksComplete(){
        return tasksComplete;
    }
}
