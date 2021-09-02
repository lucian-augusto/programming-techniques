public class Threads implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 15; i++) {
                System.out.println(i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Threads threads = new Threads();

        Thread t1 = new Thread(threads);
        Thread t2 = new Thread(threads);
        Thread t3 = new Thread(threads);

        t1.start();
        t2.start();
        t3.start();
    }

}
