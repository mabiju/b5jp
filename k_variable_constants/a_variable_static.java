package k_variable_constants;

class Student
{
    static  int clzId = 27;
    int roll;
    String name;

    public void inputDetalis(int r, String n)
    {
        roll = r;
        name = n;
    }
    public void displayDetails()
    {
        System.out.println("\nRoll number = " + roll);
        System.out.println("College id = " + clzId);
        System.out.println("Name = " + name);
    }
}

public class a_variable_static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetalis(12,"Ram Thapa");
        s1.displayDetails();

        Student.clzId = 56;
        
        Student s2 = new Student();
        s2.inputDetalis(14,"Sita Nepal");
        s2.displayDetails();
    }
}
