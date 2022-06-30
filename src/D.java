public class D extends Thread {
    private int i;
    public D(int i) {
        super("D");
        this.i = i;
    }

    @Override
    synchronized public void run() {
            FizzBuzz.number(i);
    }
}
