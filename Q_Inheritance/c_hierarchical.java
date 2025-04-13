package q_inheritance;

class Vehicle{
    void accelerate(){
        System.out.println("I am moving towards my destination.");
    }
}

class Aeroplane extends Vehicle{
    void fly(){
        System.out.println("I am flying....");
    }
}

class Motorbike extends Vehicle{
    void run(){
        System.out.println("I am running....");
    }
}

public class c_hierarchical {
    public static void main(String[] args) {
        Aeroplane Boeing474 = new Aeroplane();
        Boeing474.accelerate(); // accesing super class method
        Boeing474.fly(); // accesing own method
        // Boeing474.run(); // error

        Motorbike KawasakiNinja = new Motorbike();
        KawasakiNinja.accelerate(); // accessing super class method
        KawasakiNinja.run(); // accessing own method
        // KawasakiNinja.fly(); // error
    }
}
