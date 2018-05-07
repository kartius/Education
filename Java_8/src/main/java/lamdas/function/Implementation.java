package lamdas.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Implementation {
    public Implementation() {
    }

    public <T, R> List<R> map(List<T> list, TestFunctionI<T, R> f) {
        List<R> result = new ArrayList();
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            T t = (T) var4.next();
            result.add(f.apply(t));
        }

        return result;
    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        List<Integer> listResult = implementation.map(Arrays.asList("lamda", "in", "action"), (s) -> {
            return s.length();
        });
        Iterator var3 = listResult.iterator();

        while(var3.hasNext()) {
            Integer integer = (Integer)var3.next();
            System.out.println(integer);
        }

    }
}
