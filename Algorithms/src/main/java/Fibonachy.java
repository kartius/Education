

public class Fibonachy {

    public static void main(String[] args) {
           Fibonachy fibonachy = new Fibonachy();
           fibonachy.calculateFibonachy(5);
    }

    public void calculateFibonachy(int n) {
        int[] fibonachy = new int[n];
        fibonachy[0] = 0;
        fibonachy[1] = 1;
        for (int i = 2; i < fibonachy.length; i++) {
            fibonachy[i] = fibonachy[i - 1] + fibonachy[i - 2];
        }
        for (long i : fibonachy) {
            System.out.println(i);
        }
    }


}
