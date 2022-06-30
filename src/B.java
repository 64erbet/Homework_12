public class B extends Thread {
    private int i;
    public B(int i) {
        super("B");
        this.i = i;
    }

    @Override
    synchronized public void run() {
        FizzBuzz.buzz(i);
    }
}
