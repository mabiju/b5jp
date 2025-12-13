package f_data_types;

public class n_array_single_indexed {
    public static void main(String[] args) {
        int stuMarks[];
        stuMarks = new int[5];
        // int stuMarks = new int[5];
        // int[] stuMarks = {23,45,67,89,99};
        stuMarks[0] = 89;
        stuMarks[1] = 8;
        stuMarks[2] = 9;
        stuMarks[3] = 67;
        stuMarks[4] = 34;
        System.out.println("\n"+ stuMarks[2]); // 9
        System.out.println(stuMarks[22]);      // error
    }
}
