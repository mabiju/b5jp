package x_exception_handling;

public class d_exception_array {
    public static void main(String[] args) {
        int[] nums = { 12, 34, 56, 78, 90, 43, 54, 65, 87, 3, 92, 21 };
        try {
            for (int i = 0; i <= nums.length; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception Handled :" + e);
        }
    }
}
