package p_variable_length_arguments;

public class b_variable_length_arguments {
    public int sumNum(int... args) {
        int sum = 0;
        System.out.println("\nThe number of argument(s) = " + args.length);
        for (int i : args) {
            sum += i; // sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        b_variable_length_arguments obj = new b_variable_length_arguments();

        int sum1 = obj.sumNum(10);
        System.out.println("The number is : " + sum1);

        int sum2 = obj.sumNum(10, 20);
        System.out.println("The sum of two integers : " + sum2);

        int sum3 = obj.sumNum(10, 20, 30);
        System.out.println("The sum of three integers : " + sum3);

        int sum4 = obj.sumNum(10, 20, 30, 40);
        System.out.println("The sum of four integers : " + sum4);
    }
}
