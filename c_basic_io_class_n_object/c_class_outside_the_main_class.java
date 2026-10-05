package c_basic_io_class_n_object;

class Student{
    int roll = 89;
    String name = "Ram Thapa";
}

public class c_class_outside_the_main_class {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll number = " + s1.roll);
        System.out.println("Name = " + s1.name);

    }
}
