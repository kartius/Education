package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RunTrader {
    public RunTrader() {
    }

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
        List<Dish> dishes = Arrays.asList(new Dish(23, "Chicken", false), new Dish(12, "Salad", true), new Dish(6, "Tomato", true), new Dish(56, "Pork", false));
        List<Transaction> collect = (List)transactions.stream().filter((t) -> {
            return t.getYear() == 2011;
        }).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = (List)transactions.stream().map((t) -> {
            return t.getTrader().getCity();
        }).distinct().collect(Collectors.toList());
        System.out.println(collect1);
        List<Trader> collect2 = (List)transactions.stream().map((t) -> {
            return t.getTrader();
        }).filter((t) -> {
            return t.getCity().equals("Cambridge");
        }).sorted(Comparator.comparing(Trader::getName)).distinct().collect(Collectors.toList());
        System.out.println(collect2);
        String collect3 = (String)transactions.stream().map((t) -> {
            return t.getTrader();
        }).sorted(Comparator.comparing(Trader::getName)).distinct().map((t) -> {
            return t.getName();
        }).reduce("", (s, s2) -> {
            return s + s2;
        });
        System.out.println(collect3);
        boolean milan = transactions.stream().map((t) -> {
            return t.getTrader();
        }).anyMatch((t) -> {
            return t.getCity().equals("Milan");
        });
        System.out.println(milan);
        List<Integer> cambridge = (List)transactions.stream().filter((t) -> {
            return t.getTrader().getCity().equals("Cambridge");
        }).map((t) -> {
            return t.getValue();
        }).collect(Collectors.toList());
        System.out.println(cambridge);
        Optional<Transaction> max = transactions.stream().max(Comparator.comparing(Transaction::getValue));
        System.out.println(((Transaction)max.get()).getValue());
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));
        System.out.println(((Transaction)min.get()).getValue());
        Map<Trader, List<Transaction>> collect4 = (Map)transactions.stream().collect(Collectors.groupingBy(Transaction::getTrader));
        System.out.println(collect4);
        Map<Boolean, List<Dish>> collect5 = (Map)dishes.stream().collect(Collectors.partitioningBy(Dish::isVegeterian));
        System.out.println(collect5);
    }
}
