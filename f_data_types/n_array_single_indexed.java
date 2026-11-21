package f_data_types;

public class n_array_single_indexed {
    public static void main(String[] args) {
        int stuMarks[];
        stuMarks = new int[5];
        // int stuMaks = new int[5];
        // int[] stuMarks ={23,45,67,89,54};
        stuMarks[0] = 45;
        stuMarks[1] = 5;
        stuMarks[2] = 15;
        stuMarks[3] = 25;
        stuMarks[4] = 55;
        System.out.println("\n" + stuMarks[2]); // 15
        System.out.println(stuMarks[22]);   // error
    }
}
