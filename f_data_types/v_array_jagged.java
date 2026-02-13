package f_data_types;

public class v_array_jagged {
    public static void main(String[] args) {
        int[][] myArray ={
            {23,45,67,89},
            {12,78,34}
        };
        System.out.println("\n");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
