public class A extends Thread {
    private int i;
    public A(int i) {
        super("A");
        this.i = i;
    }

    @Override
    synchronized public void run() {
        FizzBuzz.fizz(i);
    }
}
