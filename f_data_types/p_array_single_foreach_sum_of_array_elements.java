package f_data_types;

public class p_array_single_foreach_sum_of_array_elements {
    public static void main(String[] args) {
        int sum = 0;
        int marks[] = { 34, 56, 78, 99, 33, 87, 65 };
        for (int mark : marks) {
            sum += mark; // sum = sum + mark;
        }
        System.out.println("The sum of array elements = " + sum);
    }
}
