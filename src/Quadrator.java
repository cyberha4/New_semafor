/**
 * Created by Хидир on 16.02.2017.
 */
public class Quadrator implements Runnable{
    private int[] ints;
    private Consumer consumer;

    public Quadrator(int[] ints, Consumer consumer) {
        this.ints = ints;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        for (int i : ints) {
            int qv = i*i;
            consumer.message(0, qv, 0);
        }
    }
}
