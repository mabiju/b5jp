package w_access_specifier.package_two;

import w_access_specifier.package_one.a_protected_method;

public class b_protected_method_implementation extends a_protected_method {
    public static void main(String[] args) {
        b_protected_method_implementation obj = new b_protected_method_implementation();
        obj.hello();
    }
}
