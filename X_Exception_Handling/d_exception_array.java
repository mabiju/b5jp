package X_Exception_Handling;

public class d_exception_array {
    public static void main(String[] args) {
        int[] nums = { 12, 34, 56, 78, 90, 33, 44, 567, 80, 91, 43, 87 };

        try {
            for (int i = 0; i <= nums.length; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception handled. " + e);
        }

    }
}
