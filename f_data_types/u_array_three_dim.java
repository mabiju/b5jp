package f_data_types;

public class u_array_three_dim {
    public static void main(String[] args) {
        int[][][] myArray = {
                // 3 x 2 x 3
                {
                        { 1, 2, 3 }, { 4, 5, 6 }
                },
                {
                        { 7, 8, 9 }, { 10, 11, 12 }
                },
                {
                        { 13, 14, 15 }, { 16, 17, 18 }
                }
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(myArray[i][j][k]);
                }
            }
        }
    }
}
