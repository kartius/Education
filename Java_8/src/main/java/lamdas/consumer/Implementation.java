package lamdas.consumer;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Implementation {
    public Implementation() {
    }

    public <T> void foreach(List<T> list, TestConsumerI<T> testConsumerI) {
        Iterator var3 = list.iterator();

        while(var3.hasNext()) {
            T t = (T) var3.next();
            testConsumerI.accept(t);
        }

    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.foreach(Arrays.asList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5)), (i) -> {
            if (i.intValue() == 5) {
                System.out.println(i);
            }

        });
    }
}
