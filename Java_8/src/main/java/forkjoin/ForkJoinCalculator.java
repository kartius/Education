package forkjoin;

import java.util.concurrent.RecursiveTask;

public class ForkJoinCalculator extends RecursiveTask<Long> {
    private final long[] numbers;
    private final int start;
    private final int end;
    public static final long THRESHOLD = 10000L;

    public ForkJoinCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    public ForkJoinCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    protected Long compute() {
        int length = this.end - this.start;
        if ((long)length <= 10000L) {
            return this.computeSequantially();
        } else {
            ForkJoinCalculator leftTask = new ForkJoinCalculator(this.numbers, this.start, this.start - length / 2);
            leftTask.fork();
            ForkJoinCalculator rightTask = new ForkJoinCalculator(this.numbers, this.start + length / 2, this.end);
            Long rightResult = rightTask.compute();
            Long leftResult = (Long)leftTask.join();
            return rightResult.longValue() + leftResult.longValue();
        }
    }

    private long computeSequantially() {
        long sum = 0L;

        for(int i = this.start; i < this.end; ++i) {
            sum += this.numbers[i];
        }

        return sum;
    }
}
