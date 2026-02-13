package i_constructors;

class Teacher {
    int tid;

    public Teacher(int a) {
        tid = a;
        System.out.println("Teacher id = " + tid);
    }
}

public class d_paremeterized_constructor {
    public static void main(String[] args) {
        new Teacher(23);
    }
}
