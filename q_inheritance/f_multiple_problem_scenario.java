package q_inheritance;

class Buwa{
    void hi()
    {
        System.out.println("Hi Child");
    }
}

class Muwa{
    void hello()
    {
        System.out.println("Hello Child");
    }
}

// class Child extends Buwa, Muwa{
class Bachcha extends Buwa{
    void greetings(){
        System.out.println("Namaste ! my parents");
    }
}

public class f_multiple_problem_scenario {
    public static void main(String[] args) {
        Bachcha c1 = new Bachcha();
        c1.greetings();
        // c1.hi();
        // c1.hello();
    }
}
