package M_Garbage_Collection;

public class a_garbage_collection_null {
    public static void main(String[] args) {

        // uncomment the following codes before execution
        /* a_garbage_collection_null obj1 = new a_garbage_collection_null();
        a_garbage_collection_null obj2 = new a_garbage_collection_null();
        obj1 = null;
        obj2 = null; */

        System.gc();
    }

    public void finalize() {
        System.out.println("Garbage collected for memory management......");
    }
}
