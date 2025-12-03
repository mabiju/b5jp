package f_data_types;

public class a_check_data_types {
    public static void main(String[] args) {
        int i = 10;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        String s = "Sanothimi";
        System.out.println("Data Type: " + Integer.valueOf(i).getClass().getSimpleName());
        System.out.println("Data Type: " + Float.valueOf(f).getClass().getSimpleName());
        System.out.println("Data Type: " + Double.valueOf(d).getClass().getSimpleName());
        System.out.println("Data Type: " + Character.valueOf(c).getClass().getSimpleName());
        System.out.println("Data Type: " + s.getClass().getSimpleName());
    }
}
