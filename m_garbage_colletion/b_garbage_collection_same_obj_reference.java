package m_garbage_colletion;

public class b_garbage_collection_same_obj_reference {
    public static void main(String[] args) {
        // uncomment the following codes before execution
        /* b_garbage_collection_same_obj_reference obj1 = new b_garbage_collection_same_obj_reference();
        b_garbage_collection_same_obj_reference obj2 = new b_garbage_collection_same_obj_reference();
        obj2 = obj1; */

        System.gc();

    }
    @Override
    public void finalize()
    {
        System.out.println("Garbage collected for memory management.......");
    }
}
