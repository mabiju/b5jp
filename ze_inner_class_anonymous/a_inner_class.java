package ze_inner_class_anonymous;

class outerclass {
    int a = 25;

    class innerclass {
        public int iMethod() {
            return a;
        }
    }
}

public class a_inner_class {

    public static void main(String[] args) {
        outerclass outerobj = new outerclass();
        outerclass.innerclass innerobj = outerobj.new innerclass();
        System.out.println(innerobj.iMethod());
    }

}
