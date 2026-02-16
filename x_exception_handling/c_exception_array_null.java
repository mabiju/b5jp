package x_exception_handling;

public class c_exception_array_null {
    public static void main(String[] args) {
        // int[] myarr = null;
        try {
            // System.out.println(myarr[6]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled");
        /* } catch(NullPointerException e){
            System.out.println("Null Pointer Exception handled"); */
        }catch(Exception e){
            System.out.println("Exception handled." + e);
        }
    }
}
