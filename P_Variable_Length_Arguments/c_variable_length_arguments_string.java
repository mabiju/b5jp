package p_variable_length_arguments;

public class c_variable_length_arguments_string {
    // public void displayNames(String... strs){
    public static void displayNames(String... strs){
        System.out.println("\n\nThe number of arguments passed : " + strs.length);
        System.out.print("The values are:");
        for (String name : strs) {
            System.out.print(name + "\t");
        }
    }
    public static void main(String[] args) {
        /* c_variable_length_arguments_string obj = new c_variable_length_arguments_string();
        obj.displayNames();
        obj.displayNames("Ram");
        obj.displayNames("Jack", "Kate");
        obj.displayNames("Hari","Gita","Nita");
        obj.displayNames("Fulmati","Ritumati", "Saraswati", "Harikala");
        obj.displayNames("Rose", "Katherine", "Bellie"); */
        displayNames();
        displayNames("Ram");
        displayNames("Jack", "Kate");
        displayNames("Hari","Gita","Nita");
        displayNames("Fulmati","Ritumati", "Saraswati", "Harikala");
        displayNames("Rose", "Katherine", "Bellie");
    }
}
