public class Main {

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();
    }
}
