import java.util.concurrent.Exchanger;

public class TwoStreams {
    private static long beginTime = 0;
    private static int kolSek = 3;

    public static void main(String[] args) {
        beginTime = System.nanoTime();
        System.out.println("Это главный поток " + Thread.currentThread().getName());
        Exchanger<Long> exchanger = new Exchanger<>();

        TimeFromBegin timeFromBegin = new TimeFromBegin(beginTime, exchanger);
        timeFromBegin.start();

        EveryFiveSeconds everyFiveSeconds = new EveryFiveSeconds(kolSek, beginTime, exchanger);
        everyFiveSeconds.start();

    }
}
