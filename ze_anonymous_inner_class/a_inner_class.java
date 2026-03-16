package ze_anonymous_inner_class;

class outerClass {
    int a = 90;

    class innerClass {
        public int iMethod() {
            return a;
        }
    }
}

public class a_inner_class {
    public static void main(String[] args) {
        outerClass outerobj = new outerClass();
        outerClass.innerClass innerobj = outerobj.new innerClass();
        System.out.println("Returned value = " + innerobj.iMethod());
    }
}
