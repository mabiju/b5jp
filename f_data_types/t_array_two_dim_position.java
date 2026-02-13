package f_data_types;

public class t_array_two_dim_position {
    public static void main(String[] args) {  
        int pos[][] = new int[4][5];
        int k=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                pos[i][j] = k;
                k++;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pos[i][j] + "      ");
            }
            System.out.println();
        }
    }
}
