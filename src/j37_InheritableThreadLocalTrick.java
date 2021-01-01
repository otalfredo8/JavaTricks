public class j37_InheritableThreadLocalTrick {
    public static void main(String[] args) {

        Thread parentThread = new ParentThread();
        parentThread.start();

    }
}

class ParentThread extends Thread {
//ThreadLocal does not pass the value from the ParentThread to the ChildThread
//    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

//ThreadLocal passes the value from the ParentThread to the ChildThread (default value from ParentThread)
//    public static InheritableThreadLocal<Integer> threadLocal = new InheritableThreadLocal<>();

    //ThreadLocal passes the value from the ParentThread to the ChildThread (customized value)
    public static InheritableThreadLocal<Integer> threadLocal = new InheritableThreadLocal<Integer>() {
        @Override
        protected Integer childValue(Integer parentValue) {
            return 200;
        }
    };


    @Override
    public void run() {
        Thread.currentThread().setName("Parent Thread");
        threadLocal.set(100);
        System.out.println(Thread.currentThread().getName() + " Value = " + ParentThread.threadLocal.get());
        Thread childThread = new ChildThread();
        childThread.start();
    }
}

class ChildThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("Child Thread");
        System.out.println(Thread.currentThread().getName() + " Value = " + ParentThread.threadLocal.get());
    }
}