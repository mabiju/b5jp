package f_data_types;

public class p_array_single_foreach_sum_of_elements {
    public static void main(String[] args) {
        int sum = 0;
        int marks[] = {23,34,5,67,87,65,43,32};
        for (int mark : marks) {
            sum += mark; // sum = sum + mark;
        }
        System.out.println("The sum of array elements = " + sum);
    }
}
