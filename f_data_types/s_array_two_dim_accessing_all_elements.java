package f_data_types;

public class s_array_two_dim_accessing_all_elements {
    public static void main(String[] args) {
        int[][] myArray = {
                // 2 x 3
                { 12, 34, 56 },
                { 33, 45, 76 }
        };
        // accessing all elements of array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
