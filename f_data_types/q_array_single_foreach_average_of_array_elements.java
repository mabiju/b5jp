package f_data_types;

public class q_array_single_foreach_average_of_array_elements {
    public static void main(String[] args) {
        int sum = 0, arrayLength;
        double avg = 0.0;
        int marks[] = { 34, 56, 78, 99, 33, 87, 65 };
        for (int mark : marks) {
            sum += mark; // sum = sum + mark;
        }
        arrayLength = marks.length;
        avg = (double) sum / arrayLength;
        System.out.println("\nThe average of array elements = " + avg);
    }
}
