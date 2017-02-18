/**
 * Created by Хидир on 16.02.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * dasdfsdfsdfsdfsdf
         */
        Consumer consumer =  new Consumer();
        int[] ints = {1, 2, 3};
        Thread[] threads = new Thread[6];
        threads[0] = new Thread(new Cube(ints, consumer));
        threads[0].setName("qubator");
        threads[1] = new Thread(new Cube(ints, consumer));
        threads[1].setName("qubator2");
        threads[2] = new Thread(new Quadrator(ints, consumer));
        threads[2].setName("qvadrator");
        threads[3] = new Thread(new Quadrator(ints, consumer));
        threads[3].setName("qvadrator2");
        threads[4] = new Thread(new Prostator(ints, consumer));
        threads[4].setName("prostator");
        threads[5] = new Thread(new Prostator(ints, consumer));
        threads[5].setName("prostator");

        for (Thread th:threads) {
            th.start();
        }

        for (Thread th:threads) {
            th.join();
        }


        System.out.println("Result: " + consumer.getSum());
    }

}
