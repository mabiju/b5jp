package n_static_fields_method;

public class d_static_method {
    // static variables
    static int clzId = 67;
    static String clzName = "Sanothimi";

    // static method
    static void displayCollegeDetails() {
        System.out.println("\nCollege ID = " + clzId);
        System.out.println("College Name = " + clzName);
    }

    // instance method
    void displayCollegeInfo() {
        displayCollegeDetails();
    }

    public static void main(String[] args) {
        displayCollegeDetails();
        d_static_method obj = new d_static_method();
        obj.displayCollegeInfo();
    }
}
