
//class Task extends Thread{
//    public void run(){
//        for (int i = 0; i < 5 ; i++) {
//            try {
//                Thread.sleep(1000);
//                System.out.println("Hello from "+getName());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}

//class Task implements Runnable{
//    public void run(){
//        for (int i = 0; i < 5 ; i++) {
//            try {
//                Thread.sleep(500);
//                System.out.println("Hello from "+Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}

public class MultiThreadingDemo {

    static void doTask(){
        for (int i = 0; i < 5 ; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Hello from "+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void main() throws Exception {

//        Runnable task1 = ()-> doTask();
//        Runnable task2 = ()-> doTask();
        Thread t1 = new Thread(()->doTask());
        Thread t2 = new Thread(()->doTask());
        t1.setName("Task-1");
        t2.setName("Task-2");

        t1.start();
        t2.start();

    }


}
