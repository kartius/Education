package asynchron;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AsynTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AsynTest asynTest = new AsynTest();
        Future<Double> test = asynTest.getPriceAsync();
        System.out.println(test.isDone());
        Future<Double> priceAsyncSupplier = asynTest.getPriceAsyncSupplier();
        System.out.println(priceAsyncSupplier.isDone());
        System.out.println(priceAsyncSupplier.get());
    }

//1
    public Future<Double> getPriceAsync() {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread(() -> {
            double price = calculatePrice();
            futurePrice.complete(price);
        }).start();
        return futurePrice;
    }
//2
    public Future<Double> getPriceAsyncSupplier() {
        return CompletableFuture.supplyAsync(() -> calculatePrice());
    }


    private double calculatePrice() {
        delay();
        return 34;
    }


    public static void delay() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
