package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreams {
    public TestStreams() {
    }

    public static void main(String[] args) {
        TestContainer testContainer = new TestContainer();
        testContainer.setId(Integer.valueOf(12));
        testContainer.setName("test1");
        testContainer.setDescription("descr1");
        TestContainer testContainer1 = new TestContainer();
        testContainer1.setId(Integer.valueOf(122));
        testContainer1.setName("test12");
        testContainer1.setDescription("descr12");
        TestContainer testContainer2 = new TestContainer();
        testContainer2.setId(Integer.valueOf(1224));
        testContainer2.setName("test124");
        testContainer2.setDescription("descr124");
        List<TestContainer> testContainerList = new ArrayList();
        testContainerList.add(testContainer);
        testContainerList.add(testContainer1);
        testContainerList.add(testContainer2);
        testContainerList.stream().filter((t) -> {
            return t.getId().intValue() < 123;
        }).filter((t) -> {
            return t.getName().equals("test12");
        }).forEach((t) -> {
            System.out.println(t.getDescription());
        });
        testContainerList.stream().map((t) -> {
            return t.getName();
        }).forEach((t) -> {
            System.out.println(t);
        });
        List<String> collect = (List)testContainerList.stream().map((t) -> {
            return t.getName();
        }).collect(Collectors.toList());
        Iterator var6 = collect.iterator();

        while(var6.hasNext()) {
            String s = (String)var6.next();
            System.out.println(s);
        }

        List<Integer> numbers1 = Arrays.asList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
        List<Integer> numbers2 = Arrays.asList(Integer.valueOf(3), Integer.valueOf(4));
        List<int[]> pairs1 = new ArrayList();
        Iterator var9 = numbers1.iterator();

        int anInt;
        while(var9.hasNext()) {
            Integer integer = (Integer)var9.next();
            int i = integer.intValue();
            Iterator var12 = numbers2.iterator();

            while(var12.hasNext()) {
                Integer integer1 = (Integer)var12.next();
                anInt = integer1.intValue();
                int[] array = new int[]{i, anInt};
                pairs1.add(array);
            }
        }

        var9 = pairs1.iterator();

        int[] pair;
        int var24;
        while(var9.hasNext()) {
            int[] ints = (int[])var9.next();
            pair = ints;
            int var22 = ints.length;

            for(var24 = 0; var24 < var22; ++var24) {
                anInt = pair[var24];
                System.out.println(anInt);
            }
        }

        System.out.println("-------------------------------");
        List<int[]> pairs = (List)numbers1.stream().flatMap((ix) -> {
            return numbers2.stream().filter((j) -> {
                return (ix.intValue() + j.intValue()) % 3 == 0;
            }).map((j) -> {
                return new int[]{ix.intValue(), j.intValue()};
            });
        }).collect(Collectors.toList());
        Iterator var20 = pairs.iterator();

        while(var20.hasNext()) {
            pair = (int[])var20.next();
            int[] var23 = pair;
            var24 = pair.length;

            for(anInt = 0; anInt < var24; ++anInt) {
                int i = var23[anInt];
                System.out.println(i);
            }
        }

    }
}
