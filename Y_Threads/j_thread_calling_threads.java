package Y_Threads;

public class j_thread_calling_threads {
    public void call(String msg) {
        System.out.print("[" + msg);
        try {
            System.out.print("]");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
    }

    public static void main(String[] args) {
        j_thread_calling_threads obj = new j_thread_calling_threads();
        obj.call("Hello Sanothimi");
        System.out.println("This runs after calling threads.....");
    }
}
