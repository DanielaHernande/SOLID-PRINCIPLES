package Exercise3;

public class Main {
    public static void main(String[] args) {
        
        Workable humanWorker = new HumanWorker();
        humanWorker.work();

        Eatable humanEatable = new HumanWorker();
        humanEatable.eat();

        Workable robotWorker = new RobotWorker();
        robotWorker.work();
    }
}
