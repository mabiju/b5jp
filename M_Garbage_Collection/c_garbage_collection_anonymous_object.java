package M_Garbage_Collection;

public class c_garbage_collection_anonymous_object {
    public static void main(String[] args) {
        // creating anonymous object
        new c_garbage_collection_anonymous_object();
        new c_garbage_collection_anonymous_object();

        // suggest for garbage collection
        System.gc();
    }

    public void finalize() {
        System.out.println("Garbage collected for memory management.......");
    }
}
