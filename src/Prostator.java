/**
 * Created by Хидир on 16.02.2017.
 */

public class Prostator implements Runnable{
    private int[] ints;
    private Consumer consumer;

    public Prostator(int[] ints, Consumer consumer) {
        this.ints = ints;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        for (int i : ints) {
            int pr = i ;
            consumer.message(0, 0, pr);
        }
    }
}
