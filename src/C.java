public class C extends Thread {
    private int i;
    public C(int i) {
        super("C");
        this.i = i;
    }

    @Override
    synchronized public void run() {
            FizzBuzz.fizzbuzz(i);
    }
}
