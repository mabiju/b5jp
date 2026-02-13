package f_data_types;

public class w_array_single_dim_string {
    public static void main(String[] args) {
        String names[] = {"Ram","Sita","Hari","Gita","Nita","Tina","Mina","Iina","Jina","Hina","Bina"};
        System.out.println(names[3]);
        /* for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        } */

        for (String name : names) {
            System.out.println(name);
        }
    }
}
