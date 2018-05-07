package lamdas.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Implementation {
    public Implementation() {
    }

    public <T> void testImpl(Predicate<T> tTestPredicateI, T t) {
        if (tTestPredicateI.test(t)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void main(String[] args) {
        Implementation impl = new Implementation();
        Predicate<String> filterOne = (s) -> {
            return s.equals("qwerty");
        };
        impl.testImpl(filterOne, "qwerty");
        Predicate<ArrayList> filterTwo = (ar) -> {
            return ar.isEmpty();
        };
        impl.testImpl(filterTwo, new ArrayList());
    }
}
