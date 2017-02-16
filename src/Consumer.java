import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumer {
    private AtomicInteger sum = new AtomicInteger(0);
    private AtomicBoolean lockCub = new AtomicBoolean(true);
    private AtomicBoolean lockQuad = new AtomicBoolean(true);
    private AtomicBoolean lockSimp = new AtomicBoolean(true);

    public void message(int cub, int quad, int pros) {

        if (cub != 0) {
            while (lockCub.compareAndSet(true, false)) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + " sum = " + sum.addAndGet(cub));
            lockCub.set(true);
        } else if (quad != 0) {
            while (lockQuad.compareAndSet(true, false)) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + " sum = " + sum.addAndGet(quad));
            lockQuad.set(true);
        } else if (pros != 0) {
            while (lockSimp.compareAndSet(true, false)) {
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName() + " sum = " + sum.addAndGet(pros));
            lockSimp.set(true);
        }
    }

    public int getSum() {
        return sum.get();
    }
}
